package com.byw.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Description：
 * Author: 百里凌
 * Date: Created in 2020/11/13 上午 10:58
 * Version: 0.0.1
 * Modified By:
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        String loginUser = (String) session.getAttribute("loginUser");
        if(loginUser == null){
            request.setAttribute("msg", "没有登录，请登录！");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }

        return true;
    }
}
