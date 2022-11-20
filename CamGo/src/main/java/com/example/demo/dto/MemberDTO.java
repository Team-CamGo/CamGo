package com.example.demo.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull; // Not Null
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 참고
 * vo는 read only 속성이라 dto로 설정함
 * dto는 Controller를 비롯한 여러 계층에 데이터만 전달
 * https://www.daleseo.com/lombok-popular-annotations/
 * https://linked2ev.github.io/gitlog/2019/08/25/springboot-mvc-7-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-Lombok(%EB%A1%AC%EB%B3%B5)-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0/
 * https://velog.io/@noneobj/Spring-Boot-TIL-3.-lombok-%EC%84%A4%EC%B9%98%ED%95%98%EA%B8%B0
 * https://krksap.tistory.com/1158    // LocalDateTime 관련
 */

@NoArgsConstructor // 파라미터 없는 기본 생성자 생성
@AllArgsConstructor // 모든 파라미터 받는 생성자 생성
@RequiredArgsConstructor // final 또는 @NonNull 필드값만 파라미터 받는 생성자 생성
@Getter
@Setter
@ToString
public class MemberDTO {
  @NonNull
  private int no; // 회원번호

  @NonNull
  private String email; // 이메일

  @NonNull
  private String name; // 회원명

  @NonNull
  private String phone; // 휴대폰

  @NonNull
  private char member_type; // 회원유형

  @NonNull
  private char save_status; // 저장상태

  @NonNull
  private LocalDateTime save_time; // 저장시간

  private LocalDateTime del_time; // 탈퇴시간
  private int reservation_cnt; // 예약횟수
  private char email_send; // 이메일 수신 여부
  private char sms_send; // 문자 수신 여부
  private char approval_flag; // 사업자 승인 여부
  private String corporation_no; // 사업자 번호
  private String permit; // 사용자 권한
}
