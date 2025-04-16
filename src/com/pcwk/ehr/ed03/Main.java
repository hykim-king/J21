/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed03;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {


	public static void main(String[] args) {

		//이름순 오름차순(가나다순)
		TreeSet<Student> treeSet=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				System.out.println(o1.getName().compareTo(o2.getName()));
				//이름순 오름차순(가나다순)
				//return o1.getName().compareTo(o2.getName()) ;
				//점수 내림차순
				return o1.getScore() - o2.getScore();
			}
			
		});
		
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
