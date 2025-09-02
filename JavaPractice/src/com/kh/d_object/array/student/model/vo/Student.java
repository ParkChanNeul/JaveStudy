package com.kh.d_object.array.student.model.vo;

public class Student {

	/*
	 * ------ 필드부 ------
	 * 
	 * name : String	// 이름
	 * subject : String // 과목
	 * score : int		// 점수 
	 * 
	 * 접근제한자 : private
	 * 
	 */
	
	private String name;
	private String subject;
	private int score;
	
	/*
	 * ------ 생성자부 ------
	 * 
	 * Student()
	 * Student(name:String, subject:String, score:int)
	 *  
	 * 접근제한자 : public
	 *  
	 */
	
	public Student() {}
	public Student(String name, String subject, int score) {}
	
	/*
	 * ------ 메소드부 ------
	 * 
	 * setter() / getter()
	 * inform() : String
	 * 
	 * 접근제한자 : public
	 * 
	 */
	
	public void inform() {
		System.out.printf("%s / %s / %d\n"
							, "이름 : "+ name,  " / 과목 : " + subject, "/ 점수 : " + score );		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}