package com.demo07.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo07.model.DemoUser;
import com.demo07.repository.DemoRepository;

@Service
public class DemoLogin {
	
	@Autowired
	private DemoRepository demoRepository;
	
	public List<Object> login(String email, String password) {
		DemoUser u=demoRepository.getByEmail(email);
		List<Object>list=new ArrayList<>();
		if(u!=null)
		{
			if(password.equals(u.getPassword())) {
				long key=(long)(Math.random()*1000000);
				u.setSkey(key);
				demoRepository.save(u);
				list.add("Login is Successfully");
//				demoRepository.findAllById(u);
				return list;
			}
			else
			{
				list.add("Wrong Password");
				return list ;
			}
			
		}
		list.add("Account doesn't exist..Creat new Account");
		return list ;
	}

}
