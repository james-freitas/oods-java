package com.models.game.cards.deck.enums;

import com.models.game.cards.deck.enums.exceptions.EmptyCardException;
import com.models.game.cards.deck.enums.exceptions.NonExistentCardException;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards;

    /**
     * Constructor. Create a Hand object that is initially empty.
     */
    public Hand() {
        this.cards = new ArrayList<>();
    }

    /**
     * Add a non-null card c to the hand
     * @throws EmptyCardException if c is null.
     */
    public void addCard(Card card) {
        if (card == null) {
            throw new EmptyCardException("Could not add empty card to the hand");
        }
        cards.add(card);
    }

    /**
     * Remove the card in the specified position from the
     * hand.  Cards are numbered counting from zero.
     * @throws NonExistentCardException if the specified
     * position does not exist in the hand.
     */
    public void removeCard(int position) {
        if (position < 0 || position > cards.size() - 1) {
            throw new NonExistentCardException("Card not found in the hand");
        }
        cards.remove(position);
    }

    public List<Card> getCards() {
        return cards;
    }
}
