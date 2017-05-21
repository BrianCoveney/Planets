package ie.cit.brian.inhabitants;

/**
 * Created by brian on 19/05/17.
 */
public class Earthling {
    private String name;
    private double weight;

    public Earthling(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Earthling{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
