import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {

        String answer1;
        String answer2;
        String answer3;
        String answer4;
        String answer5;
        String answer6;
        String answer7;
        String answer8;
        String answer9;
        String answer10;

        Scanner scan = new Scanner(System.in);

        int numberCorrect = 0;

        Scanner input= new Scanner (System.in);
        System.out.print("Input your name: ");
        String fname = input.next();

        // Question 1
        System.out.println("What is the sum of 15 and 68?");
        System.out.println("a:81");
        System.out.println("b:83");
        System.out.println("c:68");

        answer1 = scan.nextLine();

        if(answer1.equals("b")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 2
        System.out.println("How many hours is in one day");
        System.out.println("a:23");
        System.out.println("b:26");
        System.out.println("c:24");

        answer2 = scan.nextLine();

        if(answer2.equals("c")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 3
        System.out.println("Where do you put SAS hard drives?");
        System.out.println("a:Server");
        System.out.println("b:Desktop");
        System.out.println("c:Laptop");

        answer3 = scan.nextLine();

        if(answer3.equals("a")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 4
        System.out.println("What is HDD?");
        System.out.println("a:Solid state drive");
        System.out.println("b:Hard Disk Drive");
        System.out.println("c:Disk");

        answer4 = scan.nextLine();

        if(answer4.equals("b")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 5
        System.out.println("What is 192 + 108 - 148 * 2");
        System.out.println("a:300");
        System.out.println("b:150");
        System.out.println("c:304");

        answer5 = scan.nextLine();

        if(answer5.equals("c")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 6
        System.out.println("What to do when internet breaks?");
        System.out.println("a:Call support to fix it");
        System.out.println("b:Try fixing your self");
        System.out.println("c:Wait until it fixes it self");

        answer6 = scan.nextLine();

        if(answer6.equals("a")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 7
        System.out.println("What to do when pc starts doing jet engine noise?");
        System.out.println("a:Bring it to technician");
        System.out.println("b:Clean inside");
        System.out.println("c:Buy new pc");

        answer7 = scan.nextLine();

        if(answer7.equals("b")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 8
        System.out.println("How many people do you need to change light bulb?");
        System.out.println("a:0");
        System.out.println("b:25");
        System.out.println("c:1");

        answer8 = scan.nextLine();

        if(answer8.equals("c")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 9
        System.out.println("Where can you buy medicine?");
        System.out.println("a:Pharmacy");
        System.out.println("b:Electronics shop");
        System.out.println("c:Local store");

        answer9 = scan.nextLine();

        if(answer9.equals("a")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        // Question 10
        System.out.println("Is there 10 questions?");
        System.out.println("a:Yes");
        System.out.println("b:No");
        System.out.println("c:No answer");

        answer10 = scan.nextLine();

        if(answer10.equals("a")) {
            System.out.println("Correct");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("Wrong");
        }

        double grade = numberCorrect/10.0 * 10.0;
        System.out.println(grade);
        dbConnection();
    }

    public static void dbConnection() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost", "root", "password");
            stmt = (Statement) conn.createStatement();
            String query1 = "INSERT INTO testanswer " + "VALUES ()";
            stmt.executeUpdate(query1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}