/**
 * 파일명:Ed02_Method.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed04;

import java.util.ArrayList;
import java.util.List;

public class Ed02Method {

	public int getMaxScore(List<Integer> list) {
		int maxValue = list.get(0);;
		for(Integer score :list) {
			if(maxValue<score) {
				maxValue = score;
			}
		}
		
		return maxValue;
	}
	
	public static int getMinScore(List<Integer> list) {
		int minValue = list.get(0);
		for(Integer score :list) {
			if(minValue>score) {
				minValue = score;
			}
		}
		
		return minValue;
	}

	
	
	
	public static void main(String[] args) {
		Ed02Method me02=new Ed02Method();
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(93);
        scores.add(76);
        scores.add(100);
        scores.add(65);
        
        System.out.println("최고점수:"+me02.getMaxScore(scores ));
        System.out.println("최저점수:"+getMinScore(scores ));

	}

}
