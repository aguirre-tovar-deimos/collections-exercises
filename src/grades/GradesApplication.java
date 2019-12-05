package grades;
import java.util.HashMap;
import  java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        //hashmap students
        HashMap<String, Student> students = new HashMap<>();

        Student Billy = new Student<>("Billy");
        Student Sophie = new Student<>("Sophie");
        Student Lance = new Student<>("Lance");
        Student Viv = new Student<>("Viv");

        //add grades
        Billy.addGrade(89);
        Billy.addGrade(20);
        Billy.addGrade(67);

        Billy.recordAttendance("Monday", "P");
        Billy.recordAttendance("Tuesday", "P");
        Billy.recordAttendance("Wednesday", "P");
        Billy.recordAttendance("Thursday", "P");
        Billy.recordAttendance("Friday", "A");
        //==========
        Sophie.addGrade(67);
        Sophie.addGrade(67);
        Sophie.addGrade(67);

        Sophie.recordAttendance("Monday", "A");
        Sophie.recordAttendance("Tuesday", "A");
        Sophie.recordAttendance("Wednesday", "A");
        Sophie.recordAttendance("Thursday", "A");
        Sophie.recordAttendance("Friday", "A");

        //===========

        Lance.addGrade(67);
        Lance.addGrade(67);
        Lance.addGrade(67);

        Lance.recordAttendance("Monday", "P");
        Lance.recordAttendance("Tuesday", "P");
        Lance.recordAttendance("Wednesday", "P");
        Lance.recordAttendance("Thursday", "P");
        Lance.recordAttendance("Friday", "A");

        //============

        Viv.addGrade(67);
        Viv.addGrade(67);
        Viv.addGrade(67);

        Viv.recordAttendance("Monday", "P");
        Viv.recordAttendance("Tuesday", "P");
        Viv.recordAttendance("Wednesday", "A");
        Viv.recordAttendance("Thursday", "P");
        Viv.recordAttendance("Friday", "A");

        //add to the map
        students.put("billy2", Billy);
        students.put("sophiebeans", Sophie);
        students.put("Lancealot", Lance);
        students.put("Vivjeez", Viv);

        ArrayList<String> keys = new ArrayList<>();
        for (String userName : students.keySet()) {
            keys.add(userName);
        }

        //show students

        System.out.println("Here are GitHub usernames of our students: ");
        for (String userName : keys) {
            System.out.println("|" + userName + "|");
        }

        System.out.print("Do you want to continue? [yes/no] ");
        String testInput = scanner.next();



        if (testInput.equalsIgnoreCase("yes")) {
            do {
                System.out.println("What student would you like to see more information on?? ");
                String userInput = scanner2.nextLine();


                if (students.containsKey(userInput)) {
                    System.out.printf("%nStudent: %s", students.get(userInput).getName(), userInput);
                    System.out.printf("%nGrade Average: %.2f", students.get(userInput).getGradeAverage());
                    students.get(userInput).getAttendanceAverage();
                } else {
                    System.out.println("Error.. Student was not found!");
                }
            } while (testInput.equalsIgnoreCase("yes"));

        }else{
            System.out.println("Thanks");
        }


    }

}
