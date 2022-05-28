package hw8.realize_abstract;

class Circle implements Shape {
    private static final String name = "circule";
    private double radius;
    public double square;

     public Circle() {
     }
     public Circle(double radius) {
         this.radius = radius;
     }

     @Override
     public void print() {
         System.out.println("name = " + name);
     }

     @Override
     public void countSquare() {
        square = Math.PI*radius*radius;
         System.out.println("square = " + square);
     }


 }

class Elips implements Shape {
    private static final String name = "elips";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
    @Override
    public void countSquare() {

    }
}

class Quad implements Shape {
    private static final String name = "quadrat";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
    @Override
    public void countSquare() {

    }
}

class Diamond implements Shape {
    private static final String name = "diamant";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
    @Override
    public void countSquare() {

    }
}

class Triangel implements Shape {
    private static final String name = "triangle";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
    @Override
    public void countSquare() {

    }
}

