package hw8.realiz_interfase;

 class Circle implements Shape{
    private static final String name = "circule";

     @Override
     public void print() {
         System.out.println("name = " + name);
     }
//     private int radius;
}

class Elips implements Shape {
    private static final String name = "elips";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
}

class Quad implements Shape {
    private static final String name = "quadrat";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
}

class Diamond implements Shape {
    private static final String name = "diamant";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
}

class Triangel implements Shape {
    private static final String name = "triangle";

    @Override
    public void print() {
        System.out.println("name = " + name);
    }
}

