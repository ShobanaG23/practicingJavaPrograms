package javaPrograms;

public class TC016_dataConversionConcepts {

	public static void main(String[] args) {
		
		//string to integer
		
		String a = "100";
		
		int b = Integer.parseInt(a);
		System.out.println(b+200);

		//string to double
		
		String c = "10.11";
		double d = Double.parseDouble(c);
		System.out.println(d+20);
	
		// integer to string 
		
		int aa = 20;
		String bb = String.valueOf(aa);
		System.out.println(bb+100);
	
	
	}
	
	

}
