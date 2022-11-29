package com.demo07.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo07.model.DemoUser;
import com.demo07.repository.DemoRepository;

@Service
public class DemoSignup {
	@Autowired
	private DemoRepository demoRepository;
	
	public ResponseEntity<List<Object>> signup(DemoUser d) {
		List<Object> list =new ArrayList<>();
		
		DemoUser demoemail=demoRepository.getByEmail(d.getEmail());
		DemoUser demoname=demoRepository.getByName(d.getName());
		
		if(demoemail!=null)
		{
			list.add("email is already exist");
			return ResponseEntity.status(400).body(list);
		}else if(demoname!=null)
		{
			list.add("Name is already registered");
			return ResponseEntity.status(400).body(list);
		}
		else
		{
			demoRepository.save(d);
			list.add("Account added successfully..");
			list.add(d);
			return ResponseEntity.status(200).body(list);
		}
	}

}
