package com.springboot.employee_crud.service;

import com.springboot.employee_crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
