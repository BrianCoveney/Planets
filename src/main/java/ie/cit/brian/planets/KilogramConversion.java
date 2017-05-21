package ie.cit.brian.planets;

import ie.cit.brian.calculations.IMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brian on 21/04/17.
 */
public class KilogramConversion implements IMap {

    public KilogramConversion() { }
    @Override
    public Map<Planets, Double> planetAndWeight(double value) {

        Map<Planets, Double> mapOfPlanets = new HashMap<>();

        for (Planets planet : Planets.values()) {
            double surfaceGravity = planet.getSurfaceGravity();
            double weight = value * surfaceGravity;
            mapOfPlanets.put(planet, weight);
        }

        return mapOfPlanets;
    }

}