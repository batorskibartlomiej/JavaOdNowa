package src.Dziedziczenie;

public class ExhaustPart extends Part {

    private boolean UEok;


    public ExhaustPart(String identifyNumber, String producer, String model, String series, boolean UEok) {
        super(identifyNumber, producer, model, series);
        this. UEok = UEok;
    }

    public boolean isUEok() {
        return UEok;
    }

    public void setUEok(boolean UEok) {
        this.UEok = UEok;
    }

    void printInfo(){
        System.out.println(getSeries()+" "+ getProducer() + " "+ getModel() + " "+ getIdentifyNumber()+ " "+ isUEok());
    }
}
