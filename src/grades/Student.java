package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import  java.util.Arrays;

public class Student<ArraysList> {

    private String name;
    private ArrayList <Integer> grades;


    //constructor
    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        //grade will get added to the grades arrayList
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public float getGradeAverage(){
        //set the running total to start with
        float total = 0;
        //loop through the arrayList of grades
        for (float grade : grades){
            //final the total grade for the student
            total += grade;
        }
        //average
        float average = total / grades.size();
        return average;
    }



    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(78);
        bob.addGrade(89);
        bob.addGrade(100);

        System.out.println(bob.getGradeAverage());//should be 89
    }

}
