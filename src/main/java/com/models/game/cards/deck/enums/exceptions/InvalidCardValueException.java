package com.models.game.cards.deck.enums.exceptions;

public class InvalidCardValueException extends RuntimeException {
    public InvalidCardValueException(String message) {
        super(message);
    }
}
