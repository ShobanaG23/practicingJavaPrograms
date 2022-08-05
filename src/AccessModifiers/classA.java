package AccessModifiers;

public class classA {

		public static String name;   //public variable
		private static int number;  //private variable
		static boolean status;
		protected static double kms;
	
		
	public static void main(String[] args) {
		displayMesage();
		displayMessage2();
		displayMessage3();
		displayMessage4();
	}
//public method
	public static void displayMesage()
{
		System.out.println("public method");
		name= "shobana";
		number = 500;
		status = true;
		kms = 10.5;
		}
	//private method
	private static void displayMessage2()
{
		System.out.println("private method");	
		number = 100;
status = false;
kms = 5.2;

}
	
	static void displayMessage3() {
		System.out.println("default method");	
	status = true;
	kms = 8.5;
	
	}
	
//protected method
	protected static void displayMessage4()
	{
		System.out.println("protected method");
		kms = 8.6;
		
	}
}
