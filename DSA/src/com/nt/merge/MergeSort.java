package com.nt.merge;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort m=new MergeSort();
		// TODO Auto-generated method stub
		int a[]= {10,7,5,4,3,2};
		m.mergeSort(a,0,a.length-1);

	}
	public void mergeSort(int a[],int l,int h) {
		//i want to divide the array 
		//divide concurrent algorithm need to do recursive method 
		int m=l+h/2;//0+5=2
		//0 to 2 [10,7,5]
		mergeSort(a, l, m);//left side divide 
		mergeSort(a, m+1, h);//right side 
		//3 to lenth-1[4,3,2]
		//if u want to divide again 
		
		
		
	}

}
