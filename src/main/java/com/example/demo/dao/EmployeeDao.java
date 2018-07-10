package com.example.demo.dao;

import com.example.demo.bo.EmployeeBO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeDao {

    EmployeeBO getEmployee(@Param("id") long employeeId);

    List<EmployeeBO> listEmployee();
}
