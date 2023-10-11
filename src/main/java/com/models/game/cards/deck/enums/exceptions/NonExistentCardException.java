package com.models.game.cards.deck.enums.exceptions;

public class NonExistentCardException extends RuntimeException {
    public NonExistentCardException(String message) {
        super(message);
    }
}
