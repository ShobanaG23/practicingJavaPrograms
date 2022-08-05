package javaPrograms;

// "this" keyword access global variable in method level

public class TC015_ConstructorConcepts1 {
	
	//---------global or class variable-----------------
	
	String name;
	char lastinitial;
	int age;
	double mileage;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC015_ConstructorConcepts1 objRef1 = new TC015_ConstructorConcepts1("shobana",'g',35,5.5);
		
		TC015_ConstructorConcepts1 objRef2 = new TC015_ConstructorConcepts1("govindaraju",'s',65,8.5);
		
		System.out.println(objRef1.name);
		System.out.println(objRef2.name);
		System.out.println(objRef1.age);
		System.out.println(objRef2.age);

	}


	/**
	 * @param name
	 * @param lastinitial
	 * @param age
	 * @param mileage
	 */
	public TC015_ConstructorConcepts1(String name, char lastinitial, int age, double mileage) { //local or method variables
		
		this.name = name;
		this.lastinitial = lastinitial;
		this.age = age;
		this.mileage = mileage;
	}

}
