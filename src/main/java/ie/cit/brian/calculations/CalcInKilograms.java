package ie.cit.brian.calculations;

import ie.cit.brian.planets.Planets;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by brian on 19/04/17.
 */
public class CalcInKilograms implements ICalculate{

    private IMap planetHashMap;

    // Spring Setter-based Dependency Injection
    public void setPlanetHashMap(IMap planetHashMap) {
        this.planetHashMap = planetHashMap;
    }

    @Override
    public String getCalcName() {
        return "Calculation in Kilograms";
    }

    // this method sorts alphabetically
    @Override
    public List<String> calcWeightOnPlanet(double input) {

        Map<Planets, Double> map = planetHashMap.planetAndWeight(input);

        MyArrayList<String> myArrayList = new MyArrayList();

        for (Planets key : map.keySet()) {

            myArrayList.add("Weight on " + key + " is " + map.get(key));

        }

//        myArrayList.clear();

        // sort alphabetically
        Collections.sort(myArrayList, String::compareTo);
        return myArrayList;
    }

}







































