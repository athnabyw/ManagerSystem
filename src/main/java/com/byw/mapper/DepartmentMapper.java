package com.byw.mapper;

import com.byw.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/14 下午 3:15
 * Version: 0.0.1
 * Modified By:
 */
@Mapper
@Repository
public interface DepartmentMapper {

    //查询所有的部门
     List<Department> getAllDepartment();

    //根据id查部门
     Department getDepartmentById(Integer id);
}
