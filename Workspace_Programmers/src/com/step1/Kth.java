package com.day1;

import java.util.Arrays;
import java.util.Set;

public class Kth {

	public int[] solution(int[] array, int[][] commands) {
       
        
        int[] answer = new int [commands.length];
        System.out.println(answer);
        
        for( int i=0; i<commands.length;i++){
            int [] temp = null; 
            temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2]-1];
            
            System.out.println(temp[commands[i][2]-1]);
        }
        
        return answer;
    }
}
