package ie.cit.brian.planets.calculations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by brian on 19/04/17.
 */
public class CalcKilograms implements ICalculate{



    public String getCalcName() {
        return "Calculation in Kilograms";
    }



    @Override
    public List<String> calculateWeight(Double input) {

        Double weight;
        Double weightRounded;
        String planet;

        HashMap<String, Double> map = new HashMap<>();


        // Weight in Kilograms
        for (ICalculate p : WeightInKilograms.values()) {
            // key
            planet = String.valueOf(p);

            // value
            weight = p.surfaceWeight(input);
            weightRounded = Math.round(weight * 100D) / 100D;

            map.put(planet,  weightRounded);
        }

        List<String> list = new ArrayList<>();

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


