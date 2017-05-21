package ie.cit.brian.planets;

import ie.cit.brian.calculations.IMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by brian on 22/04/17.
 */
public class PoundConversion implements IMap {
    private static double KG_TO_POUNDS = 2.2;

    public PoundConversion() { }

    @Override
    public Map<Planets, Double> planetAndWeight(double value) {
        Map<Planets, Double> treeMap = new TreeMap<>();

        for (Planets planet : Planets.values()) {
            double surfaceGravity = planet.getSurfaceGravity();
            double weight = value * surfaceGravity * KG_TO_POUNDS;
            treeMap.put(planet, weight);
        }
        return treeMap;
    }
}
