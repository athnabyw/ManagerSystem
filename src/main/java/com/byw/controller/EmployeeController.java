package com.byw.controller;

import com.byw.pojo.Department;
import com.byw.pojo.Employee;
import com.byw.service.DepartmentService;
import com.byw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/13 下午 3:47
 * Version: 0.0.1
 * Modified By:
 */
@Controller
public class EmployeeController {

//    @Autowired
//    EmployeeDao employeeDao;
//    @Autowired
//    DepartmentDao departmentDao;

    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    //员工管理(列表)  显示所有员工
    @RequestMapping("/employees")
    public String list(Model model) {
        List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employeesList", employees);
        return "/emp/list";
    }

    //跳转  添加一个员工  页面
    @RequestMapping("/goAdd")
    public String goAdd(Model model) {
        List<Department> allDepartment = departmentService.getAllDepartment();
        model.addAttribute("allDepartment", allDepartment);
        return "/emp/add";
    }

    //添加一个员工
    @RequestMapping("/add")
    public String add(Model model, Employee newEmployee) {
        employeeService.addEmployee(newEmployee);
        return "redirect:/employees";
    }


    //跳转  修改一个员工  页面
    @RequestMapping("/goUpdate/{id}")
    public String goUpdate(Model model, @PathVariable Integer id) {
        Employee employee_old = employeeService.queryById(id);
        model.addAttribute("employee_old", employee_old);

        System.out.println("修改前的信息 -> " + employee_old);

        List<Department> allDepartment = departmentService.getAllDepartment();
        model.addAttribute("allDepartment", allDepartment);

        return "/emp/update";
    }

    //修改一个员工
    @RequestMapping("/update")
    public String update(Model model, Employee newEmployee) {
        System.out.println("修改后的信息 -> " + newEmployee);
        employeeService.updateEmployee(newEmployee);
        return "redirect:/employees";
    }

    //删除一个员工
    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable Integer id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees";
    }



}
