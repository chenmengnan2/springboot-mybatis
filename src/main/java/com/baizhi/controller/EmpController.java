package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/con")
@RestController
public class EmpController {
    @Autowired
    private EmpService service;
    @RequestMapping("/getAll")
    public List<Emp> getAll(){
        return service.getAll();
    }
}
