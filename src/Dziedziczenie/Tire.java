package src.Dziedziczenie;

public class Tire extends Part{

    private double size;
    private double width;

    public Tire(String identifyNumber, String producer, String model, String series, double size, double width) {
        super(identifyNumber, producer, model, series);
        this. size = size;
        this. width = width;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void printInfo(){

        System.out.println(getIdentifyNumber()+" "+ getProducer()+" "+ getModel()+ " "+ getSeries()+ " "+ size + " "+ width);
    }


}
