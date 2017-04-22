package ie.cit.brian.planets.calculations;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by brian on 22/04/17.
 */
public class PlanetTreeMap implements ICollection {

    private double surfaceGravity;
    private double weight;
    private static double KG_TO_POUNDS = 2.2;
    private Map<Planets, Double> mapOfPlanets;

    public PlanetTreeMap() {
        mapOfPlanets = new TreeMap<>();
    }

    @Override
    public Map<Planets, Double> setMapOfPlanets(double value) {

        for (Planets planet : Planets.values()) {

            surfaceGravity = planet.getSurfaceGravity();

            weight = value * surfaceGravity * KG_TO_POUNDS;

            mapOfPlanets.put(planet, weight);
        }

        return mapOfPlanets;
    }
}
