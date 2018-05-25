package com.example.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/list")
    public Object list() {
        List<Demo> list = demoService.selectList(null);
        return list;
    }

    @GetMapping("/page")
    public Object page() {

        Page<Demo> p = new Page<Demo>();
        p = demoService.selectPage(p, new EntityWrapper<>());
        return p;
    }

    @GetMapping("/add")
    public Object add(Demo demo) {
        demoService.insert(demo);
        return demo;
    }

}
