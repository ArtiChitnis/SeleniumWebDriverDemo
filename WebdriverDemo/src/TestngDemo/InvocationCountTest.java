package TestngDemo;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount=10)
	public void test() {
	
		int a=10, b=20, c;
		c = a+b;
		System.out.println("Sum of a & b is " +c);
		
	}
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
	
		String r = "100A";
		Integer.parseInt(r);
		
	}
	
	

}
