package src.VisitPlanner;

public class Hospital {

    private final int maxPatiensNumber = 10;
    private Patient[]patients = new Patient[maxPatiensNumber];
    private int regPatiens =0;

    public void addPatient( Patient patient) {
        if(regPatiens<maxPatiensNumber){
            patients[regPatiens]= patient;
            regPatiens++;

        }else System.out.println("Liczba pacjentów przekroczona");
    }

    public void printPatiens() {
        for (int i = 0; i < regPatiens; i++) {


                System.out.println(patients[i].getName()+" "+ patients[i].getSurname()+" "+ patients[i].getPesel());
            }
    }

}
