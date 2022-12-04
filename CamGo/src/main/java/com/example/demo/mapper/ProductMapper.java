package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.ProductDTO;

@Mapper
public class ProductMapper {
	@Insert("insert into product(no, member_no, name, pro_info_cnt, reservation_cnt, addr11, addr12, post, site, status) "
			+ "values (product_no_seq.nextval, #{member_no}, #{name}, #{pro_info_cnt}, #{reservation_cnt}, #{addr11}, #{addr12}, #{post}, #{site}, #{status})")
	public int insertProduct(ProductDTO params) {
		return 0;
	}
	
	public List<ProductDTO> selectProductList(){
		return null;
	}
	
	@Select("select no from product")
	public int getProductNo() {
		return 0;
	}
}
