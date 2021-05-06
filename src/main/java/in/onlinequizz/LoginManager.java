package in.onlinequizz;
import java.util.*;

public class LoginManager 
{
	static HashMap<String, String> loginList = new HashMap<String, String>();
	
	/**
	 * This method is used to create account for the new users
	 * 
	 * @param userName
	 * @param password
	 * @return void
	 */
	public static void signup(String userName, String password) 
	{
		loginList.put(userName, password);
	}
	/**
	 * This method is used to display the existing login credentials
	 * 
	 * @return void
	 */
	public static void displayUsers() 
	{
		for (String i : loginList.keySet()) 
		{
			System.out.println("User Name: " + i );
		}
	}
	
	/**
	 * This method is used to check for the existing users
	 * 
	 * @param userName
	 * @param password
	 * @return true if the entered details is exists
	 */
	public static boolean isExist(String userName, String passsword)
	{
		boolean status=false;
		if(loginList.containsKey(userName) || loginList.containsValue(passsword))
		{
			status=true;
		}
		return status;
	}
	
	/**
	 * This method is used to check the login credentials of the existing users
	 * 
	 * @param userName
	 * @param password
	 * @return true if the login credentials is correct and exists
	 */
	public static boolean signin(String userName, String password)
	{
		boolean status=false;
		if(((String)loginList.get(userName)==password) && isExist(userName,password)==true)
		{
			status=true;
		}
		return status;
	}
	
	/**
	 * This method is used to change the password of the users
	 * 
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return void
	 */
	
	public static void forgotPassword(String userName,String newPassword)
	{
		if((loginList.containsKey(userName)==true) && (loginList.containsValue(newPassword)==false))
		{
			loginList.replace(userName,newPassword);
			System.out.println(loginList);
		}
		else
		{
			System.out.println("Enter Correct Details");
		}
	}
	/*public static void main(String[] args) 
	{
		signup("sentha","sentha@17");
		displayUsers();
		signup("udhaya","udhaya@05");
		displayUsers();
		System.out.println("Is Exists? "+isExist("sentha","sentha@17"));
		System.out.println("Is Valid? "+signin("udhaya","udhaya@05"));
		forgotPassword("sentha","sentha@17","sentha@14");
		System.out.println("Is Exists? "+isExist("sentha","sentha@14"));
		
	}*/
}

	