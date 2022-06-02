package hw8.realiz_interfase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Shape cir = new Circle();
//        cir.print();
//
//        Shape elip = new Elips();
//        elip.print();
//
//        Shape qaud = new Quad();
//        qaud.print();
//
//        Shape diamnd = new Diamond();
//        diamnd.print();
//
//        Shape triangle = new Triangel();
//        triangle.print();

        new Printer().printShape(new Circle());
        new Printer().printShape(new Elips());
        new Printer().printShape(new Quad());
        new Printer().printShape(new Diamond());
        new Printer().printShape(new Triangel());

    }
}
