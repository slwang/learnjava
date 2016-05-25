package com.wsl.learnJava.string;

public class ImplementStrstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  source ="";
		String target ="";
		System.out.println(strStr(source,target));

	}
	
	public static int strStr(String haystack, String needle) {
        if (haystack == ""|| needle == ""){
            return 0;
        }
        if (haystack == null || needle == null){
            return -1;
        }
        
        int i,j;
        for (i =0; i<haystack.length() - needle.length()+1; i++){
            for (j =0; j< needle.length(); j++){
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if (j == needle.length()){
                return i;
            }
        }
        
        return -1;
    }

}
