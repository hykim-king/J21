/**
 * 파일명:Student.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex10;

/**
 * 
 */
public class Student implements Comparable<Student> {

	private String id;
	private int    score;
	/**
	 * @param id
	 * @param score
	 */
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	@Override
	public int compareTo(Student o) {
		if(this.score<o.score) {//내림차순
			return -1;
		}else if(this.score == o.score) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	
}
