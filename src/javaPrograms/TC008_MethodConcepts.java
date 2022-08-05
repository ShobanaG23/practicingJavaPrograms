package javaPrograms;
import java.util.Scanner;

/*methods concepts
 * 1.with arguments

2.without arguments

	1.method should be created on class level
	2.to execute method should be called inside main method*/

	
public class TC008_MethodConcepts {

	
	
	/*//-------------without arguments-----------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();
	}

	
	public static void addition() {
		int no1,no2,result;
		
		System.out.println("Enter the two numbers to be added: ");
		
		Scanner input1 = new Scanner(System.in);
		no1 = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		no2 = input2.nextInt();
		
		result=no1+no2;
		
		System.out.println("Addition of two numbers is "+ result);
		}*/
	

//----------------------with arguments------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(100,50);
	}
	
	public static void addition(int no1, int no2) {
		
		int result;
						
		result=no1+no2;
		
		System.out.println("Addition of two numbers is "+ result);
	}
	
}