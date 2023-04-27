package src.Interfejsy;

public class Circle implements Shape{

    private double r;


    @Override
    public double calculateArea() {
        return r * r* PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło, ");
        sb.append("promień: " + r + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}
