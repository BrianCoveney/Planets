package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 20/04/17.
 */
public class CalcInStone implements ICalculate{


    private Map<Planets, Double> enumMap = new EnumMap<>(Planets.class);
    private ICollection planetMap;

    public void setPlanetEnumMap(ICollection planetEnumMap) {
        this.planetMap = planetEnumMap;
    }


    @Override
    public String getCalcName() {
        return "Calculation in Stone";
    }


    @Override
    public <T> String calculationResult(double input) {

        /**
         * @see PlanetEnumMap#setMapOfPlanets(double)
         */
        enumMap = planetMap.setMapOfPlanets(input);


        // here is a List to represent the sorted map
        List<Map.Entry<Planets, Double>> list;
        list = sortMapByValue(enumMap);


        // here is ArrayList which will hold and return our string
        String output;
        List<String> arrayList = new ArrayList<>();
        for(Map.Entry<Planets, Double> entry : list) {
            Planets planet = entry.getKey();

            output = "Weight on " + planet + " is " + entry.getValue();
            arrayList.add(output);

        }

        return arrayList.toString();
    }


    // here is a generic method that takes a Map and sorts it based on its Value, in ascending order
    public static <K, V extends Comparable<? super V>> List<Map.Entry<K, V>> sortMapByValue(Map<K, V> map ) {

        List<Map.Entry<K, V>> mapList = new LinkedList(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        return mapList;
    }



}

