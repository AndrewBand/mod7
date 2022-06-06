package collection.hash_map;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name); // передаємо всі ті поля по яким будується hashcode
    }
//    3 привила для equals:
// 1. о1.equals(о1)
// 2. о1.equals(о2) == о2.equals(о1)
// 3. о1.equals(о2) ?? о3.equals(о2) => о1.equals(о3)-
@Override
public boolean equals(Object obj) {
    if (this == obj) return  true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Employee employee = (Employee) obj;
    return this.id == employee.id && Objects.equals(this.name, employee.name);
}
    @Override
    public String toString() {
        return "{Employee: id=" + id + ", name=" + name + "}";
    }

}
