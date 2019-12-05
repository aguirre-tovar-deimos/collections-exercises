package grades;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



public class Student<ArraysList> {

    private String name;
    private ArrayList <Integer> grades;
    private Map <String,String> attendance = new HashMap<>();



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
    public void recordAttendance(String date, String value) {
        //a is absent
        if (value.equalsIgnoreCase("A")) {
            this.attendance.putIfAbsent(date, "A");
        } else if (value.equalsIgnoreCase("P"))
            this.attendance.putIfAbsent(date, "P");
        else {
            System.out.println("Enter a A or P (Absent/Present)");
        }
    }

    //calculate students attendance
    public void getAttendanceAverage (){
        ArrayList <String> absences = new ArrayList<>();

        for (String dates : attendance.keySet()){
            if (attendance.get(dates).equalsIgnoreCase("A")){
                absences.add(dates);
            }
        }
        double attendanceAverage = (double) (attendance.size() - absences.size()) / attendance.size();
        attendanceAverage *= 100;
        System.out.printf("%nDays Student absent: %d" + "%nAttendance percentage: %.2f %n" , absences.size(), attendanceAverage);
    }



    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(78);
        bob.addGrade(89);
        bob.addGrade(100);

        System.out.println(bob.getGradeAverage());//should be 89
//
//        bob.recordAttendance("Monday", "p");
//        bob.recordAttendance("te", "a");
//        bob.recordAttendance("we", "p");
//        bob.recordAttendance("th", "a");
//        System.out.println(bob.getAttendanceAverage());
    }

}
