package ie.cit.brian.planets.calculations;

import java.util.List;

/**
 * Created by brian on 17/04/17.
 */
public interface ICalculate {

    String getCalcName();

    List<String> calculationResult(double input);

}
