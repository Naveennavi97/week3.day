package week3.day1;

import java.util.Arrays;


public class findIntersection {
	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};//declare an array
		int[] num2= {1,2,8,4,9,7};//declare an second array
		for (int i = 0; i < num.length; i++) { 
			for (int j = 0; j < num2.length; j++) {
				Arrays.sort(num);
				Arrays.sort(num2);
				if(num[i]==num2[j]) {
					System.out.println(num[i]+"");
				}
			}
		}	
			
		
		
	}

}
