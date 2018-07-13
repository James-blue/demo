package com.example.demo.service;

import com.example.demo.bo.EmployeeBO;
import java.util.List;

public interface IEmployeeService {

    List<EmployeeBO> listEmployee();

    EmployeeBO getEmployee(Long employeeId);
}
