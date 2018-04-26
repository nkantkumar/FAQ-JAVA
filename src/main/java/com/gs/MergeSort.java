package com.gs;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] one= new int[]{1,3,5};
		
		int[] two= new int[]{2,4,6};
		
		for(int a: merge(one,two)){
			System.out.println(a);
		}
		
	}
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)  
	       answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}

}
