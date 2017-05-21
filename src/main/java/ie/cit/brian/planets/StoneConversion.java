package ie.cit.brian.planets;

import ie.cit.brian.calculations.IMap;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by brian on 22/04/17.
 */
public class StoneConversion implements IMap {
    private static final double KG_TO_STONE = 0.15747304;

    public StoneConversion() {}

    @Override
    public Map<Planets, Double> planetAndWeight(double value) {
        Map<Planets, Double> enumMap = new EnumMap<>(Planets.class);

        for (Planets planet : Planets.values()) {
            double surfaceGravity = planet.getSurfaceGravity();
            double weight = value * surfaceGravity * KG_TO_STONE;
            enumMap.put(planet, weight);
        }
        return enumMap;
    }
}
