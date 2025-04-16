/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex10;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		TreeSet<Student>  treeSet=new TreeSet<Student>();
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		
		
		Student student = treeSet.last();
		System.out.println("최고점수:"+student.getScore());
		System.out.println("최고점수 받은 ID:"+student.getId());
	}

}
