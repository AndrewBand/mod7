package streams.exercise1;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String nationality;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String nationality) {
        this(name, age);
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age==employee.age && Objects.equals(name,employee.name)
                && Objects.equals(nationality, employee.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nationality);
    }

    @Override
    public String toString() {
        return "Employee {Age=" + age + ", name: " + name + ", nationality: " + nationality + "}";
    }
}
