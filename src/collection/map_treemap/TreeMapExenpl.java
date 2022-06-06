package collection.map_treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExenpl {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1 < o2) return -1; // if change - to + chenge oreder out
//                if (o1 > o2) return 1;// if change - to + chenge oreder out
//                return 0;
                return Integer.compare(o1, o2); //ідентично тому що вище
            }
        });
//        treeMap.descendingMap();
//        treeMap.descendingKeySet();
        treeMap.put(0, "a");
        treeMap.put(2, "f");
        treeMap.put(3, "j");
        treeMap.put(3, "m");
        treeMap.put(5, "a");
        treeMap.put(4, "s");
        treeMap.put(6, "q");
        System.out.println("treeMap = " + treeMap.descendingMap());

        SortedMap<Integer, String> headMap = treeMap.headMap(5, false);
        System.out.println("headMap = " + headMap);
        SortedMap<Integer, String> tailMap = treeMap.tailMap(5, false);
        System.out.println("tailMap = " + tailMap);

        TreeMap<Employee, String> treeMapEmpl = new TreeMap<>();
        Employee employee2 = new Employee(1, "Oleks");
        treeMapEmpl.put(employee2, "UR");
        Employee employee1 = new Employee(5, "Andr");
        treeMapEmpl.put(employee1, "UK");
        Employee employee3 = new Employee(3, "Ivan");
        treeMapEmpl.put(employee3, "UK");

        System.out.println("treeMapEmpl = " + treeMapEmpl);
//всегда добавлять comparable
        // verrais hashCode
    }
}
