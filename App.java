package week5CodingProject;

// Question 6. Create a class named App that has a main method.

//a In this class instantiate an instance of each of your logger classes 
 //that implement the Logger interface.

//b. Test both methods on both instances, passing in Strings of your choice.


public class App {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		 logger.log("Hello");
		 logger.error("Hello");
		 
		 Logger logger1 = new SpacedLogger();
		 logger1.log("GoodBye");
		 logger1.error("GoodBye");
		 
		
	}
	

}
