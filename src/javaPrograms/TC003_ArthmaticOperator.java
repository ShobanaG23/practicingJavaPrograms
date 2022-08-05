package javaPrograms;

public class TC003_ArthmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=100, no2=50, result;
		result = no1+no2;
		System.out.println("addition of 2 numbers : " + result);
		
		int result1;
		
		result1 = no1-no2;
		System.out.println("subtraction of 2 numbers :" + result1);
		
		result = no1*no2;
		System.out.println("multiplication of 2 numbers :" + result);
		
		result = no1/no2;
		System.out.println("division of 2 numbers :" + result);
		
		char c1='a', c2='b';               //ASCII value a=97,b=98 
		System.out.println(c1+c2);         // c1+c2=195
		
		String s1="a", s2="b";             //concatenation of string value 
		System.out.println(s1+s2);

	}

}
