package heinrich.normal.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSortTest {

	public static int low = 0;
	static int[] tempSmall = {};
	static int[] tempLarge = {};
	
	public static int[] quickSort(int[] array){
		int x = array.length - 1;
		while(low < x){
			if (array[low] < array[x]) {
				Arrays.fill(tempSmall, array[low]);
				quickSort(tempSmall);
				for (int i = 0; i < tempLarge.length; i++) {
					System.out.println(tempSmall[i]);
				}
			}else if (array[low] >=  array[x]){
				Arrays.fill(tempLarge, array[low]);
				quickSort(tempLarge);
				for (int i = 0; i < tempLarge.length; i++) {
					System.out.println(tempLarge[i]);
				}
			}
			low++;
		}
		return null;
	}
	/**
	 * @description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testArray = {2,8,7,1,3,5,6,4};
		quickSort(testArray);
		String s = "eihei";
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 4, 5, 3);
		System.out.println(Collections.max(list));
	}

}
