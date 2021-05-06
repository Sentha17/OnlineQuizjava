package in.onlinequizz;
import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest 
{
	// Test Cases for creating new login details 1
	
	@Test
	public void testSignup1() 
	{
		LoginManager.signup("Sentha","Sentha@17");
	}
	
	// Test Cases for display the login details
	
	@Test
	public void testDisplay1() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		LoginManager.displayUsers();
	}
	
	// Test Cases for creating new login details 2
	
	@Test
	public void testSignup2() 
	{
		LoginManager.signup("Udhaya","Udhaya@05");
	}
		
	// Test Cases for display the login details
	
	@Test
	public void testDisplay2() 
	{
		LoginManager.signup("Udhaya","Udhaya@05");
		LoginManager.displayUsers();
	}
	
	// Test Cases for checking the correct existing login details
	
	@Test
	public void testExist1() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.isExist("Sentha","Sentha@17");
		assertTrue(valid);
	}
	
	// Test Cases for checking the incorrect existing login details
	
	@Test
	public void testExist2() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.isExist("SENTHA","Sentha123");
		assertFalse(valid);
	}
	
	// Test Cases for checking the login details with correct user name and password
	
	@Test
	public void testSignin1() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.signin("Sentha","Sentha@17");
		assertTrue(valid);
	}
	
	// Test Cases for checking the login details with correct user name and in correct password
	
	@Test
	public void testSignin2() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.signin("Sentha","Sentha123");
		assertFalse(valid);
	}
	
	// Test Cases for checking the login details with in correct user name and correct password
	
	@Test
	public void testSignin3() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.signin("SENTHA","Sentha@17");
		assertFalse(valid);
	}
	
	// Test Cases for checking the login details with in correct user name and in correct password
	
	@Test
	public void testSignin4() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		boolean valid=LoginManager.signin("SENTHA","Sentha123");
		assertFalse(valid);
	}
	
	// Test Cases for changing the password
	
	@Test
	public void testForgotPassword() 
	{
		LoginManager.signup("Sentha","Sentha@17");
		LoginManager.forgotPassword("Sentha","Sentha123");
	}
	
	// Test Cases for checking the login details with correct user name and in correct password
	
	@Test
	public void testSignin5()
	{
		LoginManager.forgotPassword("Sentha","Sentha123");
		boolean valid=LoginManager.signin("Sentha","Sentha123");
		assertTrue(valid);
	}

}
