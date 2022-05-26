package polimorfism;

class GrendParent {
    private String grendMotherSerneme;

    public GrendParent(String grendMotherSerneme) {
        this.grendMotherSerneme = grendMotherSerneme;
    }

    public String getGrendMotherSerneme() {
        return grendMotherSerneme;
    }

    public void setGrendMotherSerneme(String grendMotherSerneme) {
        this.grendMotherSerneme = grendMotherSerneme;
    }

    public void printGrendMotherSername() {
        System.out.println("GrendParent print: " + getGrendMotherSerneme());
    }
}
