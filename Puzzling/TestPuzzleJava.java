import java.util.ArrayList;
import java.util.Random;

//name of our main class..here is what the program will look into to start the program
public class TestPuzzleJava {
    
// here is where we include our static void main. There can only be one and it belongs here
	public static void main(String[] args) {

		//here we call the class and make the intantiantion of the class 
		//generator = new copy of the class
		PuzzleJava generator = new PuzzleJava();
		//throught generator.*** we call the methods included in the original class
		// we must declare the data type equal to the method's
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		// int randomRolls = generator.getTenRolls();
		//randomRolls will hold what the intance of what the method generates
		System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		//..
		//using the  generator.*** we can call the rest of the methods we create
		System.out.println(generator.getRandomLetters());
		
	}
}
