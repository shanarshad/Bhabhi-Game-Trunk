/**
 * 
 */
package com.android.game.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Shani
 *
 */
/**
 *  Specification of the rank values for a standard deck of cards.
 *  Client has ability to set either the ace or the king to be the
 *  highest ranking card; default is king high.  Ranks are
 *  established in the following ascending order:
 *  <p>King high: ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king.
 *  <p>Ace high: 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace.
 *  <p>Class can be extended for implementation of specialty decks
 *  containing a subset of the standard ranks, e.g. pinnacle.
 */

//Change Comparable type if compare method doesn't give right result.
public final class Rank implements Comparable<Rank> {
   private String name;
   private String symbol;
    
   /** 
    * The rank ace. 
    */
   public final static Rank ACE = new Rank( "Ace", "a" );
   /** 
    * The rank two. 
    */
   public final static Rank TWO = new Rank( "Two", "2" );
   /** 
    * The rank three. 
    */
   public final static Rank THREE = new Rank( "Three", "3" );
   /** 
    * The rank four. 
    */
   public final static Rank FOUR = new Rank( "Four", "4" );
   /**
    * The rank five.
    */
   public final static Rank FIVE = new Rank( "Five", "5" );
   /**
    * The rank six.
    */
   public final static Rank SIX = new Rank( "Six", "6" );
   /** 
    * The rank seven.
    */
   public final static Rank SEVEN = new Rank( "Seven", "7" );
   /**
    * The rank eight.
    */
   public final static Rank EIGHT = new Rank( "Eight", "8" );
   /**
    * The rank nine.
    */
   public final static Rank NINE = new Rank( "Nine", "9" );
   /**
    * The rank ten.
    */
   public final static Rank TEN = new Rank( "Ten", "t" );
   /**
    * The rank jack.
    */
   public final static Rank JACK = new Rank( "Jack", "j" );
   /**
    * The rank queen.
    */
   public final static Rank QUEEN = new Rank( "Queen", "q" );
   /**
    * The rank king.
    */
   public final static Rank KING = new Rank( "King", "k" );
    
   
   /** The Constant VALUES_ACE_HIGH. */
   private final static List<Rank> VALUES_ACE_HIGH =
      Collections.unmodifiableList( 
         Arrays.asList( new Rank[] { TWO, THREE, FOUR, FIVE, SIX, SEVEN,
                                     EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE } ) );
                                     
  /**
   * List of all rank values.  Used primarily for the purpose of iteration.
   */
   public final static List<Rank> VALUES =
      Collections.unmodifiableList( VALUES_ACE_HIGH );
   
   
   // Constructor - declared private as only the predefined values should
   // be used by the client.
   /**
    * Instantiates a new rank.
    *
    * @param nameValue the name value
    * @param symbolValue the symbol value
    */
   private Rank( final String nameValue, final String symbolValue ) {
      this.name = nameValue;
      this.symbol = symbolValue;
   }
   
    
  /**
   *  Returns a description of this rank.
   *  @return the name of this rank.
   */
   public String getName() {
      return name;
   }
    
    
  /**
   *  Returns a description of this rank.
   *  @return the name of this rank.
   */
   public String toString() {
      return name;
   }
    
    
  /**
   *  The symbol associated with this rank.  Returns the symbol, which
   *  usually constitutes a single character, in the form of a string.
   *  Symbol is used for the construction of the filenames of the card images.
   *  @return string containing the symbol for the rank.
   */
   public String getSymbol() {
      return symbol;
   }
    
    
  /** 
   *  Compares the ranks.  Result is dependent on the whether the ace
   *  or the king is considered to be the high rank.
   *  @param otherRankObject the other rank.
   *  @return the arithmetic difference between the compared ranks
   *  based on their ordering in the listing of values.  This result
   *  may differ depending on whether the king or the ace is considered
   *  the high card.  Result will be < 0 if this rank is lower than 
   *  the other rank, 0 if the ranks are the same, or > 0 if this 
   *  rank is higher than the other rank.
   */
   public int compareTo( final Rank otherRankObject ) {
      return VALUES_ACE_HIGH.indexOf( this ) - VALUES_ACE_HIGH.indexOf( otherRankObject );
   }
    
}                    