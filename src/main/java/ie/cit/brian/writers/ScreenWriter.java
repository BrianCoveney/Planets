package ie.cit.brian.writers;

/**
 * Created by brian on 18/04/17.
 */
public class ScreenWriter implements IWriter{

    public ScreenWriter() {
    }

    @Override
    public void showResult(String input) {

        String formatted = input.toString()
                .replace("{", "")
                .replace("}", "")
                .replace("]", "")
                .replace("[", "")
                .replace(", ", "\n");

        System.out.println(formatted);

    }
}
