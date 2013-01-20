/**
 * 
 */
package com.android.game.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.android.game.cards.Card;

/**
 * @author Shani
 *
 */
/**
 * Represents a deck of playing cards.  In order to have maximum flexibility,
 * this class does not implement a standard deck of playing cards; it only
 * provides the functionality of a deck of cards.  The client programmer must
 * instantiate a Deck object, then populate it with the set of playing cards
 * appropriate for the card game being implemented.
 * 
 */

public class Deck {
   private List<Object> deck;
   private int index;
 
  
  /**
   * Creates an empty deck of cards.
   */
   public Deck() {
      this.deck = new ArrayList<Object>();
      index = 0;
   }
  
  
  /**
   * Adds a card to the deck.
   * @param card card to be added to the deck.
   */
   public void addCard( Card card ) {
      deck.add( card );
   }
  
  
  /**
   * The size of a deck of cards.
   * @return the number of cards present in the full deck.
   */
   public int getSizeOfDeck() {
      return deck.size();
   }
   
   
  /**
   * The number of cards left in the deck.
   * @return the number of cards left to be dealt from the deck.
   */
   public int getNumberOfCardsRemaining() {
      return deck.size() - index;
   }
   
   
  /**
   * Deal one card from the deck.
   * @return a card from the deck, or the null reference if there
   * are no cards left in the deck.
   */
   public Card dealCard() {
      if ( index >= deck.size() ){
         return null;
      
      }else{
         return (Card) deck.get( index++ );
      }
   }
   
   
  /**
   * Shuffles the cards present in the deck.
   */
   public void shuffle() {
      Collections.shuffle( deck );
   }
   
   
  /**
   * Looks for an empty deck.
   * @return <code>true</code> if there are no cards left to be dealt from the deck.
   */
   public boolean isEmpty() {
      return index >= deck.size() ? Boolean.TRUE : Boolean.FALSE;
   }
   
   
  /**
   * Restores the deck to "full deck" status.
   */
   public void restoreDeck() {
      index = 0;
   }   

}