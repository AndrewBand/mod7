package hw8.realize_abstract;

import java.util.Scanner;

public class Main {
    static {
        System.out.println("Hight! This program calkulate:");
    }
    public static void main(String[] args) {

        WhotWeeDo weDo = new WhotWeeDo();

        System.out.println("fore help press help or h");

        double radius = 0;
        double radius1 = 0;
        double radius2 = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            String comand = sc.nextLine();
            if (comand.equals("h") || comand.equals("help")) {
                weDo.printWhotDo();
            } else if (comand.equals("c")) {
                System.out.println("Enter radius of circle");
                radius = enterNumber();
                Shape cir = new Circle(radius);
                cir.print();
                cir.countSquare();
                System.out.println("fore help press help or h");
            } else if (comand.equals("e")) {
                System.out.println("Enter radius1 of elips");
                radius1 = enterNumber();
                System.out.println("Enter radius2 of elips");
                radius2 = enterNumber();
                Shape elips = new Elips( "",radius1, radius2);
                elips.print();
                elips.countSquare();
                System.out.println("fore help press help or h");
            } else if (comand.equals("q")) {
                System.out.println("Enter sight of qaud");
                radius1 = enterNumber();
                System.out.println("Enter second sight of qaud");
                radius2 = enterNumber();
                Shape qaud = new Quad( "",radius1, radius2);
                qaud.print();
                qaud.countSquare();
                System.out.println("fore help press help or h");
            } else if (comand.equals("d")) {
                System.out.println("Enter height of diamond");
                radius1 = enterNumber();
                System.out.println("Enter low sight of diamond");
                radius2 = enterNumber();
                Shape diamond = new Diamond( "",radius1, radius2);
                diamond.print();
                diamond.countSquare();
                System.out.println("fore help press help or h");
            } else if (comand.equals("t")) {
                System.out.println("Enter height of triangle");
                radius1 = enterNumber();
                System.out.println("Enter the base of the triangle");
                radius2 = enterNumber();
                Shape triangle = new Triangel( "",radius1, radius2);
                triangle.print();
                triangle.countSquare();
                System.out.println("fore help press help or h");
            } else if (comand.equals("ex")) {
                System.out.println("Bay");
                System.out.println(" SENQ FORE CHOUSE OUR PROGRAM");
                return;
            } else {
                System.out.println("wrong choyce, fore help press help or h");
            }
        }


//Circle cer1 = new Circle(5);
//        cer1.print();
//        cer1.countSquare();

//        Shape elip = new Elips("",6,4);
//        elip.print();
//        elip.countSquare();
//
//        Shape qaud = new Quad("",2,2);
//        qaud.print();
////        qaud.setSight1(10);
////        qaud.setSight2(10);
//        qaud.countSquare();
//
//        Shape diamnd = new Diamond("", 6,5);
//        diamnd.print();
//        diamnd.countSquare();
//
//        Shape triangle = new Triangel("",1,2);
//        triangle.print();
//        triangle.countSquare();
    }
   static double enterNumber() {
       Scanner sc = new Scanner(System.in);
        double radius = 0;

//        outFromCikl1:
        while (true) {
            try {
                radius = Double.parseDouble(sc.nextLine());
               return radius;
//                break outFromCikl1;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, plist input digit");
            }
        }
    }
}
