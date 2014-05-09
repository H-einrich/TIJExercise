package heinrich.normal.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * binarySearch
 * @author zhangzimo
 * @date 2014-4-2
 * @description TODO
 */
public class BinarySearch {

	static int high;
	static int low = 1;
	static int mid;
	
	public void binarySearchBiggest(List<Integer> list){
		high = list.size();
		while(low <= high){
//			mid = low + high
		}
	}
	
	//普通循环实现
	public static int binarySearchNumNormal(int[] a, int key){
		Arrays.sort(a);
		high = a.length;
		while(low < high){
			mid = (high - low )/2 + low;
			if (key == a[mid -1]) {
				return mid;
			}else if (key > a[mid -1]) {
				low = mid +1;
			}else{
				high = mid -1;
			}
			
		}
		return -1;
	}
	
	//递归实现
	public static int binarySearchNumRecursion(int[] a, int key){
		Arrays.sort(a);
		high = a.length;
		while(low < high){
			mid = (high - low )/2 + low;
			if (key == a[mid -1]) {
				return mid;
			}else if (key > a[mid - 1]) {
				a = Arrays.copyOfRange(a, mid - 1, high-1);
				binarySearchNumRecursion(a, key);
			}else{
				a = Arrays.copyOfRange(a, low, mid - 1);
				binarySearchNumRecursion(a, key);
			}
		}
		return -1;
	}
	
	/**
	 * @description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,18,90,0,56,79};
		System.out.println(binarySearchNumNormal(a, 79)+1);
		low = 1;
		System.out.println(binarySearchNumRecursion(a,1));
	}

}
