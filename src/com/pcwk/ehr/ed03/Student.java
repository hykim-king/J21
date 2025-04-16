/**
 * 파일명:Student.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed03;

/**
 * 
 */
public class Student  {

	private String name;
	private int score;

	/**
	 * @param name
	 * @param score
	 */
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
