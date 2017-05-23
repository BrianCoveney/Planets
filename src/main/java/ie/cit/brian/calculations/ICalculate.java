package ie.cit.brian.calculations;

import java.util.Collection;

/**
 * Created by brian on 17/04/17.
 */
public interface ICalculate {

    String getCalcName();

    Collection<String> calcWeightOnPlanet(double input);

}
