package hw8.realiz_interfase;

public class Main {
    public static void main(String[] args) {
        Shape cir = new Circle();
        cir.print();

        Shape elip = new Elips();
        elip.print();

        Shape qaud = new Quad();
        qaud.print();

        Shape diamnd = new Diamond();
        diamnd.print();

        Shape triangle = new Triangel();
        triangle.print();
    }
}
