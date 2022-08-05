package javaPrograms;

public class TC0001_TESTCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommonUtils cu = new CommonUtils();
		//cu.enterUserName();
		
		CommonUtils.enterUserName();  //static method----call directly using class name
		cu.enterPassword(); //non-static method-----call using reference
		cu.login();
	}

}
