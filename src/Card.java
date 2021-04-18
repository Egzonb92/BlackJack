/**
 * A class that holds the card details and returns black jack values or a string representation of the cards.
 */

public class Card {
    private String suit;
    private String value;

    /**
     * Converts the value of the card to black jack value.
     *
     * @return The number value of the card if its a number card,
     * 11 if the card is an Ace or 10 for other picture cards.
     */
    int getCardValue() {
        if (value.equals("A")) return 11;
        else if ("KQJ".contains(value)) return 10;
        else {
            return Integer.parseInt(value);
        }
    }

    /**
     * Concatenates the first letter to the suit of the card with the value of the card.
     *
     * @return A string , i.e. H9.
     */
    String getCard() {
        return suit.toCharArray()[0] + value;
    }
}
