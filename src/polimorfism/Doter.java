package polimorfism;

public class Doter extends Parent{
    private String  name;
    private GrendParent grendParent;

    public Doter(String name, String snamr, String grendMotherSerneme) {
        super(name, snamr, grendMotherSerneme);
    }

    public Doter(String name, String snamr, String grendMotherSerneme, GrendParent grendParent) {
        super(name, snamr, grendMotherSerneme);
        this.grendParent = grendParent;
    }

    public void getGrendMatherName() {
        getGrendMotherSerneme();
    }
}
