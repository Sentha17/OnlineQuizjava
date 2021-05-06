package in.onlinequizz;

import java.util.*;

public class QuestionManager 
{
	static HashMap<Integer, String> questionsList = new HashMap<Integer, String>();
	static int numberOfQuestions;
	
	HashMap<Integer,String> hashmap_Name= new HashMap<Integer,String>();
	/**
	 * This method is used to add the questions in hash map
	 * 
	 * @param questionNumber
	 * @param question
	 * @return void
	 */
	public static boolean addQuestion(Integer questionNumber, String question)
	{
		questionsList.put(questionNumber, question);
		numberOfQuestions=questionsList.size();
		boolean status=false;
		if(questionsList.isEmpty()==false && questionsList.containsValue(question)==true)
		{
			status=true;
		}
		return status;
	}
	
	/**
	 * This method is used to remove the particular question in hash map
	 * 
	 * @param questionNumber
	 * @return void
	 */
	public static boolean removeQuestion(Integer questionNumber)
	{
		questionsList.remove(questionNumber);
		numberOfQuestions=questionsList.size();
		boolean status=false;
		if(questionsList.containsKey(questionNumber)==false)
		{
			status=true;
		}
		return status;
		
	}
	
	/**
	 * This method is used to change the particular question in hash map
	 *
	 * @param questionNumber
	 * @param question
	 * @return void
	 */
	public static void replaceQuestion(Integer questionNumber, String newQuestion)
	{
		questionsList.replace(questionNumber,newQuestion);
	}
	
	/**
	 * This method is used to display the questions in hash map
	 * 
	 * @return void
	 */
	public static void displayQuestions() 
	{
		int j=1;
		System.out.println("Total Number of Questions: "+ numberOfQuestions);
		for (String i :questionsList.values()) 
		{
			System.out.println(j+")"+i);
			j++;
		}
	}
	
	
	
}
