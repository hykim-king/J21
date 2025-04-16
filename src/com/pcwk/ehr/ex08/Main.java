/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex08;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "이상무"));
		set.add(new Student(1, "김영희"));
		
		System.out.println("저장된 객체수:"+set.size());
		
		for(Student s :set) {
			System.out.println(s.getStudentNum()+":"+s.getName());
		}
	}

}
