import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    // getTenRolls = write  a method  that will generate  and return an array with 10 random numbers between 1 and 20
    // getRamdomLetter = write a method that will
    //1 create an array within the method containing the alphabet
    //2generate an random index between 0-25  and use it to pull the letter out of the array
    //3 return the random letter
    //getPassword = write a method that uses that uses the previous method to create an array of eight- character words.
    //the array must be length passed is as an int  return the array of passwords
    //suffleArray sensei bonus

    public ArrayList<Integer> getTenRolls(){
        // int[] diceRoll ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; don't know where to go from here
        //below this works when change class from arraylist to int but test is asking for arraylist.
        // Random rand = new Random();
        // int diceRoll = rand.nextInt(20);
        // for (int i=1 ; i<=10 ; i++){
        // }

        // Now with ArrayList
        //first must declare the variable type
        ArrayList<Integer> diceRoll= new ArrayList<Integer>();
        // Now we call the function random
        //this is called dependency injection  you are creating an instance of the Random class
        //it contains all of the methods associated with random under the hood
        Random rand= new Random();
        //now a loop to add 10 random numbers to the array out of 20
        for(int i= 1; i<=10; i++){
            //the nextInt() *starts* the random seed (the weird formula in the  documentation)
            //20 would be out of bound if we didn't add +1
            diceRoll.add(rand.nextInt(20)+1);
        }

        return diceRoll;
       

    }

    // public String getRandomLetterWithArray(){
    //     Random rand = new Random();
    //     //this is just a quick way to type all the alphabet in one go 
    //     String alphabeString = "abcdefghigklmnopqrstuvwxyz";
    //     //this creates the  fixed string array with 26 values  
    //     String[] alphabet =new String[26];
    //     // the loop goes through each character and adds it to the array
    //     for(int i= 0 ; i<26; i++) {
    //         alphabet[i] = String.valueOf(alphabeString.charAt(i));
    //         // must check valueOf and  charAt not the best way to solve this there is also casting involved
    //     }
    //     //with the return alphabet[] here is where youd put the index of what value you want returned
    //     //with rand.nextInt() you get a random value
    //     return alphabet[rand.nextInt(26)];
    //
    //another solution
        public String getRandomLetters(){
            Random randLetter= new Random();
            String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
            int alphabeLetter = randLetter.nextInt(26);
            return alphabet[alphabeLetter];}

}    
