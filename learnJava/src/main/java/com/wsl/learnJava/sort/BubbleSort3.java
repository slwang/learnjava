package com.wsl.learnJava.sort;
/**
 * ȫ�����򣬲���������￪ʼ���ĵ�����
 * ð������
 *  ��˼�룺�����Ƚϴ��������Ԫ�صĴ�С�������������Ԫ�صĴ����෴ʱ�����н�����ֱ��û�з�������Ԫ��Ϊֹ��
 *  ִ����һ����forѭ������С��һ����ŵ����������ǰ�棨����һ�������㷨* ��һ������λ��֮�佻��  
 * @author Administrator
 *
 */

public class BubbleSort3 {
	/**
	 * ð�������㷨��ʵ�֣���������ָ����Ԫ�ؽ�������
	 * @param array ����������
	 
	 */
	public void bubble(int[] array){
		//��Ҫarray.length-1��
		for (int k=1 ;k<array.length+1;k++){
			//ÿ��ѭ���д����һ��Ԫ�ؿ�ʼ��ǰ���ݣ�֪��i=kλ�ã���i=�ִ�λ��
			for(int i =array.length-1; i>=k; i--){
				//����һ�ֹ��򣨺���Ԫ�ز���С��ǰ��Ԫ�أ�����
				if (array[i]<array[i-1]){
					//������Ԫ��С���ˣ���Ȼ���ڻ���С��Ҫ���Ƚ���ʵ���ˣ�
					swap(array,i,i-1);
					
				}
			}
			for (int i=0; i<array.length; i++)
				System.out.print(array[i]+",");
			System.out.println("");
			
		}
	}
	
	/**
	 * ���������е�����Ԫ�ص�λ��
	 * @param array �������
	 * @param i ��һ��Ԫ��
	 * @param j �ڶ���Ԫ��
	 */
	public void swap(int[] array, int i,int j){
		if (i!=j){//ֻ�в���ͬһλ�ò��轻��
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] list ={7,2,4,3,12,1,9,6,8,5,11,10};
		int[] list ={7,2,4,3,6,7,8};
		for (int i=0; i<list.length; i++)
			System.out.print(list[i]+",");
		System.out.println("");
		System.out.println("-------start sort--------------");
		
		BubbleSort3 bs = new BubbleSort3();
		bs.bubble(list);
		System.out.println("---------end sort------------");
		for (int i=0; i<list.length; i++)
			System.out.print(list[i]+",");
		

	}

}
