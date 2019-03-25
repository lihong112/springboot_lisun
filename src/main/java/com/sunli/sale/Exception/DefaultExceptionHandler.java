package com.sunli.sale.Exception;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler(UnauthorizedException.class)
    public String unauthorizedExceptionHandler(HttpServletRequest req,Exception e){
        HttpSession session = req.getSession();
        return "权限不足"+e.getMessage();
    }


    @ExceptionHandler(AuthenticationException.class)
    public String authenticationExceptionHandler(HttpServletRequest req, Exception e){
        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();

        return "请先登录"+e.getMessage();
    }

    @ExceptionHandler(BussinessException.class)
    public String bussinessExceptionHandler(HttpServletRequest req, Exception e){
        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();
        BussinessException b=(BussinessException)e;
        return b.getCode()+"    "+b.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest req, Exception e){
        e.printStackTrace();
        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();
        return "未知异常";
    }
}
