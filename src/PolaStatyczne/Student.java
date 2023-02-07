package src.PolaStatyczne;

public class Student {

    private static int studentNumber= 0;

    private String firstname;
    private String lastname;
    private int index;

    public Student(String firstname, String lastname, int index) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.index = index;


        studentNumber++;

    }

    public static int getStudentNumber() {
        return studentNumber;
    }

    public static void setStudentNumber(int studentNumber) {
        Student.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
