package week5CodingProject;

//Question 3. Create  a class that implement the Logger interface
// Part b.SpacedLogger

//Question 5. Implement the SpacedLogger methods:

//Note:The SpacedLogger should add a space or " " between each 
 //character of the String argument passed into its methods.


//a. If the log method received “Hello” as an argument, it should print H e l l o

//b. The error method should do the same, but with “ERROR:” preceding the 
//spaced out input (i.e. ERROR: H e l l o)




public class SpacedLogger  implements Logger {
	
	

	

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		String input = log;
		for (int i = 0; i < input.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(input.charAt(i));
		}

		System.out.println("Question 5 Part A:" + " " +  result.toString());
		}
		
	
	

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		String input = error;
		for (int i = 0; i < input.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(input.charAt(i));
		}

		System.out.println("Question 5: Part B" + " " + "ERROR:" + " "  +  result.toString());
		}
		
	}


