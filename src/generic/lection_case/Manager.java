package generic.lection_case;

public class Manager {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mandger name" + name;
    }
}
