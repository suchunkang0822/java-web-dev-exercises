package exercises_3;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
//        this(name,studentId,numberOfCredits,gpa);
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public int getStudentID(){
        return studentId;
    }
    public void setStudentID(int aStudentID){
        studentId = aStudentID;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }
    private void setGpa(double aGpa){
        gpa = aGpa;
    }

}
