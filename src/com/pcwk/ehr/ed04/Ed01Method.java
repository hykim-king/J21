/**
 * 파일명:Ed01Method.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed04;

import java.util.*;

public class Ed01Method {

	
	public static void printNames(ArrayList<String> list) {
		for(String name :list) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("김철수");
        studentNames.add("이영희");
        studentNames.add("박민수");	
        
        printNames(studentNames);

	}

}
