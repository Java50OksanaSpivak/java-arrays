package telran50.arrays;

import java.util.Random;

//// class work 04
public class InterviewTasks {
	 public static boolean isSumTwo(short [] array, short sum) {
		//array of positive numbers or 0
		//{1, 2, 30, 2, 2}. sum = 4
		//helper = {false, true, true, false, false}
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
		boolean res = false;
		int index = 0;
		while(index < array.length && !res) {
			short num = (short) (sum - array[index]);
			if (num >= 0) {
				if(helper[num]) {
					res = true;
				} else {
					helper[array[index]] = true;
				}
			}
			index++;

		}
		return res;

	}
	///////////// HW 04
	public static short[] sort(short[] array) {
		//TODO
		//array - array of the positive or 0 number
		//sorting with complexity O[N]	
		short[] helper = new short[Short.MAX_VALUE + 1];
		int index = 0;
		while(index < array.length) {
			if (array[index] >= 0) {
				helper[array[index]]++; 				
			}
			index++;
		}
		short arSorted [] = new short [array.length];
		int j = 0;
		for(  index=0; index < Short.MAX_VALUE ;  )
		 {
			if(helper[index]!=0) {	
			   for (short i =1; i<=helper[index]; i++) {
				arSorted[j] = (short) index;
				j++;
			   }
			}	
			index ++;
		}
		return arSorted;
	}
	public static short [] randomMatrixShort(int length) {
		short [] arr;
		arr = new short [length];
	    for (int i = 0; i < length; i++) {
	   	 arr[i]  = (short)(Math.random() * Short.MAX_VALUE);
	    }
		return arr;
	}
	
	public static boolean isSortedShort(short [] arr) {
		boolean isSorted = true;
		for (int i = 0; i < arr.length-1; i++)
		{
			if (arr[i] > arr[i+1])
			{
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	
	public static short getMaxWithNegativePresentation(short[] array) {
		//returns maximal positive number having an negative value with the same abs value, if no such numbers returns -1
		//
		short[] helper = new short[ Short.MAX_VALUE + 1];
		short index = 0;
		short num ;
		while(index < array.length ) {
			num = array[index];
			if ( array[index] <= 0 && helper[Math.abs(num)] <= 0)		 
				helper[Math.abs(num)]=num;			
			else if ( num > 0 && helper[num] +  num == 0)				
				helper[num]=num;
			index++;
		}
		index = Short.MAX_VALUE;
		short res=-1;
		while (index >= 0 ) {
			if (helper[index]<=0)
			index --;
			else res = index;
		}
		return res;
	}
}			//num = (short) (0 - array[index]);	
						
			
		
		
	

