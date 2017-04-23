package ie.cit.brian.planets.calculations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by brian on 19/04/17.
 */
public class CalcInPounds implements ICalculate{

    private Map<Planets, Double> treeMap = new TreeMap<>();
    private ICollection planetTreeMap;


    public CalcInPounds() {}

    public void setPlanetTreeMap(ICollection planetTreeMap) {
        this.planetTreeMap = planetTreeMap;
    }

    @Override
    public String getCalcName() {
        return "Calculation in Pounds";
    }


    @Override
    public <T> String calculationResult(double input) {

        // dependency injection
        treeMap = planetTreeMap.setMapOfPlanets(input);



        List<String> arrayList = new ArrayList<>();

        List<Planets> arrayListKeys = new ArrayList<>(treeMap.keySet());
        for (Planets key: arrayListKeys) {
            arrayList.add("Weight on " + key + " is " + treeMap.get(key));
        }


        return String.valueOf(treeMap.toString());
    }

}