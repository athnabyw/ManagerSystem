package com.byw.controller;

import com.byw.pojo.Department;

import com.byw.pojo.Employee;
import com.byw.service.DepartmentService;
import com.byw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/14 下午 3:23
 * Version: 0.0.1
 * Modified By:
 */
@RestController
public class testController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/test/test01")
    public List<Department> test01() {
        return departmentService.getAllDepartment();
    }

    @RequestMapping("/test/test02/{id}")
    public Department test02(@PathVariable Integer id) {
        return departmentService.getDepartmentById(id);
    }

    @RequestMapping("/test/test03")
    public List<Employee> test03() {
        return employeeService.getAllEmployee();
    }

    @RequestMapping("/test/test04")
    public String test04() {
        Department department = departmentService.getDepartmentById(102);
        Employee employee = new Employee(null, "TT", "54354543@QQ.COM", 1, department, new Date());
        employeeService.addEmployee(employee);
        return "SUCCESS";
    }

    @RequestMapping("/test/test05/{id}")
    public String test05(@PathVariable Integer id) {
        employeeService.deleteEmployeeById(id);
        return "SUCCESS";
    }

    @RequestMapping("/test/test06/{id}")
    public Employee test06(@PathVariable Integer id) {
        Employee employee = employeeService.queryById(id);
        return employee;
    }

}
