package src.Dziedziczenie;

public class Part {

    private String identifyNumber;
    private String producer;
    private String model;
    private String series;


    public Part(String identifyNumber, String producer, String model, String series) {
        this.identifyNumber = identifyNumber;
        this.producer = producer;
        this.model = model;
        this.series = series;
    }


    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
