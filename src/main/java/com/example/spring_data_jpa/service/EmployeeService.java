package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> getAllEmployees();

     List<Employee> findAllByName(String name);

     void saveEmployee(Employee employee);

     Employee getEmployee(int id);

     void deleteEmployee(int id);
}
