package Interfases_and_abstract_units.case5_default;

class Dac5 extends Bird5  {

    private int weight;

    public Dac5( int weight) {

        this.weight=weight;

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
                "color='" + super.getColor() + '\'' +
                ", weight=" + weight +
                '}';
    }


}
