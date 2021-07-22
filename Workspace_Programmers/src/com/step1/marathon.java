package com.day1;


import java.util.Arrays;

public class marathon {
	public String solution(String[] participant, String[] completion) {
        int i; 
        
        Arrays.sort(participant); //참가자
        Arrays.sort(completion); //완주한 사람 
        
        for(i=0; i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        
         return participant[i];
    }
	
	
	
	
	
	
}
