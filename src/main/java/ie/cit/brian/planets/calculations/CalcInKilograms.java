package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 19/04/17.
 */
public class CalcInKilograms implements ICalculate{


    private Map<Planets, Double> map = new HashMap<>();
    private ICollection planetMap;


    public void setPlanetMap(ICollection planetMap) {
        this.planetMap = planetMap;
    }

    @Override
    public String getCalcName() {
        return "Calculation in Kilograms";
    }


    @Override
    public <T> String calculationResult(double input) {

        map = planetMap.createMap(input);

        List<String> arrayList = new ArrayList<>();

        for(Planets key : map.keySet()) {
            arrayList.add("Weight on " + key + " is " + map.get(key));
        }

        Collections.sort(arrayList, String::compareTo);

        return String.valueOf(arrayList);
    }

}


