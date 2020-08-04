package com.softserve.edu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class HandlerException {
    @ExceptionHandler(MyCustomException.class)
    public ModelAndView handleMyCustomException(MyCustomException exception){
        ModelAndView model = new ModelAndView("error_page");
        model.addObject("info", exception.getMessage());
        model.setStatus(HttpStatus.BAD_REQUEST);
        return model;
    }
}
