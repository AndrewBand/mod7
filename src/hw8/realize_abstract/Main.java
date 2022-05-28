package hw8.realize_abstract;

import java.util.Scanner;

public class Main {
    static {
        System.out.println("Hight! This program calkulate:");
    }
    public static void main(String[] args) {

        WhotWeeDo weDo = new WhotWeeDo();

        System.out.println("fore help press help or h");

        Scanner sc = new Scanner(System.in);
        double radius = 0;

        while (true) {
            String comand = sc.nextLine();
            if (comand.equals("h") || comand.equals("help")) {
                weDo.printWhotDo();
            }


           else if (comand.equals("c")) {
                System.out.println("Enter radius of circle");
                outFromCikl1:
                while (true) {
                    try {
                        radius = Double.parseDouble(sc.nextLine());
                        Shape cir = new Circle(radius);
                        cir.print();
                        cir.countSquare();
                        break outFromCikl1;
//                        return;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input, plist input digit");
                    }
                }
            }
           else if (comand.equals("ex")) {
                System.out.println("Bay");
                System.out.println(" SENQ FORE CHOUSE OUR PROGRAM");
                return;
            } else {
                System.out.println("wrong choyce, fore help press help");
            }

        }
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


    }
}
