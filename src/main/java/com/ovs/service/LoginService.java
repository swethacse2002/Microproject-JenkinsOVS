package com.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovs.bean.User;
import com.ovs.bean.Login;
import com.ovs.dao.UserRepo;

@Service
public class LoginService {

	@Autowired
	UserRepo repo;
	User user;
	Login login;

	public Login login(User user) {
		User emailId = repo.getByEmailId(user.getEmailId());
		User password = repo.getByPassword(user.getPassword());
		if (emailId != null && password != null) {
			String value = emailId.getPassword();
			String confirmPass = password.getPassword();
			if (value.equals(confirmPass)) {
				String userType = emailId.getUserType();
				if (userType.equalsIgnoreCase("Admin")) {
					return new Login("Admin");
				} else {
					return new Login("User");
				}
			} else {
				return new Login("Login Fail");
			}
		} else {
			return new Login("Login Fail");
		}

	}
}
