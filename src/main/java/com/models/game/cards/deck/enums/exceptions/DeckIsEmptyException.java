package com.models.game.cards.deck.enums.exceptions;

public class DeckIsEmptyException extends RuntimeException {
    public DeckIsEmptyException(String message) {
        super(message);
    }
}
