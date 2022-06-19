package com.example.demo;

import com.example.demo.mapper.CamgoMapper;
//import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@Slf4j
@SpringBootTest
public class MapperTest {

    @Autowired
    private CamgoMapper camgoMapper;

    @Test
    public void testGetTime() {
//        log.info("timeMapper class name: " + timeMapper.getClass().getName());
//        log.info("timeMapper time: " + timeMapper.getTime());
        
        System.out.print("Test class name : " + camgoMapper.getClass().getName());
        System.out.print("Test DB time: " + camgoMapper.getTime());
    }
}