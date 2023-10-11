package com.models.game.cards.deck.enums.exceptions;

public class EmptyCardException extends RuntimeException {
    public EmptyCardException(String message) {
        super(message);
    }
}

