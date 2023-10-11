package com.models.game.cards.purchase;

import java.util.EnumMap;
import java.util.Map;

public class Game {

    /*
      Should return true if the player has enough gems to purchase a Card
    */
    public boolean canPurchase(Player player, Card card ) {

        for (Map.Entry<Gem, Integer> cardEntry : card.getGems().entrySet()) {
            Gem cardGem = cardEntry.getKey();
            if (!player.getGems().containsKey(cardGem)) {
                return false;
            }
            Integer playerCardCount = player.getGems().get(cardGem);
            if (playerCardCount < cardEntry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Game game = new Game();

        Map<Gem, Integer> playersGems = new EnumMap<>(Gem.class);
        playersGems.put(Gem.BLUE, 3);
        playersGems.put(Gem.GREEN, 2);
        Player player = new Player(playersGems);

        Map<Gem, Integer> cardGems = new EnumMap<>(Gem.class);
        cardGems.put(Gem.BLUE, 3);
        cardGems.put(Gem.GREEN, 2);
        Card card = new Card("G", cardGems);

        final boolean canPurchase = game.canPurchase(player, card);
        System.out.println("Can purchase? " + canPurchase);

        Map<Gem, Integer> playersGems2 = new EnumMap<>(Gem.class);
        playersGems2.put(Gem.BLUE, 3);
        playersGems2.put(Gem.GREEN, 2);
        Player player2 = new Player(playersGems2);

        Map<Gem, Integer> cardGems2 = new EnumMap<>(Gem.class);
        cardGems2.put(Gem.BLUE, 1);
        cardGems2.put(Gem.GREEN, 1);
        Card card2 = new Card("G", cardGems2);

        final boolean canPurchase2 = game.canPurchase(player2, card2);
        System.out.println("Can purchase? " + canPurchase2);

    }
}
