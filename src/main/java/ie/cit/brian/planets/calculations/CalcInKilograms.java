package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 19/04/17.
 */
public class CalcInKilograms implements ICalculate{


    private Map<Planets, Double> map = new HashMap<>();
    private ICollection planetMap;


    // Spring Setter-based Dependency Injection
    public void setPlanetMap(ICollection planetMap) {
        this.planetMap = planetMap;
    }

    @Override
    public String getCalcName() {
        return "Calculation in Kilograms";
    }


    // this method sorts alphabetically
    @Override
    public List<String> calculationResult(double input) {

        map = planetMap.createMap(input);

        List<String> arrayList = new ArrayList<>();

        for(Planets key : map.keySet()) {
            arrayList.add("Weight on " + key + " is " + map.get(key));
        }

        // sort alphabetically
        Collections.sort(arrayList, String::compareTo);

        return arrayList;

    }

}


