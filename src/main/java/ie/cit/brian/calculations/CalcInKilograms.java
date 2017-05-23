package ie.cit.brian.calculations;

import ie.cit.brian.planets.Planets;

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

        CustomArrayList<String> customArrayList = new CustomArrayList<>();


        for (Planets key : map.keySet()) {
            customArrayList.add("Weight on " + key + " is " + map.get(key));

        }

        return customArrayList;
    }

}







































