package javaPrograms;

import java.util.ArrayList;

public class TC007_ArrayLIstConcepts {
	
	/*1.raw arraylist
		ArrayList name = new ArrayList();
	
	2.generics array list
		ArrayList<datatype> = new ArrayList<datatype>();*/
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----------------Raw Arraylist-----------------------------
		
		/*ArrayList al = new ArrayList();
		al.add("Shobana");
		al.add("govindaraju");
		al.add('g');
		al.add(23);
		al.add(19.87);
		al.add(true);
		al.add(false);
		
		//al.remove(5);
		
		int ArrayLength = al.size();
		
		for(int i=0;i<ArrayLength;i++)
		System.out.println("index number is " +i+ " = "+ al.get(i));
		*/
	//----------------------Generics list------------------
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	
	int ArrayLength = al.size();
	for(int i=0;i<ArrayLength;i++)
		System.out.println("index number is " +i+ " = "+ al.get(i));
	
	
		
		
	}

}
