package com.models.game.cards.purchase;

import java.util.Map;

public class Player {

    private Map<Gem, Integer> gems;

    public Player(Map<Gem, Integer> gems) {
        this.gems = gems;
    }

    public Map<Gem, Integer> getGems() {
        return gems;
    }
}
