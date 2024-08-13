package Testng;

import org.testng.annotations.Test;

public class ClassC {
	@Test(groups = "functional")
	public void Eventspage() {
		System.out.println("Events page has been Executed");
	}
	@Test(groups = "integration")
	public void savedItems() {
		System.out.println("saved items has been executed");
	}

}
