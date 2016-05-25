package com.wsl.learnJava.array;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组
		String[] aArray = new String[5];//动态
		String[] bArray = {"a","b", "c", "d","e"};
		String[] cArray = new String[]{"a", "b", "c"};
		
		//链接数组 b   c
		String[] combArray = ArrayUtils.addAll(bArray, cArray);
		
		//array 转化为Set集合
		//、主要使用在将应用转化为列表的地方
		Set<String> set = new HashSet<String>(Arrays.asList(cArray));
		
		
		//数组翻转
		int[] intArray = {1,2,3,4,5};
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));
		
		// 从数组中移除一个元素
		//移除第三个元素
		int[] removed = ArrayUtils.removeElement(intArray,3);
		System.out.println(Arrays.asList(removed));
		
		
		// 将一个int值转化为byte数组
		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
		for (byte t: bytes){
			System.out.format("ox%x", t);
		}
	}

}
