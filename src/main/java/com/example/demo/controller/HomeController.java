package com.example.demo.controller;

import com.example.demo.bo.EmployeeBO;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.ibatis.annotations.ResultType;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }

    @GetMapping("/json")
    public EmployeeBO json(){
        return employeeService.getEmployee();
    }
}
