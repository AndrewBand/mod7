package polimorfism;

public class Parent extends GrendParent {
    private String name;
    private String snamr;

    public Parent(String name, String snamr, String grendMotherSerneme) {
        super(grendMotherSerneme);
        this.name = name;
        this.snamr = snamr;
    }

//    public Parent(String grendMotherSerneme) {
//        super(grendMotherSerneme);
//    }

//    public Parent(String grendMotherSerneme) {
//        super(grendMotherSerneme);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnamr() {
        return snamr;
    }

    public void setSnamr(String snamr) {
        this.snamr = snamr;
    }

    public void liteOn() {
        System.out.println("Parent lite");
    }

    public void printNamr(){
        System.out.println("Parent print namr: " + getName());
    }
}
