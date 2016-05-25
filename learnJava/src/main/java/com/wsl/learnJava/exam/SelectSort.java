package com.wsl.learnJava.exam;

public class SelectSort {
	public static void main(String[] args){
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
		selectSort(list);
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	public static void selectSort(int[] array){
		for (int i =0; i<array.length; i++){
			for (int j = i+1; j<array.length; j++){
				if (array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
 				}
			}
		}
	}
}
