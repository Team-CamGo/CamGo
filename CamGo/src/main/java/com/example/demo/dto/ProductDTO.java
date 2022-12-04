package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 파라미터 없는 기본 생성자 생성
@AllArgsConstructor // 모든 파라미터 받는 생성자 생성
@RequiredArgsConstructor // final 또는 @NonNull 필드값만 파라미터 받는 생성자 생성
@Getter
@Setter
@ToString
public class ProductDTO {
	@NonNull
	private int no;					// 상품번호

	@NonNull
	private int member_no;			// 회원번호
	
	@NonNull
	private String name;			// 상품명
	
	private int pro_info_cnt;		// 캠핑존내부 방 개수 
	
	private int reservation_cnt;	// 예약 수
	
	@NonNull
	private String addr11;			// 주소
	
	@NonNull
	private String addr12;			// 주소
	
	@NonNull
	private String post;			// 주소
	
	@NonNull
	private String site;			// 주소
	
	private char status;			// 현재 캠핑존 상태
}
