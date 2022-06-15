package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Collection collection = new ArrayList(); //-створюється колеекція обєктів
// -створюється колеекція де буде (наприклід String)?
// церобиться для того щоб була додаткова перевірка на те що
// добавляється строчка

        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ddd");
        System.out.println("Size befoer " + collection.size());
        print(collection);
        deletAllElements(collection);
        System.out.println("Size after dellet " + collection.size());
    }

    private static void print(Collection<String> collection) {
        for (String elem : collection) {
            System.out.println(elem);
        }
    }

//    private static void print(Collection<String> collection) {
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }

    //fo delet element from collection = new ArrayList<>, need used iterator:
    private static void deletAllElements(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        int i = 0 & 2;
        System.out.println("i = " + i);
    }
}
