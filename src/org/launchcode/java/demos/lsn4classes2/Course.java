package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return topic + "(instructor: "+instructor+"\n"+
                        "Enrolled Students: " +enrolledStudents+")";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Course)){
            return false;
        }
        Course course_compared = (Course) compared;
        return topic.equals(course_compared.topic) &&
                enrolledStudents.equals(course_compared.enrolledStudents) ;

    }


}
