package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 19/04/17.
 */
public class CalcPounds implements ICalculate{

    private double mass;
    private double surfaceGravity;
    private String planetName;
    private double weight;


    @Override
    public String getCalcName() {
        return "Calculation in Pounds";
    }


    @Override
    public List<String> calcWeight(double input) {


        HashMap<String, Double> map = new HashMap<>();


        for(Planets planets : Planets.values()) {

            planetName = String.valueOf(planets);

            mass = planets.getMass();

            surfaceGravity = planets.getSurfaceGravity();

            weight = surfaceWeight(input);

            map.put(planetName, weight);
        }

        ArrayList<String> list = new ArrayList<>();

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, String::compareTo);
        for (String key: keys) {
            list.add("Weight on " + key + " is " + map.get(key));
        }
        return list;
    }


    // returns weight in pounds
    @Override
    public double surfaceWeight(double mass) {return mass * surfaceGravity * 2.2; }





}