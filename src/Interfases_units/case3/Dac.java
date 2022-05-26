package Interfases_units.case3;

 class Dac implements Flyiable, Swimable {
    private String color;
    private int weight;

    public Dac(String color, int weight) {
        this.color = color;
        if (weight == 0) {
            this.weight = DEFAULT_WAIGHT;
        } else {

            this.weight = weight;
        }
    }
    public Dac(String color) {
        this(color, DEFAULT_WAIGHT);
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
        System.out.println("Dac can fly!");
    }

    @Override
    public void swim() {
        System.out.println("Dac swim");
    }

    @Override
    public void defFlay1() {
        System.out.println("Big DAC slow fliy " + DEFAULT_WAIGHT);
    }
}
