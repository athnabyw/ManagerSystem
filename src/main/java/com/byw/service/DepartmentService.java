package com.byw.service;

import com.byw.mapper.DepartmentMapper;
import com.byw.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/14 下午 3:24
 * Version: 0.0.1
 * Modified By:
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    //查询所有的部门
    public List<Department> getAllDepartment() {

        List<Department> allDepartment = departmentMapper.getAllDepartment();
//        System.out.println("查询所有部门 -->");
//        for (Department department : allDepartment) {
//            System.out.println(department);
//        }
        return allDepartment;
    }


    //根据id查部门
    public Department getDepartmentById(Integer id) {
        Department departmentById = departmentMapper.getDepartmentById(id);
        //System.out.println("根据ID查部门 -->" + departmentById);
        return departmentById;
    }
}
