package SortingPractice;

public class SortMain {
	
	public static void main(String[] args) {
		int[] myArray = {3,9,8,4,1,5,7,2};
		MergeSort.mergeSort(myArray);
//		QuickSort.quickSort(myArray);
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		
	}

}
