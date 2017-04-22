package ie.cit.brian.planets.calculations;

/**
 * Created by brian on 17/04/17.
 */
public interface ICalculate {

    String getCalcName();



    <T> String calculationResult(double input);

}
