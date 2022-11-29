package com.demo07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo07.model.DemoModel_1;
@Repository
public interface DemoModelRepository extends JpaRepository<DemoModel_1, Integer>{

}
