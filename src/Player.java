import java.util.ArrayList;

/**
 * A class that holds the players name, its cards and generates a sum of the black jack values of the cards.
 */
public class Player {

    private String name;
    int sum;
    ArrayList<Card> cards = new ArrayList();

    /**
     * Constructor that creates a player object.
     *
     * @param name The name of the newly created player.
     */
    Player(String name) {
        this.name = name;
    }

    /**
     * Deals a card to the player, by adding it as a card object to the 'cards' ArrayList
     * and adds the card value to the players sum.
     *
     * @param card The card that is added to the player.
     */
    void hit(Card card) {
        cards.add(card);
        sum += card.getCardValue();
    }

    /**
     * Generates a string representation of the players cards.
     * It concatenates all cards string representations to one string.
     *
     * @return A string with all the players cards.
     */
    String getCards() {
        String cardsAsString = "";
        for (Card card : cards) {
            if (!cardsAsString.equals("")) cardsAsString += ",";
            cardsAsString += card.getCard();
        }
        return cardsAsString;
    }

}
