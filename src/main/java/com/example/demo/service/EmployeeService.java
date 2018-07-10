package com.example.demo.service;

import com.example.demo.bo.EmployeeBO;
import com.example.demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<EmployeeBO> listEmployee(){
        return employeeDao.listEmployee();
    }

    public EmployeeBO getEmployee(){
        return employeeDao.getEmployee(30);
    }
}
