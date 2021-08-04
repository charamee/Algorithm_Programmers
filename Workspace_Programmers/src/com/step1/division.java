package com.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class division {
	
	public static void main(String[] args) {
		int [] arr = {2, 36, 1, 3};
		int divisor = 7;
		
		division division = new division(); 
		System.out.println(division.solution(arr, divisor));
		
	}
	
	public static int[] solution( int[] arr, int divisor) {
		int [] answer = {};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]); 
            }
        }
       
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        if(list.isEmpty()) {
        	answer = new int[] {-1}; 
        }
        
        for(int i : answer) {
        	System.out.println(i);
        }
        
        
		return answer; 
		
	}

}
