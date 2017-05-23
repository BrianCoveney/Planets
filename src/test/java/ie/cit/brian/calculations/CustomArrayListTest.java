package ie.cit.brian.calculations;

import ie.cit.brian.planets.Planets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brian on 23/05/17.
 */
public class CustomArrayListTest {


    private CustomArrayList<Planets> list;
    private static int EIGHT_PLANETS = 8;
    private static int SEVEN_PLANETS = 7;

    @Before
    public void setUp() throws Exception {
        list = new CustomArrayList<>();
        list.add(Planets.MERCURY);
        list.add(Planets.VENUS);
        list.add(Planets.EARTH);
        list.add(Planets.MARS);
        list.add(Planets.JUPITER);
        list.add(Planets.SATURN);
        list.add(Planets.URANUS);
        list.add(Planets.NEPTUNE);
    }

    @Test
    public void add() throws Exception {
        int i = 0;
        for(Planets planet : Planets.values()) {
            assertEquals(list.get(i), planet);
            i++;
        }
    }

    @Test
    public void remove() throws Exception {
        // given
        assertEquals(list.get(2), Planets.EARTH);
        assertEquals(list.size(), EIGHT_PLANETS);

        // when
        list.remove(2);

        //then
        assertEquals(list.get(2), Planets.MARS);
        assertEquals(list.size(), SEVEN_PLANETS);

    }

}