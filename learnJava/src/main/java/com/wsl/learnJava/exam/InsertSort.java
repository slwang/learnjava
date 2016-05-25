package com.wsl.learnJava.exam;

public class InsertSort {
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
		/*insertSort(list);
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");*/
		
		insertionSort2(list);
		for (int i=0; i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	public static void insertSort(int[] array){
		for (int i =1; i<array.length; i++){
			for (int j = 0; j<i; j++){
				if (array[i] < array[j]){
					int temp = array[i];
					//move j 
					for (int m = i; m>j; m--){
						array[m] = array[m-1];
					}
					array[j] = temp;
 				}
			}
		}
	}
	
	
	public static void insertionSort2(int[] array){
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int index = i, array_i = array[i];
            while (index > 0 && array[index - 1] > array_i) {
                array[index] = array[index - 1];
                index -= 1;
            }
            array[index] = array_i;
            /* print sort process */for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
