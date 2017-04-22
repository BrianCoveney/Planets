package ie.cit.brian.planets.calculations;

/**
 * Created by brian on 17/04/17.
 */
public enum Planets {

    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN(5.685e+26, 6.027e7),
    URANUS(8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);

    // Universal gravitational constant in m^3 / kg s^2
    private static final double G = 6.67300E-11;

    private double mass;
    private double radius;
    private double surfaceGravity;


    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        setSurfaceGravity();
    }

    public void setSurfaceGravity() {
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double getSurfaceGravity() { return surfaceGravity; }

    public double getMass() { return mass; }

    public double getRadius() { return radius; }




}




































