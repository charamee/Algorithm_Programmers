package com.day1;

import java.util.ArrayList;

public class samenum {
	
	public static void main(String[] args) {
		int [] arr = {1,1,3,3,0,1,1};
		samenum samenum = new samenum(); 
		System.out.println(samenum.solution(arr));
	}
	
	    public int[] solution(int []arr) {
	    	int[] answer;
	        
	        
	    	ArrayList<Integer> arraylist = new ArrayList<Integer>(); 
	        
	        arraylist.add(arr[0]);
	        System.out.println(arraylist);
	        for(int i=0 ; i<arr.length-1; i++){
	            if(arr[i] != arr[i+1]){
	                arraylist.add(arr[i+1]);
	                System.out.println(arraylist);
	            }
	        }    
	        
	        answer = new int[arraylist.size()];
	        for(int i=0; i<arraylist.size();i++) {
	        	answer[i] = arraylist.get(i);
	        }
	           
	        return answer;
	    }
	}


