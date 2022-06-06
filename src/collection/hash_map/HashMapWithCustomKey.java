package collection.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomKey {

    public static void main(String[] args) {
        Map<Employee, String> emm = new HashMap<>();

        Employee employee1 = new Employee(1,"Di");
        Employee employee2 = new Employee(1,"Di");
        emm.put(employee1, "Ukrain");
        emm.put(employee2, "Londin");
        System.out.println("emm = " + emm);
//кастомний ключ працює неправельно.
// його тре перевизначит.
// правила перевизначення:
// 1. о1.equals(o2) ==> o1.hashcode() == o2.hashcode()
// o1.hashcode() == o2.hashcode() <> о1.equals(o2)
// -перевизначити hashcode quals
// -використ тіж поля
//
//    3 привила для equals:
// 1. о1.equals(о1)
// 2. о1.equals(о2) == о2.equals(о1)
// 3. о1.equals(о2) ?? о3.equals(о2) => о1.equals(о3)
// до перевизначення був такий вивід:
// emm = {{Employee: id=1, name=Di}=Londin, {Employee: id=1, name=Di}=Ukrain}
//
// а ось після:
// emm = {{Employee: id=1, name=Di}=Londin}

    }
}
