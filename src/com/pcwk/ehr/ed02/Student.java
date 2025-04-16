/**
 * 파일명:Student.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed02;

/**
 * 
 */
public class Student implements Comparable<Student> {

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
	public int compareTo(Student o) {
		if(this.score<o.score) {//오름차순(작은 점수가 먼저)
			return 1;
		}else if( this.score == o.score) {
			return 0;
		}else {
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
