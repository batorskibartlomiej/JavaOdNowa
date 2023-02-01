package src.VisitPlanner;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        
        final int exit = 0;
        final int addPatient =1;
        final int printPatients = 2;
        Scanner scanner = new Scanner(System.in);

        int option= -1;
        
        Hospital hospital = new Hospital();

        while (option != exit){
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch ((option)){
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Podaj imie");
                    patient.setName(scanner.nextLine());
                    System.out.println("Nazwisko");
                    patient.setSurname(scanner.nextLine());
                    System.out.println("pesel");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                hospital.printPatiens();
                break;
                case exit:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");

            }



        }
        scanner.close();


    }
}
