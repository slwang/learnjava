package com.wsl.learnJava.sort;

//���������Ƕ�ð�������һ�ָĽ�ƽ��ʱ�临�Ӷ���O(nlogn)��
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[5];
		list[0] = 4;
		list[1] = 9;
		list[2] = 1;
		list[3] = 5;
		list[4] = 7;
		quickSort(list);
		

	}
	public static void quickSort(int[] array){  
		
		for (int i=0; i<5;i++)
			System.out.print(array[i]+"  ");
		System.out.println();
		if(array != null){  
			quickSort(array, 0, array.length-1);  
		}  
		
		for (int i=0; i<5;i++)
			System.out.print(array[i]+"  ");
	}  
	/**
	 * �ݹ���ʽ�ķ��������㷨
	 * @param array
	 * @param beg
	 * @param end
	 */
	private static void quickSort(int[] array,int beg,int end){  
		if(beg >= end || array == null)  
			return;  
		int p = partition3(array, beg, end);  
		quickSort(array, beg, p-1);  
		quickSort(array, p+1, end);  
	}  
	/**
	 * ���ֲ��ҵ��´ηָ������λ��p���õ�partition����
	 * @param array
	 * @param beg
	 * @param end
	 * @return
	 */
	private static int partition(int[] array, int beg, int end) {  
	    int first = array[beg];  
	    int i = beg, j = end;  
	    while (i < j) {  
	        while (array[i] <= first && i < end) {  
	            i++;  
	        }  
	        while (array[j] > first && j >= beg) {  
	            j--;  
	        }  
	        if (i < j) {  
	            array[i] = array[i] ^ array[j];  
	            array[j] = array[i] ^ array[j];  
	            array[i] = array[i] ^ array[j];  
	        }  
	    }  
	    if (j != beg) {  
	        array[j] = array[beg] ^ array[j];  
	        array[beg] = array[beg] ^ array[j];  
	        array[j] = array[beg] ^ array[j];  
	    }  
	    return j;  
	}  
	/**
	 * ��Ӽ��
	 * @param array
	 * @param beg
	 * @param end
	 * @return
	 */
	private static int partition2(int[] array,int beg,int end){  
        int last = array[end];  
        int i = beg -1;  
        for (int j = beg; j <= end-1; j++) {  
            if(array[j] <= last){  
                i++;  
                if(i != j){  
                    array[i] = array[i]^array[j];  
                    array[j] = array[i]^array[j];  
                    array[i] = array[i]^array[j];  
                }  
            }  
        }  
        if((i+1) != end){  
            array[i+1] = array[i+1]^array[end];  
            array[end] = array[i+1]^array[end];  
            array[i+1] = array[i+1]^array[end];  
        }  
        return i+1;  
    }  

	public static int partition3(int[] list, int low, int high) {  
        int tmp = list[low];    //����ĵ�һ����Ϊ����  
        while (low < high) {  
            while (low < high && list[high] > tmp) {  
                high--;  
            }  
            list[low] = list[high];   //������С�ļ�¼�Ƶ��Ͷ�  
            while (low < high && list[low] < tmp) {  
                low++;  
            }  
            list[high] = list[low];   //�������ļ�¼�Ƶ��߶�  
        }  
        list[low] = tmp;              //�����¼��β  
        return low;                   //���������λ��  
    }  
}

