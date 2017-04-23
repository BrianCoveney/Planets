package ie.cit.brian.planets.calculations;

import ie.cit.brian.planets.helpers.SortMap;

import java.util.*;

/**
 * Created by brian on 20/04/17.
 */
public class CalcInStone implements ICalculate{


    private Map<Planets, Double> enumMap = new EnumMap<>(Planets.class);
    private ICollection planetMap;

    public CalcInStone() { }

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
         * @see PlanetEnumMap#createMap(double)
         */
        enumMap = planetMap.createMap(input);


        // here is a List to represent the sorted map
        List<Map.Entry<Planets, Double>> list;
        list = SortMap.sortMapByValue(enumMap);


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

}

