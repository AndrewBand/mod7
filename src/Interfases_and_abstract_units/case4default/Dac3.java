package Interfases_and_abstract_units.case4default;

class Dac3 extends Bird3 implements Flyiable3, Swimable3{
    private String color;
    private int weight;

    public Dac3(String color, int weight) {
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
        System.out.println("Dac flay");
    }

    @Override
    public void swim() {
        System.out.println("Dac flswim");
    }
}
