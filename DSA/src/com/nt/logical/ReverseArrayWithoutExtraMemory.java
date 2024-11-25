package com.nt.logical;

public class ReverseArrayWithoutExtraMemory {
//29th video dsa 
	public static void main(String[] args) {
		int a[]= {4,3,6,7,8,9};
		//int b[]=new int [a.length];
		//int j=0;
		
//		for (int i = 0; i < b.length-1; i--) {
//			b[j]=a[i];
//			j++;
//		}
//		
		for (int i = 0,j1=a.length-1;i<j1; i++,j1--) {
			int temp=a[i];
			a[i]=a[j1];
			a[j1]=temp;
			
			
			a[i]=a[i]+a[j1];
			a[j1]=a[i]-a[j1];
			a[i]=a[i]-a[j1];
			System.out.println(a[j1]);
		}
	}
}
