package com.byw.service;

import com.byw.mapper.EmployeeMapper;
import com.byw.pojo.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/14 下午 4:02
 * Version: 0.0.1
 * Modified By:
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    //查询所有的员工
    public List<Employee> getAllEmployee() {
        logger.info("---查询所有用户");
        List<Employee> employees = employeeMapper.getAllEmployee();
        System.out.println("查询所有员工 ->");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return employees;
    }

    //增加一个员工
    public void addEmployee(Employee employee) {
        System.out.println("增加一个员工 ->" + employee);
        employeeMapper.addEmployee(employee);
    }

    //删除一个员工
    public void deleteEmployeeById(Integer id) {
        System.out.println("删除一个员工 -> id=" + id);
        employeeMapper.deleteEmployeeById(id);
    }

    //查询一个员工
    public Employee queryById(Integer id){
        Employee employee = employeeMapper.queryById(id);
        System.out.println("查询一个员工 -> "+ employee);
        return employee;
    }

    //修改一个员工
    public void updateEmployee(Employee employee){
        employeeMapper.updateEmployee(employee);
        System.out.println("已修改 " + employee.getId() + " 员工信息");
    }

}
