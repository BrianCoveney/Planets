package ie.cit.brian.planets.calculations;

import java.util.*;

/**
 * Created by brian on 20/04/17.
 */
public class CalcInStone implements ICalculate{


    private Map<Planets, Double> enumMap = new EnumMap<>(Planets.class);
    private ICollection planetMap;

    public void setPlanetEnumMap(ICollection planetEnumMap) {
        this.planetMap = planetEnumMap;
    }


    @Override
    public String getCalcName() {
        return "Calculation in Stone";
    }


    @Override
    public <T> String calculationResult(double input) {


        enumMap = planetMap.setMapOfPlanets(input);

        List<String> linkedList = new LinkedList<>();

        List<Planets> arrayListKeys = new LinkedList<>(enumMap.keySet());
        for (Planets key: arrayListKeys) {
            linkedList.add("Weight on " + key + " is " + enumMap.get(key));
        }
        return String.valueOf(linkedList);
    }




}





//        List<Planets> p = Arrays.asList(Planets.values().clone());
//        ListIterator<Planets> iterator = p.listIterator();

//        int i = 0;
//        while (iterator.hasNext()) {
//
//            planetName = String.valueOf(p);
//            mass = p.get(i).getMass();
//            surfaceGravity = p.get(i).getSurfaceGravity();
//            weight = surfaceWeight(input);
//            treeMap.put(planetName, weight);
//            i++;
//        }