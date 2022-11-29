package com.demo07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo07.model.DemoUser;

@Repository
public interface DemoRepository extends JpaRepository<DemoUser, Integer>{
	
	public DemoUser getByEmail(String email);
	public DemoUser getByName(String name);

}
