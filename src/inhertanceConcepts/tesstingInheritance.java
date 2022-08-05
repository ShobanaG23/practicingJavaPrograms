package inhertanceConcepts;

import AccessModifiers.classA;

//bmw extends car
//car extends vehicle
//bmw------>car------>vehicle
public class tesstingInheritance {

	public static void main(String[] args) {
	
		/*bmw b =new bmw();
		b.startCar();
		b.stopCar();
		b.autoSuspension();
		b.refuel();
		b.engine();*/
		
		car c = new car();
		c.startCar();
		c.stopCar();
		c.refuel();
		c.engine();
		
		classA.displayMesage();   //calling a public method from access modifier
		//classA.displayMessage4();
	}

}
