package hw8.realize_abstract;

class Circle extends Shape {
    private static String name = "circule";
    private double radius;
    public double square;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void countSquare() {
        square = Math.PI * radius * radius;
        System.out.println("Override square = " + square);
    }
}

class Elips extends Shape {
    private static final String name = "elips";

    public Elips(String name, double sight1, double sight2) {
        super("elips", sight1, sight2);
    }

    @Override
    public void countSquare() {
        System.out.println("Override square = " + Math.PI * getSight1() * getSight2());
    }
}

class Quad extends Shape {
    private static final String name = "quadrat";

    public Quad(String name, double sight1, double sight2) {
        super( "quadrat", sight1, sight2);
    }
}

class Diamond extends Shape {
    private static final String name = "diamant";

    public Diamond(String name, double sight1, double sight2) {
        super("diamant", sight1, sight2);
    }
}

class Triangel extends Shape {
    private static final String name = "triangle";

    public Triangel(String name, double sight1, double sight2) {
        super("triangle", sight1, sight2);
    }

    @Override
    void countSquare() {
        System.out.println("Override square = " +  getSight1() *(0.5)* getSight2());
    }
}

