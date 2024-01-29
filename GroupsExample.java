package TESTNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsExample {

	@BeforeGroups("owner")
	public void beforeownerMethod() {
		System.out.println("before owner group");
	}
	@BeforeGroups("broker")
	public void beforebrokermethod() {
		System.out.println("before broker group");
	}
	@Test (groups = {"owner"})
	public void ownermethod1() {
		System.out.println("owner method 1");
	}
	@Test (groups= {"owner"})
	public void ownermehtod2( ) {
		System.out.println("owner method 2");
	}
	@Test (groups= {"broker"})
	public void brokermethod1() {
		System.out.println("broker method 1");
	}
    @Test (groups = {"broker"})
   public void brokermethod2() {
    	System.out.println("brokermethod 2");
    }
    @Test (groups = {"broker","owner"})
    public void brokerandownermethod() {
    	System.out.println("broker and owner both method");
    }
    @AfterGroups("broker")
    public void Afterbrokermethod() {
    	System.out.println("after broker group");
    }
    @AfterGroups("owner")
    public void Afterownermethod() {
    	System.out.println("After owner group");
    }
}


