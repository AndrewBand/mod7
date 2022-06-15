package streams;

public class Employee {
    private String name;
    private int id;
    private UserStatus status;

    public Employee(int id, String name, UserStatus status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee {ID=" + id + "name: " + name + " ststus- " + status + "}";
    }
}
