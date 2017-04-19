package ie.cit.brian.planets.writers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * Created by brian on 18/04/17.
 */
public class DataFileWriter implements IWriter {

    private static final String SEPARATOR = File.separator;
    private static final String PATH_TO_DESKTOP = System.getProperty("user.home") + SEPARATOR + "Desktop" + SEPARATOR + "output.txt";


    @Override
    public void showResult(String result) {

        File file = new File(PATH_TO_DESKTOP);
        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new java.io.FileWriter(file, true));
            bufferedWriter.newLine();
            bufferedWriter.write(result);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
