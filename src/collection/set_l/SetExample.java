package collection.set_l;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        //СТРУКТУРА:
        //hashcode
        //---------------
        //key
        //---------------
        //next element
        //---------------
        // тре переопреділити іквалс і хешкод
        Set<String> set = new HashSet<>();
        set.add("Eng");
        set.add("Eng");
        set.add("eng");
        set.add("eng");
        System.out.println("set.contains(\"eng\") = " + set.contains("eng"));
        System.out.println("set = " + set);


        Set<String> setTree = new TreeSet<>();

        setTree.add("A");
        setTree.add("A");
        setTree.add("A");
//        setTree.add(null); // thread NullPointerException
        System.out.println("setTree = " + setTree);
    }
}
