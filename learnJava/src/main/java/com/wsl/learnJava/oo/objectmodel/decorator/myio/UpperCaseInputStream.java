package com.wsl.learnJava.oo.objectmodel.decorator.myio;

import java.io.FilterInputStream;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream{

	protected UpperCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

}
