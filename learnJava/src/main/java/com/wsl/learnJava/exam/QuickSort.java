package com.wsl.learnJava.exam;

public class QuickSort {

	public static void main(String[] args) {
		int[] list = new int[5];
		list[0] = 4;
		list[1] = 9;
		list[2] = 1;
		list[3] = 5;
		list[4] = 7;
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println("");
		System.out.println("---------------sort");
		quickSort(list,0,list.length-1);
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	public static void quickSort(int[] s, int l,int r){
		if (l<r){
			int i =l, j =r, x=s[l];
			while(i<j){
				while(i<j && s[j]>=x){
					j--;
				}
				if(i<j){
					s[i++] = s[j];
				}
				while (i<j && s[i]<x){
					i++;
				}
				if (i<j){
					s[j--] =s[i];
				}
			}
			
			s[i] = x;			
			quickSort(s,l,i-1);
			quickSort(s,i+1,r);
		}
	}
	

}
