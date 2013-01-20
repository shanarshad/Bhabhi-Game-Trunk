/**
 * 
 */
package com.android.game.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ch.Shan
 *
 */
/**
 * Specification of the suit values for a standard deck of cards.
 */
public final class Suit implements Comparable<Object> {
   private String name;
   private String symbol; 
   
   /**
    * The suit clubs.
    */
   public final static Suit CLUBS = new Suit( "Clubs", "c" );
   /**
    * The suit diamonds.
    */
   public final static Suit DIAMONDS = new Suit( "Diamonds", "d" );
   /**
    * The suit hearts.
    */
   public final static Suit HEARTS = new Suit( "Hearts", "h" );
   /**
    * The suit spades.
    */
   public final static Suit SPADES = new Suit( "Spades", "s" );
   
   
  /**
   * List of all suit values.  Primarily for use with iteration.
   */
   public final static List<Suit> VALUES = 
      Collections.unmodifiableList( 
         Arrays.asList( new Suit[] { CLUBS, DIAMONDS, HEARTS, SPADES } ) );
   
   
   // Constructor - declared private as only the predefined values should
   // be used by the client.
   /**
    * Instantiates a new suit.
    *
    * @param nameValue the name value
    * @param symbolValue the symbol value
    */
   private Suit( final String nameValue, final String symbolValue ) {
      name = nameValue;
      symbol = symbolValue;
   }
       

  /**
   *  Returns a description of this suit.
   *  @return the name of the suit.
   */
   public String getName() {
       return name;
   }
 
 
 /**
   *  The symbol associated with this suit.  Returns the symbol, which
   *  usually constitutes a single character, in the form of a string.
   *  Symbol is used for the construction of the filenames of the card images.
   *  @return string containing the symbol for the suit.
   */ 
   public String getSymbol() {
      return symbol;
   }
    
    
  /**
   * Returns a description of this suit.
   * @return the name of this suit.
   */
   public String toString() {
      return name;
   }
   
   
  /** 
   *  Compares the suits.  Used for the purpose of sorting cards in a hand or deck.
   *  @param otherSuitObject the other suit.
   *  @return < 0 if this suit is lower than the other suit, 0 if the suits
   *  are the same, or > 0 if this suit is higher than the other suit.
   */   
   public int compareTo( Object otherSuitObject ) {
      Suit otherSuit = (Suit) otherSuitObject;
      return VALUES.indexOf( this ) - VALUES.indexOf( otherSuit );
   } 
    
}
