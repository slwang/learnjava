package com.wsl.learnJava.oo.objectmodel.singleton;

public class Test {
	/*public class Abc{
		public Abc(){
			
		}
	}
	public class Cbd{
		public Cbd(){
			Abc n1, n2;
			n1 = new Abc();
			n2 = new Abc();
		}
	}*/
	
	class Abc{
		private Abc(){
			
			
		}
		Abc n1 = new Abc();
	}
	class Cbd{
		public Cbd(){
			
		}
	}

	
	
	
	
	
}
