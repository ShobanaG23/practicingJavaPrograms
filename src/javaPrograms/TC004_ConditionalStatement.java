package javaPrograms;

//two types
// if condition
//switch case

public class TC004_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if statement
		
	int no1=1000, no2=100;
	
	//************if statement************
	/*if(no1==no2) {
		System.out.println("values are same");
	}
	
	if(no1!=no2) {
		System.out.println("values are not same");
	}*/
	
	//-----------------------------------------------------------------
	//***********if else statement****************
	/*if(no1==no2) {
		System.out.println("values are same");
	} else 
	{
		System.out.println("values are not same");
	}*/
	
	
	//--------------------------------------------------------------
	// ************checking for string values********************
	/*String f1="apple", f2="orange";
	if(f1==f2) {
		System.out.println("fruits are same");
	}
	else 
	{
		System.out.println("fruits are different");
	}*/
	
	
	//-------------------------------------------------------------------
	//****************Nested if statement*************************
	
	/*String fruit="apple";
	
	if(fruit=="Orange") {
		System.out.println("fruit is orange");
	} else if(fruit=="mango") {
		System.out.println("fruit is mango");
	}else if(fruit=="apple") {
		System.out.println("fruit is apple");
	} else {
		System.out.println("fruit is other than orange, mango, apple");
	}*/
	
	//-------------------------------------------------------------------------
	//************switch case****************
	
	//<syntax>
	/*switch(key) {
	case value:
		break;
		
	default:
		break;
	}*/
	
	String fruit= "mango";
	switch(fruit) {
	
	case "apple":
		System.out.println("fruit is apple");
		break;
		
	case "orange":
		System.out.println("fruit is orange");
		break;
		
	case "grapes":
		System.out.println("fruit is grapes");
		break;
		
	default:
		System.out.println("some other fruit is mentioned");
		break;
		
		
	}
	
	
	
	
	
	}
	}

