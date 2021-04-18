import java.net.URL;
import java.util.*;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


public class CardStack {

    List<Card> stack;
    String data;

    /**
     * Generates a new stack when called, by fetching a json-object from a the 'url'-link.
     * By using
     */
    void newGame() {
        Scanner scanner = null;
        URL url;

        try {
            //Tries to reach and fetch a string form the URL-object 'url'.
            url = new URL("http://nav-deckofcards.herokuapp.com/shuffle");
            scanner = new Scanner(url.openStream());

        } catch (Exception e) {
            //Throws a exception message if a string is not found, and exits the program.
            System.out.println("Finner ikke kortstokk.");
            System.exit(1);
        }
        data = scanner.next();
        scanner.close();

        // Serializes the json string to list of Card objects.
        stack = new Gson().fromJson(data, new TypeToken<List<Card>>() {
        }.getType());
    }

    /**
     * Removes and returns the first card object in the stack.
     *
     * @return A Card object.
     */
    Card hitMe() {
        return stack.remove(0);
    }


}
