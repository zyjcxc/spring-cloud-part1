package com.zyjcxc.spring.cloud.initstart.controller;

import com.zyjcxc.spring.cloud.initstart.model.Address;
import com.zyjcxc.spring.cloud.initstart.model.JsonTestResult;
import com.zyjcxc.spring.cloud.initstart.model.Student;
import com.zyjcxc.spring.cloud.initstart.utils.CommonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengqa
 * @create 2018-11-25 19:39
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/testJsonResult")
    public JsonTestResult testJsonResult() {
        JsonTestResult result = new JsonTestResult();
        result.setResultCode(200);
        result.setMessage("查询成功");
        result.setData("Hello world");

        return result;
    }

    @RequestMapping("/testJsonResultMore")
    public JsonTestResult testJsonResultMore() {
        JsonTestResult result = new JsonTestResult();
        Student s = CommonUtils.getTestStudentData();
        result.setResultCode(200);
        result.setMessage("查询成功");
        result.setData(s);
        return result;
    }
}

