package com.byw.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/12 下午 5:33
 * Version: 0.0.1
 * Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Department department;
    private Date birthday;


}



