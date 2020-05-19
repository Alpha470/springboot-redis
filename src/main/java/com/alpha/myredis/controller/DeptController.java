package com.alpha.myredis.controller;


import com.alpha.myredis.bean.Department;
import com.alpha.myredis.bean.Employee;
import com.alpha.myredis.mapper.DepartmentMapper;
import com.alpha.myredis.mapper.EmployeeMapper;
import com.alpha.myredis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return deptService.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/deldept/{id}")
    public int deleteEmp(@PathVariable("id") Integer id) {
        return departmentMapper.deleteDeptById(id);
    }


}
