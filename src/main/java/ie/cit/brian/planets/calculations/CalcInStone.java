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

    // Spring Setter-based Dependency Injection
    public void setPlanetEnumMap(ICollection planetEnumMap) {
        this.planetMap = planetEnumMap;
    }


    @Override
    public String getCalcName() {
        return "Calculation in Stone";
    }



    // sorts the Map by 'value' and ascending order
    @Override
    public List<String> calculationResult(double input) {

        /**
         * @see PlanetEnumMap#createMap(double)
         */
        enumMap = planetMap.createMap(input);


        // here is a List to represent the sorted map
        List<Map.Entry<Planets, Double>> list;
        list = SortMap.sortMapByValue(enumMap); // sort using our generic method


        List<String> arrayList = new ArrayList<>();
        for(Map.Entry<Planets, Double> entry : list) {
            Planets planet = entry.getKey();
            Double weight = entry.getValue();

            arrayList.add("Weight on " + planet + " is " + weight);

        }

        return arrayList;
    }

}

