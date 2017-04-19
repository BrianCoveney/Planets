package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 19/04/17.
 */
public class CalcPounds implements ICalculate{


    public String getCalcName() {
        return "Calculation in Pounds";
    }


    @Override
    public List<String> calculateWeight(Double input) {

        Double weight;
        Double weightRounded;
        String planet = null;

        HashMap<String, Double> map = new HashMap<>();

        // Weight in Pounds
        for (ICalculate p : WeightInPounds.values()) {

            planet = String.valueOf(p);
            weight = p.surfaceWeight(input);
            weightRounded = Math.round(weight * 100D) / 100D;

            map.put(planet, weightRounded);
        }


        ArrayList<String> list = new ArrayList<>();

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, String::compareTo);
        for (String key: keys) {
            list.add("Weight on " + key + " is " + map.get(key));
        }
        return list;
    }



    // not called
    @Override
    public double surfaceWeight(double param) {
        return 0;
    }



}