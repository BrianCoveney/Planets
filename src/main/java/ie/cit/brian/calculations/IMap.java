package ie.cit.brian.calculations;

import ie.cit.brian.planets.Planets;

import java.util.Map;

/**
 * Created by brian on 21/04/17.
 */
public interface IMap {

    Map<Planets, Double> planetAndWeight(double value);

}
