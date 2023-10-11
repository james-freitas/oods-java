package com.models.game.cards.purchase;

import java.util.Map;

public class Card {

    private String color;

    private Map<Gem, Integer> gems;

    public Card(String color, Map<Gem, Integer> gems) {
        this.color = color;
        this.gems = gems;
    }

    public Map<Gem, Integer> getGems() {
        return gems;
    }
}

