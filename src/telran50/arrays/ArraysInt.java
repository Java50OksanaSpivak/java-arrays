package telran50.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
public static int[] addNumber(int [] array, int number){
	int[] res=Arrays.copyOf(array, array.length +1 );
	res[array.length] = number;
	return res;
}
public static int[] insertNumber(int[]array, int index, int number) {
	int [] res =new int[array.length + 1];
	System.arraycopy(array, 0, res, 0, index);
	res[index]=number;
	System.arraycopy(array, index , res, index+1, array.length-index);
	return res;
}
public static int[] removeNumber(int [] array, int index) {
	int [] res = new int[array.length - 1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index+1, res, index, res.length-index);
	return res;
}
public static int[] insertNumberSorted(int [] arraySorted,int number) {
	int pos = Arrays.binarySearch(arraySorted, number);
	pos = pos >= 0 ? pos : -(pos+1);
	return insertNumber(arraySorted,pos,number);
}

//////////////// class work 03
public static int searchNumber(int[] array, int number) {
	// searching for the given number in the given array
	// returns index value for the number if exists otherwise false
	int index = 0;
	while (index < array.length && array[index] != number) {
		index++;
	}
	return index < array.length ? index : -1;
}

public static int binarySearch(int[] array, int number) {
	// searching for the given number in the given array that should be sorted
	// returns index value for the number if exists otherwise -1
	int left = 0;
	int right = array.length - 1;
	int middle = right / 2;
	while (left <= right && array[middle] != number) {
		if (number < array[middle]) {
			right = middle - 1;
		} else {
			left = middle + 1;
		}
		middle = (left + right) / 2;
	}
	return left <= right ? middle : -1;
}
public static void quickSort(int [] array) {
	Arrays.sort(array);
}
public static void bubbleSort(int [] array) {
	int length = array.length;
	boolean flSorted = false;
	do {
		flSorted = true;
		length--;
		for(int i = 0; i < length; i++) {
			if(array[i] > array[i + 1]) {
				swap(array, i, i + 1);
				flSorted = false;
			}
		}
	} while(!flSorted);
}

private static void swap(int[] array, int i, int j) {
	//ONLY for interview task of swapping with no additional variable
	//array[i] = array[i] + array[j];
	//array[j] = array[i] - array[j];
	//array[i] = array[i] - array[j];
	//
	int tmp = array[i];
	array[i] = array[j];
	array[j] = tmp;
	
}
///////////////////////////////////////// HW03


//public static int myBinarySearch(int[] array, int number) {
//	// searching for the given number in the given array that should be sorted
//	// returns index value for the number if exists otherwise -1
//	int left = 0;
//	int right = array.length - 1;
//	int middle = right / 2;
//	while (left <= right && array[middle] != number ) {
//		if (number < array[middle]) {
//			right = middle - 1;
//		} else {
//			left = middle + 1;
//		}
//		middle = (left + right) / 2;
//	}
//	if (array[middle] == number) {
//		while((middle > 0) && (array[ middle] == array[ middle-1]) ) 
//			middle--;
//		
//	}
//		else	{
//			middle = -(left + 1);
//		}
//			
//	return middle;
//}

public static int myBinarySearch(int[] array, int number) {
	// searching for the given number in the given array that should be sorted
	// returns index value for the number if exists otherwise -1
	int left = 0;
	int right = array.length - 1;
	int middle = right / 2;
	while (left <= right && array[middle] != number ) {
		if (number < array[middle]) {
			right = middle - 1;
		} else {
			left = middle + 1;
		}
		middle = (left + right) / 2;
	}
	if (array[middle] == number) {
		   
			right = middle;
			middle = (left + right) / 2;
			while (( left <= right )  ) {
				if (array[middle] < number)
					left = middle + 1;
				else 
					right = middle -1 ;
			
			  middle = (left + right) / 2;
			}
			
			middle=left;
	}
		else	{
			middle = -(left + 1);
		}
			
	return middle;
}


public static int [] randomMatrix(int length) {
	int [] arr;
	arr = new int [length];
	Random random = new Random(); 
    for (int i = 0; i < length; i++) {
   	 arr[i] = random.nextInt(); 
    }
	return arr;
}



public static boolean isSorted(int [] arr) {
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

}