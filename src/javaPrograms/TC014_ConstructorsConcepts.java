package javaPrograms;

/*1.constructors are always non-static
2.we dont return any value,
3. dont use void
4. need to create reference, while executing a constructor. */

public class TC014_ConstructorsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub----------with arguments constructor------------
		
		TC014_ConstructorsConcepts objref = new TC014_ConstructorsConcepts("shobana");
		
	}
	
	public TC014_ConstructorsConcepts(String name)
	{
		System.out.println(name);
		
	}
		
		
		
		
		/* ----------------------method--------------------
		 * TC014_ConstructorsConcepts objref = new TC014_ConstructorsConcepts();
		int retval = objref.displayname();
		System.out.println(retval);
	}

	public int displayname() {
		int no1;
		no1=100;
		return no1;*/
}
