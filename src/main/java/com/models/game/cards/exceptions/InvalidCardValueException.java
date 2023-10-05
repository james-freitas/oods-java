package com.models.game.cards.exceptions;

public class InvalidCardValueException extends RuntimeException {
    public InvalidCardValueException(String message) {
        super(message);
    }
}
