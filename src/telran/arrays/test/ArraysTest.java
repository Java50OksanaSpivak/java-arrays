package telran.arrays.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran50.arrays.ArraysInt;
//import static toBinary
public class ArraysTest {
@Test
void initialTest() {
	int [] ar1={1,2,3};
	int [] ar2={1,2,3};
	int [] ar2_3=ar2;
	assertFalse(ar1==ar2);	
	assertTrue(ar2==ar2_3);
	assertArrayEquals(ar1,ar2); 
	ar2_3[0]=10;
	assertFalse(ar1==ar2); //not equals
}
@Test
void copyOfIntTest() {
	int [] ar1 = {10,5,15};
	int [] expected1 = {10,5,15};
	int [] expected2 = {10,5};
	int [] expected3 = {10,5,15,0,0};
	//int [] expected4 = {10,5,15};
	assertArrayEquals(expected1,Arrays.copyOf(ar1, 3));
	assertArrayEquals(expected2,Arrays.copyOf(ar1, 2));
	assertArrayEquals(expected3,Arrays.copyOf(ar1, 5));
}
@Test
void addNumberTest() {
	int [] ar1 = {10,5,15};
	int number = 20;
	int [] expected = {10,5,15,number};
	assertArrayEquals(expected,ArraysInt.addNumber(ar1, number));
}
@Test
void arraycopyTest() {
	int [] src = { 1,2,3,4,5,6,7};
	int [] dest = { 10,20,30,40,50,60,70};
	int [] expected = {10,20,30,40,1,2,3};
	System.arraycopy(src, 0, dest, 4, 3);
	assertArrayEquals(expected, dest);
}

@Test 
void insertNumberTest() {
	int []src = {1,2,3,4,5,6,7};
	int number = 20;
	int index = 3;
	int[]expected1 = {1,2,3,20,4,5,6,7};
	assertArrayEquals(expected1, ArraysInt.insertNumber(src,index,number));
	number = 30;
	index = 0;
	int[]expected2 = {30,1,2,3,4,5,6,7};
	assertArrayEquals(expected2, ArraysInt.insertNumber(src,index,number));
	number = 40;
	index = 7;
	int[]expected3 = {1,2,3,4,5,6,7,40};
	assertArrayEquals(expected3, ArraysInt.insertNumber(src,index,number));
}
@Test
void removeNumberTest() {
	int []expected = {1,2,3,4,5,6,7};
	int index = 3;
	int[]src = {1,2,3,20,4,5,6,7};
	assertArrayEquals(expected, ArraysInt.removeNumber(src,index));
	index = 0;
	int[]src1 = {20,1,2,3,4,5,6,7};
	assertArrayEquals(expected, ArraysInt.removeNumber(src1,index));
	int[]src2 = {1,2,3,4,5,6,7,20};
	index = 7;
	assertArrayEquals(expected, ArraysInt.removeNumber(src2,index));
}
@Test
void binarySearchTest() {
	 int[] array = {10, 20, 24, 30, 40};
     int pos1 = Arrays.binarySearch(array, 20);
     int pos2 = Arrays.binarySearch(array, 25);
     int pos3 = Arrays.binarySearch(array, 5);
     int pos4 = Arrays.binarySearch(array,45);
     int pos5 = Arrays.binarySearch(array, 30);
     assertEquals(1,pos1);
     assertEquals(-4,pos2);
     assertEquals(-1,pos3);
     assertEquals(-6,pos4);
     assertEquals(3,pos5);
}
@Test
void insertNumberSortedTest() {
	int [] src = {10,20,30,40,50};
	int [] res1 = {5,10,20,30,40,50};
	int [] res2 = {10,15,20,30,40,50};
	int [] res3 = {10,20,30,30,40,50};
	int [] res4 = {10,20,30,40,50,56};
	assertArrayEquals(res1,ArraysInt.insertNumberSorted(src,5));
	assertArrayEquals(res2,ArraysInt.insertNumberSorted(src,15));
	assertArrayEquals(res3,ArraysInt.insertNumberSorted(src,30));
	assertArrayEquals(res4,ArraysInt.insertNumberSorted(src,56));
}

}
