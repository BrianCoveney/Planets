package ie.cit.brian.planets.calculations;

import ie.cit.brian.planets.helpers.SortMap;
import ie.cit.brian.planets.writers.ScreenWriter;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
        for(Map.Entry<String, Integer> entry : list) {
            output = entry.getKey() + " " + entry.getValue();
            arrayList.add(output);
        }

        screenWriter.showResult(arrayList.toString());
    }

}