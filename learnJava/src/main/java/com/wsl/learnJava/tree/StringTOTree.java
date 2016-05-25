package com.wsl.learnJava.tree;
/*
 * 前缀表达式转换二叉树 
 *  输入一个算术表达式，判断该表达式是否合法，若不合法，给出错误信息；若合法，则输出合法表达式的表达式树。
 
【算法分析】表达式不合法有三种情况：①左右括号不匹配；②变量名不合法；③运算符两旁无参与运算的变量或数。
 
分析表达式树可以看到：表达式的根结点及其子树的根结点为运算符，其在树中的顺序是按运算的先后顺序从后到前，表达树的叶子为参与运算的变量或数。

 *  
 *  
 *  
 * */

public class StringTOTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp ="-,+,a,*,b,c,d";
		//System.out.println(toTree(exp).getValue());
		
		TreeNode lastRoot = null;  
		lastRoot = buildTree(exp);  
		System.out.println("原表达式为:  " + exp);  
		System.out.print("后续遍历的结果为:  ");  
		postOrder(root);  

		

	}
	
	/*public static TreeNode toTree(String exp){
		for(int i =0; i<exp.length(); i++){
			char temp = exp.charAt(i);
			if (temp =)
		}
		return null;
		
	}*/
	
	
	static TreeNode root = null;  

	static boolean hasOper(String checkOper){  
		if(checkOper.indexOf("+") == -1&&checkOper.indexOf("-") == -1  
				&&checkOper.indexOf("*") == -1&&checkOper.indexOf("/") == -1){  
			return false;  
		}  
		else{  
			return true;  
		}  
	}  

	static TreeNode buildTree(String expression){  
		/* 
		 * 去除表达式首部和尾部的多余括号    
		 * 当出现了括号不匹配时出现异常   抛出 
		 */  
		if(expression.indexOf("(") == 0){  
			for(int i = 0;i < expression.length();i++){  
				if(expression.startsWith("(") == true){  
					if(expression.endsWith(")") == true){  
						expression = expression.substring(1,expression.length() - 1);  
					}  
					else{  
						/* 
						 * 抛出异常   括号不比配 
						 */  
					}  

				}  
			}  
		}  
		char[] expre = expression.toCharArray();  

		TreeNode newNode = new TreeNode();  
		String leftString = new String();  
		String rightString = new String();  
		String stack = new String();             //用于存储括号的栈    当表达式检测完毕后  若栈不为空  这说明括号使用不合法  
		if(hasOper(expression) == true){  
			int index = 0;      //记录最先扫描到的不在括号中的加号或减号      必为表达式运算的最后一次操作  
			int multi_div = 0;    //记录最先扫描到的不在括号中的乘号或除号的位置  只有在扫描不到加号和减号的前提下才有用  
			for(int i = expre.length -1;i>=0;i--){  
				if(expre[i] == ')'){  
					stack = stack + expre[i];  
				}  
				else if(expre[i] == '('){  
					if(stack.length() > 0){  
						stack = stack.substring(0, stack.length() - 1);  
					}  
				}  
				else if(expre[i] == '+'&&stack.length() == 0||expre[i] == '-'&&stack.length() == 0){  
					index = i;  
					break;  
				}  
				else if(expre[i] == '/'&&stack.length() == 0||expre[i] == '*'&&stack.length() == 0){  
					multi_div = i;  
				}  
				else{  
					if(expre[i] < 48||expre[i]>57){  
						/* 
						 * 抛出异常    出现不合法的字符 
						 */  
					}  
				}  
			}  
			if(stack.length() != 0){  
				/* 
				 * 抛出异常    括号不匹配 
				 */  
			}  
			int separator;  
			if(index != 0){             //说明表达式的最后运算的为加法或减法  
				separator = index;  
			}  
			else{  
				separator = multi_div;  
			}  
			newNode.setValue(String.valueOf(expre[separator]));  
			int pos = 0;  
			for(;pos < separator;pos++){  
				leftString = leftString + expre[pos];  
			}  
			pos++;  
			for(;pos < expre.length;pos++){  
				rightString = rightString + expre[pos];  
			}  
			if(root == null){  
				root = newNode;  
			}  
			newNode.setLeft(buildTree(leftString));  
			newNode.setRight(buildTree(rightString));  
		}  
		else{  
			char[] temp = expression.toCharArray();  
			if(temp.length !=1){  
				/* 
				 * 抛出异常 
				 */  
			}  
			else{  
				newNode.setValue(String.valueOf(temp[0]));  
			}  
		}  
		return newNode;  
	}  

	static void postOrder(TreeNode currNode){  
		if(currNode != null){  
			postOrder(currNode.getLeft());  
			System.out.print(currNode.getValue());  
			postOrder(currNode.getRight());  

		}  
	}  


}
