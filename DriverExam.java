package driverLicense;

/**
The DriverExam class stores data about a driver's license exam
for the Driver�s License Exam programming challenge.
*/

public class DriverExam
{
final int PASSING = 15;       // Minimum # of correct answers to pass
// Array of correct answers
private char[] correct = { 'B', 'D', 'A', 'A',
                           'C', 'A', 'B', 'A',
                           'C', 'D', 'B', 'C',
                           'D', 'A', 'D', 'C',
                           'C', 'B', 'D', 'A' };
private char[] student;       // The student's answers
private int[] missed;         // The missed question numbers
private int numCorrect = 0;   // The number correct
private int numIncorrect = 0; // The number incorrect

/**
   The constructor copies an array of answers
   to the student field.
   @param s The array of answers to copy.
*/

public DriverExam(char[] s)
{
   // Create an array named student for the student answers the size of s parameter.
   student = new char[s.length];
   
   // Copy the student answers.
   for (int i = 0; i < s.length; i++)
      student[i] = s[i];
   
   // Grade the exam.
   gradeExam();
}

/**
   The gradeExam method determines the number of
   correct and incorrect answers. It calls the
   makeMissedArray method.
*/

private void gradeExam()
{
	   //create a for loop to traverse through the student array
 	  	for(int i =0; i<student.length;i++) {
	
	//if the student answer is equal to the correct answer
      		if(student[i] == correct[i]) {
      			numCorrect++;
 	  		//increase number correct
      		
      		}
      		else
      			//else 
      		{
      			
      			//increase number incorrect
      			numIncorrect++;
      		}
      		}
   makeMissedArray();
}  

/**
   The makeMissedArray method makes the missed array and
   stores the numbers of all the questions that the
   student missed in it.
*/

private void makeMissedArray()
{
   int m = 0;  // Index for missed array.
   
   // Did the student miss any questions? create if statement to see if numIncorrect > 0
   if (numIncorrect > 0)
   {
      // Make an int array named missed the size of numIncorrect question numbers.
      missed = new int [numIncorrect];
      for (int i = 0; i < student.length; i++)
      {
         if (student[i] != correct[i])
         {
            // Store the question number (i + 1)
            // in the missed array.
            missed[m] = (i + 1);
            m++;  // Increment missed array index.
         }
      }
   }
}

/**
   The passed method determines whether the student
   passed or failed the exam.
   @return true if the student passed, false otherwise.
*/

public boolean passed()
{
   boolean status;
   //if statement if numcorrect is greater than or equal to PASSING
   
   if(numCorrect >= PASSING)
   {
   
   // set status to true
   status = true;
   
   }
	   
	   // else
   else
   {
   status = false;
   // set status to false
   }
   //return status
   return status;
}

/**
   The totalCorrect method returns the number of
   questions correctly answered.
   @return The number of questions correctly answered.
*/

public int totalCorrect()
{
	   //return number of correct attribute
	  int co = numCorrect;
	
	return co;
}

/**
   The totalInCorrect method returns the number of
   questions incorrectly answered.
   @return The number of questions incorrectly answered.
*/

public int totalIncorrect()
{
   //return number of incorrect attribute
	 int inco = numIncorrect;
	
	return inco; 
}

/**
   The questionsMissed method returns an array containing
   the numbers of the missed questions. 
   @return An array containing the numbers of the missed
           questions.If no questions were missed, returns null.
*/

public int[] questionsMissed()
{
   int[] temp = null;
   
   if (missed != null)
   {
      // First, make a temp array the same length as the missed array.
 	  temp = new int [missed.length];
      // create a for loop to go through all the missed array
      for (int i = 0; i < temp.length; i++) {
     	 //move any missed into the temp array. 
         temp[i] = missed[i];
   }
   }
   // Return the copy.
   return temp;

}


}