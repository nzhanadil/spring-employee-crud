package com.springboot.employee_crud.dao;

import com.springboot.employee_crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
