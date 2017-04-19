package ie.cit.brian.planets.app;

import ie.cit.brian.planets.calculations.ICalculate;
import ie.cit.brian.planets.calculations.WeightInKilograms;
import ie.cit.brian.planets.writers.IWriter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by brian on 17/04/17.
 */
public class Main {

    private ICalculate iCalculate;
    private IWriter iWriter;


    public void setCalculateType(ICalculate calculate) { this.iCalculate = calculate; }
    public void setWriterType(IWriter writer) { this.iWriter = writer; }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        BeanFactory factory = context;
        Main main = (Main) factory.getBean("calcbean");

        main.execute();

    }

    public void execute() {

        // example of persons weight on Earth
        double earthWeightInKg = 175;

        double mass = earthWeightInKg / WeightInKilograms.EARTH.getSurfaceGravity();

        iWriter.showResult(iCalculate.getCalcName() + ": \n"
                + iCalculate.calculateWeight(mass));


    }

}
