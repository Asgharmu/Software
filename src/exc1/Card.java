/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc1;

/**
 *
 * @author User
 */
public class Card {
    
    public static final String[] SUITS=
    {"Hearts","Diamonds","Spades","Clubs"};
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    private int value;
    private String suit;

    public int getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

}
