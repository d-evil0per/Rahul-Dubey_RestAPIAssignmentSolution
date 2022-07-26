package com.gl.rahul.service;

import java.util.List;

import com.gl.rahul.entity.EmployeeEntity;
import com.gl.rahul.entity.Role;
import com.gl.rahul.entity.User;


public interface EmployeeService {

	List<EmployeeEntity> findAll();
	
	public EmployeeEntity findById(int theId);

	public void save(EmployeeEntity employee);

	public void deleteById(int theId);
	
	public List<EmployeeEntity> sortByFirstName(String sortType);


	public List<EmployeeEntity> searchByfirstName(String firstName);

	public User saveUser(User user);

	public Role saveRole(Role role);

}
