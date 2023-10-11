package com.models.game.cards.deck.enums;

import com.models.game.cards.deck.enums.exceptions.InvalidCardValueException;

public class Card {

    private final Suit suit;
    private final Integer value;
    private final Type type;

    /*
     *  Constructor: Create valid card
     */
    public Card(Suit suit, Integer value, Type type) {

        validateCard(value, type);

        this.suit = suit;
        this.value = value;
        this.type = type;
    }

    private static void validateCard(Integer value, Type type) {

        if (type == Type.ACE && value != 1) {
            throw new InvalidCardValueException("Invalid card value for ace");
        }
        if (type == Type.JACK && value != 11) {
            throw new InvalidCardValueException("Invalid card value for jack");
        }
        if (type == Type.QUEEN && value != 12) {
            throw new InvalidCardValueException("Invalid card value for queen");
        }
        if (type == Type.KING && value != 13) {
            throw new InvalidCardValueException("Invalid card value for king");
        }
    }
}
