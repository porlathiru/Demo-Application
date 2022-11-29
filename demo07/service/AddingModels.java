package com.demo07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo07.model.DemoModel_1;
import com.demo07.model.DemoUser;
import com.demo07.repository.DemoModelRepository;
import com.demo07.repository.DemoRepository;

@Service
public class AddingModels {
	@Autowired
	private DemoModelRepository demoModelRepository;
	
	@Autowired
	private DemoRepository demoRepository;
	
	public String addModels(DemoModel_1 dm,long skey,String email) {
//		return ResponseEntity.status(200).body(demoModelRepository.save(dm));
		DemoUser user=demoRepository.getByEmail(email);
		if(user!=null)
		{
			if(skey==user.getSkey())
			{
				demoModelRepository.save(dm);
				return "Models added successfully";
			}
			else
				return "Session expired";
		}
		else 
			return "DemoUser does not exist";
	}

}
