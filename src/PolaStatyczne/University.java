package src.PolaStatyczne;

public class University {
    public static void main(String[] args) {


        System.out.println("Przed utworzeniem studaneta ich liczba to "+ Student.getStudentNumber());
        Student student = new Student("Bartek", "Bartyzel", 12345678);
        Student student2 = new Student("Maja", "Bartyzel", 12345678);
        System.out.println("Po utworzeniu studaneta ich liczba to "+ Student.getStudentNumber());







    }

}
