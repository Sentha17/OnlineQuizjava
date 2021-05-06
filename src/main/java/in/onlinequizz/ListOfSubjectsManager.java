package in.onlinequizz;
import java.util.*;
public class ListOfSubjectsManager 
{
	static ArrayList<String> subjectList = new ArrayList<String>();
	/**
	 * This method is used to add the list of subjects
	 * 
	 * @param subjectName
	 * @return void
	 */
	public static void addSubjects(String subjectName) 
	{
		subjectList.add(subjectName);
	}
	
	/**
	 * This method is used to display the list of subjects
	 * 
	 * @return void
	 */
	public static void displaySubjects() 
	{
		System.out.println("----Available Subjects----");
		for (String i : subjectList) 
		{
			System.out.println(i);
		}
	}
	/*public static void main(String[] args) 
	{
		addSubjects("java");
		displaySubjects();
		addSubjects("HTML");
		addSubjects("JS");
		displaySubjects();
	}*/
}
