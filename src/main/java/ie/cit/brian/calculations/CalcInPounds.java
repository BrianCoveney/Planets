package ie.cit.brian.calculations;

import ie.cit.brian.planets.Planets;
import ie.cit.brian.planets.PoundConversion;

import java.util.*;

/**
 * Created by brian on 19/04/17.
 */
public class CalcInPounds implements ICalculate{

    private IMap planetTreeMap;

    public CalcInPounds() {}

    // Spring Setter-based Dependency Injection
    public void setPlanetTreeMap(IMap planetTreeMap) {
        this.planetTreeMap = planetTreeMap;
    }

    @Override
    public String getCalcName() {
        return "Calculation in Pounds";
    }

    // sorts the Map by 'key' and alphabetical order
    @Override
    public List<String> calcWeightOnPlanet(double input) {
        /**
         * dependency injection
         * @see PoundConversion#planetAndWeight(double)
         * @see beans.xml -> comment: injecting the dependency of objects using autowiring
         */
        Map<Planets, Double> map = planetTreeMap.planetAndWeight(input);

        // enums are returned in the order in which they were declared.
        // here we sort the enums (by key) alphabetically
        TreeMap<Planets, Double> treeMap = new TreeMap<Planets, Double>(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        treeMap.putAll(map);

        // formatting
        List<String> arrayList = new ArrayList<>();
        for(Map.Entry entry : treeMap.entrySet()){
            arrayList.add("Weight on " + entry.getKey() + " is " + entry.getValue());
        }
        return arrayList;
    }


}