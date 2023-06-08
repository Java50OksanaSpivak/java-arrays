package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import telran50.arrays.InterviewTasks;
import static telran50.arrays.MatricesInt.*;

public class MatricesTest {

	@Test
	void multiplyConstantTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[][] expected = { { 2, 20, 40 }, { 60, -20, 30 } };
		assertArrayEquals(expected, multiplyConstant(src, 2));

	}

	@Test
	void getColumnTest() {
		int[][] src = { { 1, 10, 20 }, { 30, -10, 15 } };
		int[] expected = { 1, 30 };
		assertArrayEquals(expected, getColumn(src, 0));
	}

	@Test
	void transpMatrixTest() {
		int[][] src = { { 1, 10, 20 },
				        { 30, -10, 15 } };
		int[][] expected = {
				{1, 30},
				{10, -10},
				{20, 15}
		};
		assertArrayEquals(expected, transpMatrix(src));
	}
	

	@Test
	void sortTest () {
		short [] arraySh = {55, 45, 5, 55, 1, 0, 0, 5, 45, 55};
		short [] expected = { 0, 0, 1, 5, 5, 45, 45, 55, 55, 55 };
		int N_ELEMENTS = 10;
		short [] bArr = new short [N_ELEMENTS];
		bArr = InterviewTasks.randomMatrixShort(N_ELEMENTS);
		bArr = InterviewTasks.sort(bArr);
		assertTrue(InterviewTasks.isSortedShort(bArr));
		assertArrayEquals(expected, InterviewTasks.sort(arraySh));
	}
	
	
	
	
	
	@Test
	void getMaxWithNegativeTest() {
	short[] array = {1, 1, 1,-1, 20,100,200, 100,-100,-100,-20,-40, 80};
	short[] array1 = {-40, 1,-40,-6, 2, 3, 40};
	short[] array2 = {40, 1, 2, 3, 40,-30};
	assertEquals(100,InterviewTasks.getMaxWithNegativePresentation(array));
	assertEquals(40,InterviewTasks.getMaxWithNegativePresentation(array1));
	assertEquals(-1,InterviewTasks.getMaxWithNegativePresentation(array2));
	}
	
}
