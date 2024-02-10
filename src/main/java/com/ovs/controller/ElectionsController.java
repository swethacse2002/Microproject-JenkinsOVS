package com.ovs.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ovs.bean.Elections;
import com.ovs.service.ElectionsService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ElectionsController {

	@Autowired
	ElectionsService service;

	@PostMapping("/InsertElections")
	public String performElection(@RequestBody Elections elections) {
		service.Insert(elections);
		return "Election Inserted successfully";
	}

	@PutMapping("/UpdateElections")
	public String ElectionUpdates(@RequestBody Elections elections) {
		service.updateElections(elections);
		return "Election updated successfully";
	}

	@DeleteMapping("/DeleteElections/{electionId}")
	public String performDelete(@PathVariable("electionId") Long electionId) {
		service.deleteElections(electionId);
		return "Record deleted";
	}

	@GetMapping("/ViewAllElections")
	public List<Elections> getAll() {
		Iterator<Elections> it = service.getAll().iterator();
		List<Elections> list = new ArrayList<Elections>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
