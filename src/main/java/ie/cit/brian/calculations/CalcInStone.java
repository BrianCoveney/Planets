package ie.cit.brian.calculations;

import ie.cit.brian.helpers.SortMap;
import ie.cit.brian.planets.StoneConversion;
import ie.cit.brian.planets.Planets;

import java.util.*;

/**
 * Created by brian on 20/04/17.
 */
public class CalcInStone implements ICalculate  {

    private IMap planetEnumMap;

    public CalcInStone() { }

    // Spring Setter-based Dependency Injection
    public void setPlanetEnumMap(IMap planetEnumMap) {
        this.planetEnumMap = planetEnumMap;
    }

    public String getCalcName() {
        return "Calculation in Stone";
    }

    // sorts the Map by 'value' in ascending order
    @Override
    public List<String> calcWeightOnPlanet(double input) {
        /**
         * dependency injection
         * @see StoneConversion#planetAndWeight(double)
         */
        Map<Planets, Double> enumMap = planetEnumMap.planetAndWeight(input);

        // here is a List to represent the sorted map
        List<Map.Entry<Planets, Double>> list;

        // sort using our generic method
        list = SortMap.sortMapByValue(enumMap);

        List<String> arrayList = new ArrayList<>();
        for(Map.Entry<Planets, Double> entry : list) {
            Planets planet = entry.getKey();
            Double weight = entry.getValue();

            arrayList.add("Weight on " + planet + " is " + weight);
        }
        return arrayList;
    }

}

