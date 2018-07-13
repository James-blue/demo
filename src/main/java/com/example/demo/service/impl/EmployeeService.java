package com.example.demo.service.impl;

import com.example.demo.bo.EmployeeBO;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<EmployeeBO> listEmployee(){
        return employeeDao.listEmployee();
    }

    @Override
    public EmployeeBO getEmployee(Long employeeId){
        return employeeDao.getEmployee(employeeId);
    }
}
