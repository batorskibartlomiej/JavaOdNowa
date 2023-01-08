package src.Points.application;

import src.Points.controller.PointController;
import src.Points.data.Point;

public class PointApplication {

    public static void main(String[] args) {






        Point p1 = new Point(5, 6);
        PointController pc = new PointController();


        final int addX = 0, addY = 1;
        final int minusX = 3;
        final int minusY = 4;


        int option = minusX;
        switch (option) {
            case addX:
                pc.addX(p1);
                break;
            case addY:
                pc.addY(p1);
                break;
            case minusX:
                pc.minusX(p1);
                break;
            case minusY:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Punkt po zmianie: (" + p1.getX() + ";" + p1.getY() + ")");

//        System.out.println("Punkt: (" + a.getX()+";"+ a.getY()+")");
//        pc.addX(a);
//        System.out.println("Punkt addX: (" + a.getX()+";"+ a.getY()+")");
//        pc.addY(a);
//        System.out.println("Punkt addY: (" + a.getX()+";"+ a.getY()+")");
//        pc.minusX(a);
//        System.out.println("Punkt minusX: (" + a.getX()+";"+ a.getY()+")");
//        pc.minusY(a);
//        System.out.println("Punkt minusY: (" + a.getX()+";"+ a.getY()+")");



    }

}
