package ie.cit.brian.planets.app;

import ie.cit.brian.planets.calculations.ICalculate;
import ie.cit.brian.planets.calculations.Planets;
import ie.cit.brian.planets.helpers.NegativeNumberException;
import ie.cit.brian.planets.writers.IWriter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by brian on 17/04/17.
 */
public class Main {

    private ICalculate calculate;
    private IWriter writer;


    public void setCalculateType(ICalculate calculate) { this.calculate = calculate; }
    public void setWriterType(IWriter writer) { this.writer = writer; }

    public static void main(String[] args) {


        // this code hooks into the Spring container
        // and tells is to perform the task of wiring together the beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        BeanFactory factory = context;
        Main main = (Main) factory.getBean("calcbean");

        main.execute();



    }


    private void execute() {


        double earthWeightInKg = 175;

        System.out.print("Enter your weight in kg: ");
        Scanner input = new Scanner(System.in);
        earthWeightInKg = input.nextDouble();

        if(earthWeightInKg < 0) {
            throw new NegativeNumberException();
        }

        double mass = earthWeightInKg / Planets.EARTH.getSurfaceGravity();

        writer.showResult(calculate.getCalcName() + ": \n"
                + calculate.calculationResult(mass));


    }

}
