package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jashan
 * @author Jashanpreet Kaur Jan 28, 2023 
 modifier  jashan   branch code  netbeans
 fetch+merge
 */

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
      Scanner s1=new Scanner(System.in);
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
                card.setValue((int)(1+(Math.random()*13)));
    // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             card.setSuit(Card.SUITS[(int)(1+(Math.random()*3))]);
             
             hand[i]=card;
  // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            // ---------
        }
        
        
System.out.println("Enter the value you guessed of card from 1 to 13  ");
        int value=s1.nextInt();
        
        System.out.println("Enter the value you guessed of suit  from 1 to 4  ");
        int suit=s1.nextInt();
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        
        Card a1=new Card();
        a1.setValue(value);
        a1.setSuit(Card.SUITS[3]);
        
        // Then loop through the cards in the array to see if there's a match.
        
        
        
        
          // If the guess is successful, invoke the printInfo() method 
        boolean b1=false;
        for(int i=0; i<hand.length; i++)
        {
            if((hand[i].getValue()== a1.getValue()) && (hand[i].getSuit()== a1.getSuit())){
                b1=true;
            
                printInfo();
                break;
            }
            
           
        }
         if(!b1){
                System.out.println("Sorry Try Again");
            }
        
       
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Jashanpreet  Jan 2023
     */
    
    
    // "I AM DONE!!!"
    private static void printInfo() {
    
        System.out.println("Congratulations,your guess was right!");
        System.out.println();
        
        System.out.println("My name is JASHANPREET KAUR, but you can call me jashan ");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To do my best to achieve my aim");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Listening Music");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Driving");

        System.out.println();
        
    
    }

}
