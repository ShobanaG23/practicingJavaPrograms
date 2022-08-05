package javaPrograms;

/*Booking tickets----any customer can do
cancelling tickets------only admin can do*/
	
/*	booking tickets							cancelling tickets
 * 1."enter username"						1. "logout"
	2."enter password"
	3."click login"
	*/
public class TC009_MethodConcept_bookingTicketsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------booking tickets-----------");
		login("shobana","test123");
		logout();
		System.out.println();

		System.out.println("-----------calcelling tickets----------");
		login("admin","cancel123");
			
		logout();
		System.out.println();
	}

	public static void login(String username, String password) {
		System.out.println("username is entered as "+ username);
		System.out.println("password is entered as "+password);
		System.out.println("login button is clicked");
		System.out.println();
	}
	
	public static void logout() {
		System.out.println("Logout button is clicked");
	}
}
