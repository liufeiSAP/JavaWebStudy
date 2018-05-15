package com.study.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.demo.domain.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class JsonController {

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String addStudent(@RequestBody Student record) {
        return "ok";
    }

    @RequestMapping(value = "/student1", method = RequestMethod.POST)
    public String addStudent1(HttpServletRequest rquests) throws IOException {
        ServletInputStream aaa = rquests.getInputStream();

        return "ok";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudent() {

        return "ok";
    }
}
