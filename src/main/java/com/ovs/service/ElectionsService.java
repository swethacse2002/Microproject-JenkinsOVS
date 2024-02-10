package com.ovs.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ovs.bean.Elections;
import com.ovs.bean.User;
import com.ovs.dao.ElectionsRepo;
import com.ovs.dao.PartyRepo;

@Service
public class ElectionsService {

	@Autowired
	ElectionsRepo repo;

	public String Insert(Elections elections) {
		repo.save(elections);
		return "Inserted";
	}

	public String updateElections(Elections elections) {
		repo.save(elections);
		return "Updated";
	}

	public String deleteElections(@PathVariable("electionId") Long electionId) {
		repo.deleteById(electionId);
		return "Election Deleted";
	}

	public List<Elections> getAll() {
		Iterator<Elections> it = repo.findAll().iterator();
		List<Elections> list = new ArrayList<Elections>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
