/**
 * 파일명:Ed02_Method.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ed03Method {

	public int getMaxScore(List<Integer> list) {
		int maxValue = list.get(list.size() - 1);

		return maxValue;
	}

	public static int getMinScore(List<Integer> list) {
		int minValue = list.get(0);

		return minValue;
	}

	public static double getAverage(List<Integer> list) {
		double avg = 0.0;
		int sum = 0;

		for (Integer score : list) {
			sum += score;
		}
		avg = (double) sum / list.size();

		return avg;
	}

	public static void main(String[] args) {
		Ed03Method me02 = new Ed03Method();
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(85);
		scores.add(93);
		scores.add(76);
		scores.add(100); 
		scores.add(65);
		//오름차순(65,76...100)
		Collections.sort(scores);//

		System.out.println("최고점수:" + me02.getMaxScore(scores));
		System.out.println("최저점수:" + getMinScore(scores));

		System.out.printf("평균점수:%.2f%n", getAverage(scores));

	}

}
