package grades;
import java.util.HashMap;
import  java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hashmap students
        HashMap <String, Student> students = new HashMap<>();

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
        students.put("billy2", Billy);
        students.put("sophiebeans", Sophie );
        students.put("Lancealot", Lance);
        students.put("Vivjeez", Viv);

        ArrayList<String> keys = new ArrayList<>();
        for(String userName : students.keySet()){
            keys.add(userName);
        }

        //show students

        System.out.println("Here are GitHub usernames of our students: ");
//        for (HashMap.Entry<String, Student> entry: students.entrySet()){
//            System.out.println(" | " + entry.getValue() + " | ");
//        }
        for(String userName : keys){
            System.out.println("|" + userName + "|");
        }

        System.out.println("What student would you like to see more information on?? ");
         String userInput = scanner.nextLine();


         if(students.containsKey(userInput)){
             System.out.printf("%nStudent: %s", students.get(userInput).getName(), userInput);
             System.out.printf("%nGrade Average: %.2f", students.get(userInput).getGradeAverage());
         }




    }




}
