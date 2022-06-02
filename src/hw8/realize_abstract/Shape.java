package hw8.realize_abstract;

abstract class Shape {
    private static String name;
    private double sight1;
    private double sight2;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(double sight1, double sight2) {
        this.sight1 = sight1;
        this.sight2 = sight2;
    }

    public Shape(String name, double sight1, double sight2) {
        this.name = name;
        this.sight1 = sight1;
        this.sight2 = sight2;
    }

    public double getSight1() {
        return sight1;
    }

    public void setSight1(double sight1) {
        this.sight1 = sight1;
    }

    public double getSight2() {
        return sight2;
    }

    public void setSight2(double sight2) {
        this.sight2 = sight2;
    }

    public void print() {
        System.out.println("name = " + name);
    }

     void countSquare() {
         System.out.println("square of " + name + "  = " + getSight1()*getSight2());
     }
}
