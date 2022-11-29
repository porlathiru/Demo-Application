package com.demo07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo07.model.DemoModel_1;
import com.demo07.model.DemoUser;
import com.demo07.service.AddingModels;
import com.demo07.service.DemoLogin;
import com.demo07.service.DemoSignup;

@RestController
public class DemoController {

	@Autowired
	private DemoSignup demoSignup;
	@RequestMapping("/signup")
	public ResponseEntity<List<Object>> signUp(@RequestBody DemoUser d) {
		
		return demoSignup.signup(d);
	}
	
	@Autowired
	private DemoLogin demoLogin;
	@RequestMapping("/login")
	public List<Object> login(@RequestHeader("email") String email,@RequestHeader("password")String password) {
		
		return demoLogin.login(email, password);
	}
	
	@Autowired
	private AddingModels addingModels;
	@RequestMapping("/login/addmodels1")
	public String models(@RequestBody DemoModel_1 dm,@RequestHeader long skey,@RequestHeader String email) {
		return addingModels.addModels(dm, skey, email);
	}
}
