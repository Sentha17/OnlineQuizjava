package in.onlinequizz;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListOfSubjectsTest {

	// Test Cases for adding the subject1
	
	@Test
	public void testAddSubjects() 
	{
		ListOfSubjectsManager.addSubjects("Java");
	}
	
	// Test Cases for displaying the subjects
	
	@Test
	public void testDisplaySubjects1() 
	{
		ListOfSubjectsManager.displaySubjects();
	}
	
	// Test Cases for displaying the subjects
	
	@Test
	public void testDisplaySubjects2() 
	{
		ListOfSubjectsManager.addSubjects("HTML");
		ListOfSubjectsManager.addSubjects("JAVA SCRIPT");
		ListOfSubjectsManager.displaySubjects();
	}
}
