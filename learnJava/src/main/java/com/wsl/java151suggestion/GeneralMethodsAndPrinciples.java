package com.wsl.java151suggestion;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class GeneralMethodsAndPrinciples {
	
	/**
	 * l作为长整型标志时务必大写L
	 * 字母O则需要增加注释
	 */
	@Test
	public void testSuggestion1(){
		long i = 1l;
		assertNotEquals(22, i+i);
		assertEquals(2, i+i);
		
		//correct 
		long j =1L;
		assertEquals(2, j+j);
		
	}
	
	

	/**
	 *莫让常量蜕变成变量
	 *务必让常量的值在运行期保持不变
	 *有问题
	 */
	@Test
	public void testSuggestion2(){
		System.out.println("常量会变哦： "+ Const.RAND_CONST);
	}
	
	@Test
	public void testSuggestion2_2(){
		System.out.println("常量会变哦： "+ Const.RAND_CONST);
	}
	
	/**
	 *接口常量
	 *
	 */
	interface Const{
		//这还是常量吗
		public static final int RAND_CONST = new Random().nextInt();
	}
	
	/**
	 * 三元操作符的类型务必一致
	 */
	@Test
	public void testSuggestion3(){
		int i = 80;
		String s = String.valueOf(i<100?90:100);
		String s1 = String.valueOf(i<100?90:100.0);
		System.out.println("s： "+ s);
		System.out.println("s1： "+ s1);
		assertNotEquals(s1, s);
	}

}
