package com.byw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/12 下午 8:52
 * Version: 0.0.1
 * Modified By:
 */
@Controller
public class LoginController {


    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpServletRequest request) {

        System.out.println("username->" + username);
        System.out.println("password->" + password);
        System.out.println();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            model.addAttribute("msg", "用户名密码不能为空");
            return "index";
        }

        if (!"1".equals(password)) {
            model.addAttribute("msg", "密码错误");
            return "index";
        }

        HttpSession session = request.getSession();
        session.setAttribute("loginUser", username);

        //重定向一个请求   伪造一个页面视图 去视图控制器 覆盖这个视图
        return "redirect:/main.html";
    }

    //注销
    @RequestMapping("/user/loginOut")
    public String loginOut(HttpServletRequest request) {

        HttpSession session = request.getSession();
        session.removeAttribute("loginUser");
        return "redirect:/";
    }
}
