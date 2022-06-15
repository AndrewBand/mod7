package collection.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
    public static void main(String[] args) {
        //реализпция Map на основе хеш таблицы, отдельная структура данных сделаная для оптимизации поиска и вставки
        //состоит из
        // БАГЕТА - промежуточный масив, содержыт ссылку на основные масивы 8 шт
        //вычислется хешкод ключа
        // по хешкоду узнаем в акой бакет записать наш елемент ентри (значение key , value)
        //hashcode - integer 2^32

        //-----------------------
        //hashcode
        //-----------------------
        //key = a@gmail
        //-----------------------
        //value = "Son value"
        //-----------------------
        //nex
        //-----------------------

        Map<String, String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Spain", "Madrid");
        map.put("Ukrain", "Kiev");
        map.put("Spain", "MadridO");
        map.put(null, null);
        map.put(null, null);
        System.out.println("map = " + map);

        Set<Map.Entry<String, String>> entrys = map.entrySet();
        for(Map.Entry<String, String> entry : entrys) {
            System.out.println("Entry:");
            System.out.println("Key= " + entry.getKey());
            System.out.println("Value= " + entry.getValue());
            System.out.println("-----------------------------");
        }
    }
}
