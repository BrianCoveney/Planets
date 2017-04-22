package ie.cit.brian.planets.calculations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brian on 21/04/17.
 */
public class PlanetHashMap implements ICollection {

    private double surfaceGravity;
    private double weight;
    private Map<Planets, Double> mapOfPlanets;

    public PlanetHashMap() {
        mapOfPlanets = new HashMap<>();
    }

    @Override
    public Map<Planets, Double> setMapOfPlanets(double value) {

        for (Planets planet : Planets.values()) {

            surfaceGravity = planet.getSurfaceGravity();

            weight = value * surfaceGravity;

            mapOfPlanets.put(planet, weight);
        }

        return mapOfPlanets;
    }

}