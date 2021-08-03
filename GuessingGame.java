/**
 * This program creates a random number in the range of 1 to 100 and asks 
 * the user to guess it. If the user wishes, the game can be restarted.
 * 
 * I used this tutorial to help with looping:
 * https://www.java-made-easy.com/guessing-game.html
 * 
 * @Agne Januskeviciute
 * @2020-02-20
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
  public static void main (String[] args)
  {
    //Declaring new random and scanner classes:
    Random rand = new Random();      
    Scanner keyboard = new Scanner(System.in);
      
    //Declaring variables used for the loop:
    int guess;
    boolean win=false;
    int numberToGuess;
    int numberofTries;
    char repeat; 
    String play;

     do //Keeps looping while the user input is Y or y with at least one game
     {
       numberToGuess = rand.nextInt(100);
       numberofTries = 0;
       
       System.out.println ("Guess a number between 1 and 100: ");
       do        
       {        
        guess = keyboard.nextInt();
        numberofTries ++;
        
        if(guess == numberToGuess)
        {        
         win = true;
        }
        else if (guess < numberToGuess)
        {
         System.out.println("Your guess is too low.");
         System.out.println("Guess again: ");
        }
        else if (guess > numberToGuess)
        {
         System.out.println("Your guess is too high.");
         System.out.println("Guess again: ");
        }                
        
       } while (guess != numberToGuess);
       //I've discovered that with other loops it is not working as well 
       //as it does not go through even once, so I chose do-while for both loops.
       
       System.out.print ("You win! Good job, you got it after " + numberofTries);
       System.out.println (" guesses. Would you like to play again (Y or N)?");      
      
       play = keyboard.next();
       repeat = play.charAt(0); //Reads the very first character
       
     } while (repeat == 'Y' || repeat == 'y'); //Accepts two inputs
          
     if (repeat != 'Y' || repeat != 'y') //Goodbye message
     {
        System.out.println("Thanks for playing!");
     }
   } 
} 

  

