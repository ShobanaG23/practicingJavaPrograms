package javaPrograms;

/*1. search product---enter
2. search product---product name
3.search product---department name---product name*/


public class methodOverloadingAmazonExample {

	public static void main(String[] args) {
		searchProduct("electronics","laptop");

	}

		public static void searchProduct() {
			System.out.println("clicked on search button");
					}
		
		
		
		public static void searchProduct(String productName) {
			
			System.out.println("product name is entered---"+productName);
			System.out.println("clicked on search button");
			
		}
		
		public static void searchProduct(String deptName, String productName) {
			System.out.println("Department name is entered----"+deptName);
			System.out.println("product name is entered---"+productName);
			System.out.println("clicked on search button");	
		}
}




