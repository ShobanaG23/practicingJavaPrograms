package javaPrograms;

import java.util.ArrayList;

public class TC010_ReturnTypeConcepts {

	public static void main(String[] args) {
		/*
		ArrayList retval = coursecontent("api");
		
		System.out.println(retval);*/
		//---------------to check value is existing or not-------------
		
		String expval = "maven";
		boolean status=true;
		ArrayList retval = coursecontent("selenium");
		int n = retval.size();
		for(int i=0;i<n;i++)
		{
		
			System.out.println(retval.get(i));
					if(retval.get(i)==expval) {
				status=true;                        // to check only if the vslue is resent or not
				//System.out.println(retval.get(i)  +" :pass----minium is found");
				break;
			} else 
				status=false;
			
				//System.out.println(retval.get(i) +" :fail----minium is not found");
		}
		
		if(status==true) {
			System.out.println(expval  +" :pass----maven is found");
		
		} else {
			System.out.println(expval +" :fail---maven is not found");
		}
		/*int n=retval.size();
		for(int i=0;i<n;i++) {
			System.out.println(retval.get(i));
		}*/
		
	}
		// TODO Auto-generated method stub
		/*-----------return single type 
		 * System.out.println(addition());	
	}

	public static int addition() {
		int no1=100,no2=50,result;
		result=no1+no2;
		return result;
	}*/
		
	//-------------return multiple items-------------
		//selinium------------java,webdriver,testng,maven,github,jenkin
		//api--------------postman, soapui,restassured
		
		public static ArrayList coursecontent(String coursename) {
		
		ArrayList al = new ArrayList();
		
		if(coursename=="selenium")
		{
			al.add("java");
			al.add("webdriver");
			al.add("testng");
			al.add("maven");
			al.add("github");
			al.add("jenkin");
			al.add("minium");
			
		} else if(coursename=="api") {
			al.add("postman");
			al.add("soapui");
			al.add("restassured");
		}
		return al;
		
		
		
		
		}
		}
			
		

