package com.models.game.cards.exceptions;

public class NonExistentCardException extends RuntimeException {
    public NonExistentCardException(String message) {
        super(message);
    }
}
