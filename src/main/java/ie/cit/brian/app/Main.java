package ie.cit.brian.app;

import ie.cit.brian.calculations.ICalculate;
import ie.cit.brian.helpers.NegativeNumberException;
import ie.cit.brian.inhabitants.Earthling;
import ie.cit.brian.inhabitants.Martian;
import ie.cit.brian.inhabitants.Solarian;
import ie.cit.brian.planets.Planets;
import ie.cit.brian.writers.IWriter;
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


        Solarian<Earthling> earthlingSolarian = new Solarian<>();
        Solarian<Martian> martianSolarian = new Solarian<>();
        Earthling earthling = new Earthling("Brian", 175);
        Martian martian = new Martian("Frank", 66.4);

        earthlingSolarian.setSolarian(earthling);
        martianSolarian.setSolarian(martian);

//        System.out.println("\n"+earthlingSolarian.getSolarian().toString());
//        System.out.println(martianSolarian.getSolarian().toString()+ "\n");

        // hard coded
        double earthWeightInKg = earthling.getWeight();
        displayResult(earthWeightInKg);


        // user input
        System.out.print("Enter your weight in kg: ");
        Scanner input = new Scanner(System.in);
        earthWeightInKg = input.nextDouble();

        if(earthWeightInKg < 0) {
            throw new NegativeNumberException();
        }

        displayResult(earthWeightInKg);

    }





























    public void displayResult(double weightInKg) {

        double mass = weightInKg / Planets.EARTH.getSurfaceGravity();

        writer.showResult(calculate.getCalcName() + ": \n"
                + calculate.calcWeightOnPlanet(mass) + "\n");

    }

}



















