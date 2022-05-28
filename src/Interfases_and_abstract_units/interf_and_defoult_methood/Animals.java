package Interfases_and_abstract_units.interf_and_defoult_methood;

abstract class Animals {
private String color;
private int waigh;

    public Animals(String color, int waigh) {
        this.color = color;
        this.waigh = waigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWaigh() {
        return waigh;
    }

    public void setWaigh(int waigh) {
        this.waigh = waigh;
    }
    public void aboutAnimal() {
        System.out.println(" aboutAnimal Color: " + color + ", waight= " + waigh);
    }

}
