package com.nt.twowaymerge;

import java.util.Arrays;

public class TwoWaymerging {

	public static void main(String[] args) {
		int a[] = { 5, 10, 11, 13 };
		int b[] = { 2, 3, 8, 15, 17, 21 };
		TwoWaymerging t = new TwoWaymerging();
		t.twoWayMerge(a, b);
		// why its not printing the values in the console because of did not call the
		// method so must be call
	}
	public void twoWayMerge(int a[], int b[]) {
		int c[] = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		// i for a array
		// j for b array
		// k for c array
		// a length -4
		// b length -6

		// i have to compare
		// while(i<a.length && j<b.length){//0<4 && 1<6
		for (; i < a.length && j < b.length;) {
			if (a[i] > b[j]) {// a[0]>b[1]//5>8
				c[k] = b[j];// c[1]=b[1]; //c=3
				j++;// 2
				// k++;//4
			} else {
				c[k] = a[i];
				i++;// 1//2//3
				// k++;//3//5//6
			}
			k++;
		}
		// while(j<b.length)
		for (; i < b.length;) {
			c[k] = b[j];
			j++;
			k++;
		}
		// while(i<a.length)
		for (; i < a.length;) {
			c[k] = a[i];
			i++;
			k++;
		}
		Arrays.stream(c).forEach(p -> System.out.println(p));
	}
}
