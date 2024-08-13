package Testng;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups ="Integration")
	public void loginpage() {
		System.out.println("login page has been executed");
		
	}
	@Test(groups ="smoke")
	public void logoutpage() {
		System.out.println("logoutpage has been executed");
	}
	@Test(groups = "functional+")
	public void homepage() {
		System.out.println("homepage has been executed");
	}

}
