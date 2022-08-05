package javaPrograms;


/*Polymorphism-----an entity taking multiple forms
1.method overloading
	1. can be applied to static and non static methods
	2. method name, dattatype, same----number of arguments different
	3. method name , no. of arguments same----data types different
	
2.methos overridding (@override)--keyword
	1. mehtod name same on different class but implementaion different.
	2. used only in inheritance
	3.cannot over ride a static method.

*/

public class TC012_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(100,20.5);
	}
	
		public static void addition(int no1, int no2) {
			
			int result;
							
			result=no1+no2;
			
			System.out.println("Addition of numbers is "+ result);
		}
	
		public static void addition(int no1, int no2, int no3) {
			
			int result;
							
			result=no1+no2+no3;
			
			System.out.println("Addition of numbers is "+ result);
}

		public static void addition(int no1, double no2) {
			
			double result;
							
			result=no1+no2;
			
			System.out.println("Addition of numbers is "+ result);
}
}