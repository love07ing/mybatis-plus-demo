package com.example.demo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.entity.Demo;
import com.example.demo.mapper.DemoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemoServiceImpl extends ServiceImpl<DemoMapper,Demo> implements DemoService {
}
