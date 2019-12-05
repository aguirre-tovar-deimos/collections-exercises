package grades;
import java.util.HashMap;
import  java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hashmap students
        HashMap <String, String> students = new HashMap<>();

        Student  Billy = new  Student<>("Billy");
        Student  Sophie = new  Student<>("Sophie");
        Student  Lance = new  Student<>("Lance");
        Student  Viv = new  Student<>("Viv");

        //add grades
        Billy.addGrade(89);
        Billy.addGrade(20);
        Billy.addGrade(67);

        Sophie.addGrade(67);
        Sophie.addGrade(67);
        Sophie.addGrade(67);

        Lance.addGrade(67);
        Lance.addGrade(67);
        Lance.addGrade(67);

        Viv.addGrade(67);
        Viv.addGrade(67);
        Viv.addGrade(67);

        //add to the map
        students.put("Billy", "billy2");
        students.put("Sophie", "sophiebeans");
        students.put("Lance", "Lancealot");
        students.put("Viv", "Vivjeez");

        //show students

        System.out.println("Here are GitHub usernames of our students: ");
        for (HashMap.Entry<String, String> entry: students.entrySet()){
            System.out.println(" | " + entry.getValue() + " | ");
        }

        System.out.println("What student would you like to see more information on?? ");
         String userInput = scanner.nextLine();










    }
}
