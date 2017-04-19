package ie.cit.brian.planets.writers;

/**
 * Created by brian on 18/04/17.
 */
public class ScreenWriter implements IWriter{

    public ScreenWriter() {
    }

    @Override
    public void showResult(String input) {

        String removedBrackets = input.toString().replace("[", "").replace("]", "");

        String result = removedBrackets.toString().replace(", ", "\n");


        System.out.println(result);

    }
}
