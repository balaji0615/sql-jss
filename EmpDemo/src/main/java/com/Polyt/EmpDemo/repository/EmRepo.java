package com.Polyt.EmpDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.Polyt.EmpDemo.model.Edemo;

public interface EmRepo extends CrudRepository<Edemo,Integer> {
	

}
