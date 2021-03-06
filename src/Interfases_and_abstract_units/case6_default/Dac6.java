package Interfases_and_abstract_units.case6_default;

class Dac6 extends Bird6 implements Flyiable6 {
    private String color;
    private int weight;

    public Dac6(String color, int weight) {
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
        Flyiable6.super.defFlay();
    }
}
