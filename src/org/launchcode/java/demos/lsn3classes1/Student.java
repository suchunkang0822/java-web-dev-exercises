package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

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
    private void setGpa(int aGpa){
        gpa = aGpa;
    }

}