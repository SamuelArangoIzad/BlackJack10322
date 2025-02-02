package models;

public class Card {
    public enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES }
    public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters and other utility methods

    public Rank getRank() {
        return rank;
    }
    
    public Suit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return rank.name()+ " " +suit.name();
    }
}

