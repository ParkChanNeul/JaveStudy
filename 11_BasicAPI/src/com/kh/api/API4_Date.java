package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class API4_Date {

	public static void main(String[] args) {
		// java.util.Date 클래스
		// * 날짜, 시간 관련 클래스
		
		Date date = new Date(); 
		
		System.out.println(date);
		// => 현재 날짜, 시간
		
		// * 특정일에 대한 데이터로 생성
		//   new Date(연도, 월, 일)
		//   - 연도 : 지정연도-1900
		//   - 월   : 지정월-1
		
		// 개강일로 지정하여 생성 (2025년 8월 19일)
		// Date date2 = new Date(2025, 8, 19);
		Date date2 = new Date(2025-1900, 8-1, 19);
		System.out.println(date2);
		
		// * 형식을 지정하는 클래스 : java.text.SimpleDateFormat
		
		// 형식 정의
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println( sdf.format(date) );
		
		// ----------------------------------
		
		// java.time.LocalDateTime 
		LocalDateTime date3 = LocalDateTime.now();
		// * LocalDateTime.now() : 현재 날짜 시간 기준으로 생성
		System.out.println(date3);
		
		// 월 정보만 반환 : getMonth, getMonthValue
		System.out.println( date3.getMonth() );		  // 영어로 반환
		System.out.println( date3.getMonthValue() );  // 숫자로 반환
		
		// 일 정보 반환 : getDayOfMonth, getDayOfYear
		System.out.println( date3.getDayOfMonth() );  // 월 기준 일 반환
		System.out.println( date3.getDayOfYear() );	  // 연 기준 일 반환
		
		// 올해 며칠 남았는 지..?
		System.out.println("올해는 ... " + (365 - date3.getDayOfYear())
							+ "일 남았습니다.");
		
		// * 시 정보 반환 : getHour
		System.out.println(date3.getHour());	// 24시간제 기준
		
		// * 퇴근까지 얼마나 남았는지? -> 18시
		System.out.println("퇴근까지.." + (18 - date3.getHour())
								+ "시간 남았습니다.");
		
		// * 형식 지정하기
		//   java.time.format.DateTimeFormatter
		
		String format2 = date3.format(
						DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")
						);
		System.out.println(format2);
	}

}




