package com.kh.f_poly.controller;

import com.kh.f_poly.model.vo.*;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	// 초기화 블럭
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		/// 회원 레퍼런스(mem) 주소값 리턴 => mem필드의 getter 메소드
		return mem;	
	}

	public Book[] selectAll() {
		return bList;	
	}

	public Book[] searchBook(String keyword) {
		/*
			전달받은 키워드(매개변수)가 포함된 도서가 여러 개가 존재할 수 있으니 
			검색된 도서를 담아줄 Book 객체 배열을 새로이 생성하고
			
			for문을 통해 bList 안의 도서들의 도서명과 전달받은 키워드를 비교하여 
			포함하고 있는 경우 새로운 배열에 차곡차곡 담기
			→ 그 배열 주소 값 리턴
		 */
		Book[] searchList = new Book[bList.length];
		
		int count=0;	// 조회 결과를 담을 배열(searchList)의 인덱스

		for(int i=0; i<bList.length; i++) {	
			// 저장된 도서목록 길이만큼 반복문 수행
			if(bList[i] != null 
					&& bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
			}
		}
		
		return searchList; 
	}

	public int rentBook(int index) {
		int result = 0;
		
		if (index >= 0 && index < bList.length) {

			Book b = bList[index];
			
			if (b instanceof AniBook) {
				// 만화책을 참조하고 있고
				// 해당 만화책의 제한 나이와 
				// 			회원의 나이를 비교하여 회원 나이가 적을 경우
				if ( mem != null
						&& (((AniBook)b).getAccessAge() > mem.getAge())) {
					// result를 1로 초기화 → 나이제한으로 대여 불가
					result = 1;
				}
			} else if (b instanceof CookBook) {
				// 요리책을 참조하고 있고 
				// 해당 요리책의 쿠폰유무가 “유”일 경우
				if(mem != null
						&&((CookBook)b).isCoupon()) {
					// 회원의 couponCount 1 증가 처리 후
					//  => 기존의 couponCount 값을 조회하여 +1한 후에 
					//	   couponCount 필드에 저장!
					mem.setCouponCount( mem.getCouponCount() + 1 );
					// result를 2로 초기화 → 성공적으로 대여 완료, 요리학원 쿠폰 발급
					result = 2;
					
				}
			}
		}
		// result 값 리턴
		return result;
	}
}





