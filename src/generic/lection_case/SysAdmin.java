package generic.lection_case;

public class SysAdmin {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'owerr toStr' name: " + name;
    }
}
