package task2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	@task1.before
	Account obj=new Account("Hasnain","Islamabad","123",1234,2000,"10/10/2020");
	
	@Test
	public void test() {
		obj.makeDeposit(500);
		assertEquals(2500,obj.getBalance());
		
		obj.makeWithdrawal(1000);
		assertEquals(1500,obj.getBalance());
		
		obj.transferAmount(1234,500);
		assertEquals(1000,obj.getBalance());
		assertEquals(2,obj.getTransitions());
		assertEquals(1000,obj.getBalance());
		
		obj.makeDeposit(25000);
		assertEquals(26000,obj.getBalance());
		assertEquals(650,obj.calculateZakat());
	}
}