package ie.cit.brian.calculations;

import ie.cit.brian.helpers.SortMap;
import ie.cit.brian.writers.ScreenWriter;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by brian on 23/04/17.
 */
public class CalcInStoneTest {


    private ScreenWriter screenWriter;
    private Map<String, Integer> map = new HashMap<>();
    private List<String> letterList = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

    @Before
    public void setUp() throws Exception {

        screenWriter = new ScreenWriter();

        Random random = new Random(System.currentTimeMillis());

        for(String letter : letterList) {
            map.put(letter, random.nextInt());
        }
    }

    @Test
    public void sortMapByValue() throws Exception {

        List<Map.Entry<String, Integer>> list;
        list = SortMap.sortMapByValue(map);

        String output;

        List<String> arrayList = new ArrayList<>();
        int current = 0;
        int previous = 0;
        for(Map.Entry<String, Integer> entry : list) {
            output = entry.getKey() + " " + entry.getValue();

            current = entry.getValue();

            arrayList.add(output);

        }

        previous = current;

        if(previous > 0) {
            assertThat(current >= previous, is(true));
        }


        screenWriter.showResult(arrayList.toString());
    }

}