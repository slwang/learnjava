package com.wsl.learnJava.sort;
/**
 * ��ѡ������ִ����һ����forѭ������С��һ����������������ǰ�档
 * @author Administrator
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {10,11,9,78,87,65};
		for (int i=0; i<array.length ;i++)
			System.out.print(array[i]+",");
		System.out.println("");
		System.out.println("---------------start sort");
		SelectSort ss = new SelectSort();
		ss.selectSort(array);
		System.out.println("---------------end sort");
		for (int i=0; i<array.length ;i++)
			System.out.print(array[i]+",");
		

	}
	
	public void swap(Integer[] array, int i, int j){
		Integer temp = array[i];
		//int temp = array[i];////���Ҳ��
		array[i] = array[j];
		array[j] = temp;
	}
	/**
	 * 
	 * @param array
	 */
	public void selectSort(Integer[] array){
		int minIndex;//��С����
		// ��һ��Ԫ��Ϊ��СԪ�أ����ӵ�һԪ�غ���ѡ���ȵ�һ��Ԫ�ظ�СԪ�أ���������СԪ�����һ ��Ԫ�ؽ���     
		for (int i=0;i<array.length; i++){
			minIndex = i;//����ÿ�ֵ�һ��Ԫ��Ϊ��СԪ�� 
			//�Ӽ������СԪ�ص���һԪ�ؿ�ʼѭ�� 
			for (int j =i+1; j<array.length ;j++){
				if (array[minIndex].compareTo(array[j])>0){
					//��ǰֻ�Ǽ�¼��СԪ��������СԪ������ȷ��������ÿ�ֵĵ�һ��Ԫ�ؽ���
					swap(array,minIndex,j);					
				}
			}
			for (int k=0; k<array.length ;k++)
			{
				System.out.print(array[k]+",");
				
			}
			System.out.println("");
			
		}
		
	}

}
