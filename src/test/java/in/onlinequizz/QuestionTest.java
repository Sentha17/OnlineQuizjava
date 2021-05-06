package in.onlinequizz;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {

	// Test Cases for add questions
	
	@Test
	public void testAddQuestion1() 
	{
		boolean status=QuestionManager.addQuestion(1,"What is a correct syntax to output \"Hello World\" in Java?");
		assertTrue(status);
	}
	
	// Test Cases for display the questions
	
	@Test
	public void testDisplayQuestion1() 
	{
		QuestionManager.addQuestion(1,"What is a correct syntax to output \"Hello World\" in Java?");
		QuestionManager.addQuestion(2,"How do you insert COMMENTS in Java code?");
		QuestionManager.displayQuestions();
	}
	
	// Test Cases for remove the specific question
	
	@Test
	public void testRemoveQuestion1() 
	{
		QuestionManager.addQuestion(1,"What is a correct syntax to output \"Hello World\" in Java?");
		QuestionManager.addQuestion(2,"How do you insert COMMENTS in Java code?");
		boolean status=QuestionManager.removeQuestion(1);
		QuestionManager.displayQuestions();
		assertTrue(status);
	}
	
	// Test Cases for replace the specific question
	
	@Test
	public void testReplaceQuestion1() 
	{
		QuestionManager.addQuestion(1,"What is a correct syntax to output \"Hello World\" in Java?");
		QuestionManager.addQuestion(2,"How do you insert COMMENTS in Java code?");
		QuestionManager.replaceQuestion(1,"What is your name?");
		QuestionManager.displayQuestions();
	}

}
