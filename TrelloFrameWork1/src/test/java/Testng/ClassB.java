package Testng;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups = "smoke")
	public void friendReq() {
	System.out.println("friend req has been executed");
	}
	@Test(groups = "Compatability")
	public void profilepage() {
		System.out.println("profile page has been executed");
	}

}
