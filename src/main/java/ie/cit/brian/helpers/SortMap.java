package ie.cit.brian.helpers;

import java.util.*;

/**
 * Created by brian on 23/04/17.
 */
public class SortMap {

    // here is a generic method that takes a Map and sorts it based on its Value, in ascending order
    public static <K, V extends Comparable<? super V>> List<Map.Entry<K, V>> sortMapByValue(Map<K, V> map ) {

        List<Map.Entry<K, V>> mapList = new LinkedList(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        return mapList;
    }
}
