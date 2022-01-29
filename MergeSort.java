package SortingPractice;

public class MergeSort {
	
	public static void mergeSort( int [] data ) {
        mergeSortRec(data, 0, data.length-1);
    }
	
	public static void mergeSortRec ( int[] array, int first, int last) {
    	
    	if (first >= last) {
    	    return;
    	}
    	
    	else {
	        int mid = (first+last)/2;
	        mergeSortRec(array, first, mid);
	        mergeSortRec(array, mid+1, last);
	        merge(array, first, mid, mid+1, last);  
    	}
    }
    
    public static void merge( int[] array, int leftFirst, int leftLast, int rightFirst, int rightLast ) {
    	int[] tmp = new int[rightLast - leftFirst + 1];
    	int indexLeft = leftFirst;
    	int indexRight = rightFirst;
    	int indexTmp = 0;
    	
    	while (indexLeft <= leftLast   &&  indexRight <= rightLast) {
    		if (array[indexLeft] < array[indexRight]) {
    			tmp[indexTmp] = array[indexLeft];
    			indexLeft++;
    			indexTmp++;
    		}
    		else {
    			tmp[indexTmp] = array[indexRight];
    			indexRight++;
    			indexTmp++;
    		}
    	}
    	
    	for (int i = indexLeft; i<=leftLast; i++) {
    		tmp[indexTmp] = array[i];
    		indexTmp++;
    	}
    	
    	for (int i = indexRight; i<=rightLast; i++) {
    		tmp[indexTmp] = array[i];
    		indexTmp++;
    	}
    	
    	indexTmp = 0;
    	
    	for (int i = leftFirst; i<=rightLast; i++) {
    		array[i] = tmp[indexTmp];
    		indexTmp++;
    	}
    }  
}
