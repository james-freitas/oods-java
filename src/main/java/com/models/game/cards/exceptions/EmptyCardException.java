package com.models.game.cards.exceptions;

public class EmptyCardException extends RuntimeException {
    public EmptyCardException(String message) {
        super(message);
    }
}

