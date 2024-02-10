// package com.ovs;

// import static org.testng.Assert.assertEquals;

// import java.util.ArrayList;
// import java.util.List;

// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.ovs.bean.Elections;
// import com.ovs.bean.Login;
// import com.ovs.bean.Party;
// import com.ovs.bean.User;
// import com.ovs.controller.ElectionsController;
// import com.ovs.service.ElectionsService;
// import com.ovs.service.LoginService;
// import com.ovs.service.PartyService;
// import com.ovs.service.PollingService;
// import com.ovs.service.userService;

// @SpringBootTest

// class SbOvsApplicationTests {

// 	@Autowired
// 	ElectionsService eservice;

// 	@Autowired
// 	LoginService lservice;

// 	@Autowired
// 	PartyService pservice;

// 	@Autowired
// 	PollingService poservice;

// 	@Autowired
// 	userService uservice;

// 	boolean res;
// 	boolean val;
// 	List<User> list = new ArrayList<>();
// 	List<User> list1 = new ArrayList<>();
// 	List<Party> list2 = new ArrayList<>();
// 	List<Party> list3 = new ArrayList<>();
// 	List<Party> list4 = new ArrayList<>();
// 	List<Party> list5 = new ArrayList<>();
// 	User ur = new User((long) 105, "Suve", "suve@gmail.com", "GH757J7F", 21, "7010866068", "User", "12345");
// 	User ad = new User((long) 102, "Swee", "swetha@gmail.com", "AVH8979", 29, "8964321558", "admin", "123");
// 	User ur1 = new User((long) 101, "Shiva", "User", "Madurai", 98, "shiva@123", "huw", "hu34hi");
// 	User ur2 = new User((long) 104, "bjghj", "fbewv", "hello", 98, "shiva@123", "huw", "abc345");


// 	@Test
// 	@Order(1)
// 	void performUserLogin() {
// 		Login rs = lservice.login(ur);
// 		ur.equals(rs);
// 	}

// 	@Test
// 	@Order(2)
// 	void performAdminLogin() {
// 		Login rs = lservice.login(ad);
// 		ad.equals(rs);
// 	}

// 	@Test
// 	@Order(3)
// 	void performLoginFail() {
// 		Login rs = lservice.login(ur2);
// 		ur2.equals(rs);
// 	}


// }
