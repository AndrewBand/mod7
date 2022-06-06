package collection.map_treemap;

public class Employee implements Comparable<Employee>{
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

//    @Override
//    public int hashCode() {
//        return Object.hash(id, name);
//    }

    @Override
    public String toString() {
        return "{Employee: id=" + id + ", name=" + name + "}";
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id < o.id) return -1;
        if (this.id > o.id) return 1;
        return 0;
    }
}
