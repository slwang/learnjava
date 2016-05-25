package com.wsl.learnJava.exam;

public class BubbleSort {
	public static void main(String[] args){
		int[] list = new int[5];
		list[0] = 12;
		list[1] = 11;
		list[2] = 10;
		list[3] = 8;
		list[4] = 7;
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println("");
		System.out.println("---------------sort");
		bubbleSort(list);
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	public static void bubbleSort(int[] array){
		for (int i =0; i<array.length-1; i++){
			for (int j = 1; j<array.length-i; j++){
				if (array[j] < array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					
 				}
			}
		}
	}
}
