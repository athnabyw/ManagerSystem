package com.byw.mapper;

import com.byw.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/14 下午 3:36
 * Version: 0.0.1
 * Modified By:
 */
@Repository
@Mapper
public interface EmployeeMapper {


    //查询所有的员工
    public List<Employee> getAllEmployee();

    //增加员工
    public void addEmployee(Employee employee);

    //删除一个员工
    public void deleteEmployeeById(Integer id);

    //查询一个员工
    public Employee queryById(Integer id);

    //修改一个员工
    public void updateEmployee(Employee employee);
}
