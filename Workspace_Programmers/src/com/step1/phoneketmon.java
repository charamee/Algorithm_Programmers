package com.day1;

import java.util.ArrayList;

public class phoneketmon {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 3 };

		phoneketmon phoneketmon = new phoneketmon();
		System.out.println(phoneketmon.solution(nums));

	}

	public int solution(int[] nums) {

		int n = nums.length / 2;

		ArrayList list = new ArrayList();
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]); // 중복 없이 list 에 담기
			}

		}

		int answer = n;
		if (list.size() < n) { // list 의 사이즈가 n 보다 작을경우엔 list의 크기를 출력하기 
			answer = list.size();
		}

		return answer;
	}

}
