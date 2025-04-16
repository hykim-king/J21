/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed02;

import java.util.*;

public class Main {


	public static void main(String[] args) {

		TreeSet<Student> treeSet=new TreeSet<Student>();
		
		//객체저장
		treeSet.add(new Student("철수", 85));
		treeSet.add(new Student("영희", 92));
		treeSet.add(new Student("민수", 78));

		
		//전체 출력
		for(Student student   :treeSet) {
			System.out.println(student);
		}
		
		
	}

}
