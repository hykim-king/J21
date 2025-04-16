/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ex09;

import java.util.*;
import java.util.Map.Entry;

public class Main {


	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		
		String name = "";
		int maxScore = 0;
		int totalScore = 0;
		//평균점수, 
		//최고점수, 최고점수를 받은 ID
		
		List<Map.Entry<String, Integer>>   list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		//sort
		list.sort(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();//내림차순
			}
		});
		
		//System.out.println(list);
		for( Map.Entry<String, Integer> entry   :list) {
			totalScore += entry.getValue();
			
			//
		}
		
		System.out.println("총합: "+totalScore);
		System.out.printf("평균: %.2f%n",(totalScore/( list.size() * 1.0)));
		Map.Entry<String, Integer> entryMax = list.get(list.size()-1);
		System.out.println("최고점수:"+entryMax.getValue());
		System.out.println("최고점수 받은ID:"+entryMax.getKey());		
		
		
	}

}
