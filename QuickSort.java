package SortingPractice;

public class QuickSort {
	
    public static void quickSort(int [] data) {
    	quickSortRec( data, 0, data.length-1);
    }
    
    public static void quickSortRec (int [] array, int left, int right) {
    	int pivotIndex = partition(array, left, right);
    	if (pivotIndex-left>1) {
    		quickSortRec(array, left, pivotIndex-1);
    	}
    	if (right-pivotIndex>1) {
    		quickSortRec(array, pivotIndex+1, right);
    	}
    }
    
    public static int partition (int [] array, int left, int right) {
    	int pivot = right;

    	int tmp = array[right];
    	array[right] = array[pivot];
    	array[pivot] = tmp;
    	pivot = right;
    	right--;
    	

    	
    	while (left<=right) {
    		while (array[left]<array[pivot]) {
    			left++;
    		}
	    	while (left<=right && array[right]>=array[pivot]) {
	    		right--;

	    	}
	    	if (right>left) {
	    		tmp = array[right];
	    		array[right] = array[left];
	    		array[left] = tmp;
	    	}
    	}
    	
    	tmp = array[left];
    	array[left] = array[pivot];
    	array[pivot] = tmp;
    	return left;
    }

}