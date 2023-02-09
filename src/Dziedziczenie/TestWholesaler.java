package src.Dziedziczenie;

public class TestWholesaler {
    public static void main(String[] args) {

        Tire tire = new Tire("123", "SuperTire", "Continental", " Winter pro", 17, 225);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart("987", "Noisy Parts", "Turbo Brum", "Noisy Exhaust", true);
        exhaustPart.printInfo();


    }

}
