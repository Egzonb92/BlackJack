/**
 * Runs a game of blackjack where a player Egzon picks to cards from a card stack, followed by Marit
 */
public class BlackJack {

    public static void main(String[] args) {
        CardStack stack = new CardStack();
        stack.newGame();

        Player Egzon = new Player("Egzon");
        Player Marit = new Player("Marit");

        Egzon.hit(stack.hitMe());
        Egzon.hit(stack.hitMe());

        Marit.hit(stack.hitMe());
        Marit.hit(stack.hitMe());

        while (Egzon.sum < 17) Egzon.hit(stack.hitMe());
        while (Marit.sum <= Egzon.sum && Egzon.sum < 21) Marit.hit(stack.hitMe());

        String winner = "Egzon";
        if (Egzon.sum > 21 || (Marit.sum > Egzon.sum && Marit.sum <= 21)) winner = "Marit";

        System.out.println("Vinner: " + winner + "\n");
        System.out.println("Egzon | " + Egzon.sum + " | " + Egzon.getCards());
        System.out.println("Marit | " + Marit.sum + " | " + Marit.getCards());
    }

}
