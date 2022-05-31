package Interfases_and_abstract_units.interf_and_defoult_methood;

abstract class Animals  implements Flay{
private String color;
private int weight;

    public Animals(String color, int weight) {
        this.color = color;
        this.weight = weight;
        System.out.println("Constructor set color weight");
        System.out.println(Math.PI*weight*weight);
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
    public void aboutAnimal() {
        System.out.println(" aboutAnimal Color: " + color + ", weight= " + weight);
    }

}
