package javaPrograms;

/*//Static method: (same for variable)
 1.static keyword present
 2. can call static method inside another static method directly.
 3. no need to create refernce for caling.
 static method can be called inside non-static directly. 
 
 
 
//Non-static method: (same for variable)
 1. no static keyword present. withoput any keyword.
 2. cannot called non-static inside a static method directly.
3. we need to create reference for calling non-static method inside static method. 
4. non-static method called inside non-static metod directly without refernce. 

1.Local variable: assigned inside a block or method
2.globalvariable:  assigned anywhere or in class level

*/
 
 public class TC011_StaticAndNonStaticConcepts {
	 
	 static int no1;   //global variable
	 Boolean status;	//global variable
	 	 
	public static void main(String[] args) {
	 	
		String name;   //local variable
		displayName();
		
		TC011_StaticAndNonStaticConcepts objRef = new TC011_StaticAndNonStaticConcepts();
		objRef.status = false;
		objRef.displayMessage();
		
		
	}

		public static void displayName() {
			System.out.println("shobana");
		}

		public void displayMessage() {
			System.out.println("non-static method");
		}
 
 }
