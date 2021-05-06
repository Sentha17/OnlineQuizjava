package in.onlinequizz;

import java.util.ArrayList;

public class OptionManager 

{
	static ArrayList<String> optionsArrayList=new ArrayList<String>();
	/**
	 * This method is used to add the options in array list
	 * 
	 * @param options
	 * @return void
	 */
	public static void addOptions(String options)
	{
		for(int i=0; i<=4; i++)
			optionsArrayList.add(options);
	}
	
	/**
	 * This method is used to remove the particular option in hash map
	 * 
	 * @param optionName
	 * @return void
	 */
	
	public static void removeOptions(String options)
	{
		int index=optionsArrayList.indexOf(options);
		optionsArrayList.remove(index);
	}
	
	/**
	 * This method is used to change the particular option in hash map
	 *
	 * @param optionName
	 * @param options
	 * @return void
	 */
	
	public static void replaceOption(Integer optionNumber, String newOption)
	{
		int index=optionNumber-1;
		optionsArrayList.set(index,newOption);
	}
	
	/**
	 * This method is used to display the options in hash map
	 * 
	 * @return void
	 */
	 
	public static void displayOptions() 
	{
		char j='a';
		for (String i :optionsArrayList) 
		{
			System.out.println(j+") "+i);
			j++;
		}
		System.out.println("\n");
	}

}
