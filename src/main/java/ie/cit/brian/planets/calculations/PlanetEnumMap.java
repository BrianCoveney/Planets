package ie.cit.brian.planets.calculations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brian on 22/04/17.
 */
public class PlanetEnumMap implements ICollection {


    private double surfaceGravity;
    private double weight;
    private static final double KG_TO_STONE = 0.15747304;
    private Map<Planets, Double> mapOfPlanets;

    public PlanetEnumMap() {
        mapOfPlanets = new HashMap<>();
    }

    @Override
    public Map<Planets, Double> setMapOfPlanets(double value) {

        for (Planets planet : Planets.values()) {

            surfaceGravity = planet.getSurfaceGravity();

            weight = value * surfaceGravity * KG_TO_STONE;

            mapOfPlanets.put(planet, weight);
        }

        return mapOfPlanets;
    }
}