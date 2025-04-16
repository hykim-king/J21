/**
 * 파일명:Student.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex08;

import java.util.Objects;

/**
 * 
 */
public class Student {
	private int studentNum;
	private String name ;
	/**
	 * @param studentNum
	 * @param name
	 */
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}
	/**
	 * @return the studentNum
	 */
	public int getStudentNum() {
		return studentNum;
	}
	/**
	 * @param studentNum the studentNum to set
	 */
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
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
	
	
	
	
}
