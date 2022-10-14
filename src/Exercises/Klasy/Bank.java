package src.Exercises.Klasy;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName="Jan";
        person.lastName="Kowalski";
        person.pesel="840315044";

        Adress adress1 = new Adress();
        adress1.city="Warszawa";
        adress1.home=5;
        adress1.street="Ponarska";
        adress1.postalCode="03-890";

        person.livingAddress= adress1;
        person.registeredAddress=adress1;

        BankAccount account1= new BankAccount();
        account1.owner=person;
        account1.balance=10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("mieszka w miejscowości: " + person.livingAddress.city+" "+person.livingAddress.street);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);


    }

}
