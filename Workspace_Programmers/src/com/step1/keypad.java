package com.day1;

public class keypad {
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		keypad keypad = new keypad(); 
		System.out.println(keypad.solution(numbers,hand));
		
		
	}

	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder(); 
        int left = 10; 
        int right = 12; 
        
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                sb.append("L");
                left = number; 
            }else if(number == 3 || number == 6 || number == 9){
                sb.append("R");
                right = number; 
            }else{
                int leftlength = getLength(left,number);
                int rightlength = getLength(right,number);
                
                if(leftlength > rightlength ){
                    
                    sb.append("R");
                    right = number;
                    
                }else if(leftlength < rightlength){
                    sb.append("L");
                    left = number; 
                }else { //같을때 
                    if(hand.equals("right")){
                        sb.append("R");
                        right = number;
                    }else{
                        sb.append("L");
                        left = number; 
                    }
                }
                
            }
        }
        return sb.toString();
		
	}
	
	public static int getLength(int index, int number) {
		
		index = (index==0)?11:index;
		number = (number==0)?11:number;
		
		int x = (index-1)/3;
		int y = (index-1)%3;
		int X = (number)/3;
		int Y = 1; 
		
		
		
		return Math.abs(x-X)+ Math.abs(y-Y);
		
	}

}
