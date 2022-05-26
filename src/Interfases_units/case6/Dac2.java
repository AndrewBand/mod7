package Interfases_units.case6;

class Dac2 extends Bird2 implements Flyiable2{
    private String color;
    private int weight;

    public Dac2(String color, int weight) {
        this.color = color;
        this.weight=weight;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dac{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public void fly() {

    }

    @Override
    public void defFlay() {
        Flyiable2.super.defFlay();
    }
}
