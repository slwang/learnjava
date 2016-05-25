package com.wsl.learnJava.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class testSystem {
	
	/**
     * 读取环境变量
     *result:{USERPROFILE=C:\Users\Administrator, JAVA_HOME=C:\cspstudio\Java\jdk1.7.0_80,
     */
    @Test
    public void testGetenv(){
    	System.out.println("test System.getenv()");
    	System.out.println(System.getenv());
    }
    
    @Test
    public void testGetOs(){
    	System.out.println(System.getProperty("os.name"));
    }
    
    private static boolean isWinOS(){
  	  return System.getProperty("os.name").contains("Windows");
    }
    
    @Test
    public void execCmd(){
    	String[] envs = null;
    	if(isWinOS()){
    		List<String> envList = new ArrayList<String>();
    		Map<String,String> envMaps = System.getenv();
    		// The main purpose is to remove CLASS_PATH, to prevent the error in bat: input line is too long.
    		for(String key: envMaps.keySet()){
    			switch(key){
    			//case "PATH":
    			case "JAVA_HOME":
    				envList.add(key+"="+envMaps.get(key));  
    			}
    		}
    		envs = envList.toArray(new String[envList.size()]);
    		System.out.println(envs);
    	}
    }
    
    //利用System.getProperty()函数获取当前路径： 
    @Test
    public void getPath(){
    	System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径 

    }

}
