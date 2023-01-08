package src.Points.application;

import src.Points.controller.PointController;
import src.Points.data.Point;

public class PointApplication {

    public static void main(String[] args) {
        Point a = new Point(5, 6);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + a.getX()+";"+ a.getY()+")");
        pc.addX(a);
        System.out.println("Punkt addX: (" + a.getX()+";"+ a.getY()+")");
        pc.addY(a);
        System.out.println("Punkt addY: (" + a.getX()+";"+ a.getY()+")");
        pc.minusX(a);
        System.out.println("Punkt minusX: (" + a.getX()+";"+ a.getY()+")");
        pc.minusY(a);
        System.out.println("Punkt minusY: (" + a.getX()+";"+ a.getY()+")");

    }

}
