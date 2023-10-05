package com.models.game.cards;

import com.models.game.cards.enums.Suit;
import com.models.game.cards.enums.Type;
import com.models.game.cards.exceptions.DeckIsEmptyException;

import java.util.*;

public class Deck {

    private Deque<Card> cards = new ArrayDeque<>();

    private Deque<Card> generateCards(Suit suit) {
        for(int i = 1; i <= 13; i++) {
            switch (i) {
                case 1: { cards.add(new Card(suit, i, Type.ACE)); }
                break;
                case 11: { cards.add(new Card(suit, i, Type.JACK)); }
                break;
                case 12: { cards.add(new Card(suit, i, Type.QUEEN)); }
                break;
                case 13: { cards.add(new Card(suit, i, Type.KING)); }
                break;
                default: { cards.add(new Card(suit, i, Type.COMMON_CARD)); }
            }
        }
        return cards;
    }

    /*
     *  Constructor Creates a not shuffled deck of cards
     */
    public Deck() {
        this.cards = generateCards(Suit.CLUBS);
        this.cards = generateCards(Suit.HEARTS);
        this.cards = generateCards(Suit.SPADES);
        this.cards = generateCards(Suit.DIAMONDS);
    }

    /*
     * Returns all cards of the deck
     */
    public Deque<Card> getCards() {
        return cards;
    }

    /*
     *  Shuffle all the existent cards of the deck
     *  in a random order
     */
    public void shuffle() {
        List<Card> list = new ArrayList<>(cards.stream().toList());
        Collections.shuffle(list);
        cards = new ArrayDeque<>(list);
    }

    /*
     * Deals one card from the deck and returns it
     * @throws DeckIsEmptyException if no more cards are left
     */
    public Card dealCard() {
        if(cards.isEmpty()) {
            throw new DeckIsEmptyException("Can't deal card. Deck is empty");
        }
        return cards.pop();
    }
}
