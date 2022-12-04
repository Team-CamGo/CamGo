package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.ProductDTO;
import com.example.demo.mapper.ProductMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void insertProductTest() {
    	ProductDTO params = new ProductDTO();
    	params.setMember_no(1);
    	params.setName("TEST");
    	params.setPro_info_cnt(3);
    	params.setReservation_cnt(3);
    	params.setAddr11("Test");
    	params.setAddr12("test");
    	params.setPost("1234");
    	params.setSite("www.naver.com");
    	params.setStatus('A');
    }
    
    @Test
    public void getProductTest(){
    	ProductDTO params = new ProductDTO();
    	System.out.print("Test product no : " + params.getNo());
    	System.out.print("Test product name : " + params.getName());
    }
    
    @Test
    public void getProductNoTest() {
    	System.out.print("Test productNo : " + productMapper.getProductNo());
    }
}
