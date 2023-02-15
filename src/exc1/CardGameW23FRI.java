/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc1;

/**
 *
 * @author User
 */
import java.util.*;
import java.util.Random;
public class CardGameW23FRI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Card[] hand = new Card[7];
       
       Random random = new Random();
       
       for(int i = 0;i<hand.length;i++){
           int value = random.nextInt(13)+1;
           String suit = Card.SUITS[random.nextInt(4)];
           Card card = new Card(value,suit);
           hand[i]=card;         
       }//end of for to create hand 
       
       Scanner input = new Scanner(System.in);
       System.out.println("enter a suit for userguess: 0,1,2,3");
      int suit = input.nextInt();
      System.out.println("enter a value for usergess");
      int value = input.nextInt();
      
      Card userGuess= new Card(value,Card.SUITS[suit]);
     //print hand
     for (Card card:hand){
         System.out.println(card.getValue()+ "   "+card.getSuit());
     }
      //check the macth in below code
      boolean match =false;
      for(Card card:hand){
          if(card.getValue()==userGuess.getValue()
             && card.getSuit().equals(userGuess.getSuit())){
              match=true;
              break;
          }//end of if
       }//end of for 
       if(match){
           System.out.println("You guessed it right");
       }   //end of if
       else
           System.out.println("You guessed it wrong");
      
    }//end of main    
}//end of class

