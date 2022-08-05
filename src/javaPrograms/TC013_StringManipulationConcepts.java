package javaPrograms;
/*
1.length of string------stringName.length();
2.index of string--------- stringName.indexOf("word")
3.equals---------name1.equals(name2)
4. convert string to lower case and the equals----------name1.equalsIgnoreCAse(name2);
5. to uppercase, to lowercase----------- toUpperCase(); toLowerCase();
6. trim()-----------------Stringname.trim();
7. replace()-------StringName.replace(" ", " ")
8. split method------------stringNmae.split(" ")
9. substring---------------stringNmae.substring(indexVAlue)
*/
public class TC013_StringManipulationConcepts {

	public static void main(String[] args) {
	
		String msg = "we are learning java";
				
	//length of string
			
		int stringLength = msg.length();
		System.out.println("length of string is : "+ stringLength);
		
		// index of string 
		
		int stringIndex = msg.indexOf("java");
		System.out.println("index of the word java is : "+stringIndex);
		
		//compare the index and check if the work is present or not
		String v1 = "welcome shobana";
		String username = "shobana";
		System.out.println();
		System.out.println("usernam eentered is : " + username);
		System.out.println("Password entered is : "+ "test123");
		System.out.println("login is entered");
		
		if(v1.indexOf(username) >=0) {
			System.out.println("User is logged in successfully");
			
		}else {
			System.out.println("user has not logged in successfully");
		}
		
		//string comparison
		
		String name1= "shobana";
		String name2 = "shobana";
		System.out.println();
		if(name1.equals(name2)) {
			
			System.out.println("names are same");
		}else {
			System.out.println("names are different");
		}
		
		
		//convert name to lower case and then check .equals

		String name3= "sHHHHna";
		String name4 = "Shobana";
		System.out.println();
		System.out.println("to uppercase is : "+name3.toLowerCase());
		if(name3.equalsIgnoreCase(name4)) {
			
			System.out.println("names are same");
		}else {
			System.out.println("names are different");
		}
		
		//trim()
		
		String fullName = "Shobana Govindaraju Aravindh";
		String valueFromApp = " fashion ";
	
		String trimmedVal = valueFromApp.trim();
		System.out.println();
		if(trimmedVal.equals("fashion")){
	
				System.out.println("pass");
	}else {
		System.out.println("fail");
		
	}
		//replace 
		String dob = "23-11-1987";
		System.out.println();
		System.out.println("before replace: "+ dob);
		dob = dob.replace("-", "/");
		System.out.println("after replace: " +dob);
	
		// split method
		
		String newDob[] = dob.split("/");
		System.out.println();
		System.out.println("day :"+ newDob[0]);
		System.out.println("month :"+ newDob[1]);
		System.out.println("year :"+ newDob[2]);
		
		//substring 
		
		String retVal = msg.substring(15);
		System.out.println();
		System.out.println("substring operation:  "+ retVal);
	}

}
