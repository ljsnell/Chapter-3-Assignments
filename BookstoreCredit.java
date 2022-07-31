import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String studentName = keyboard.nextLine();
        System.out.println("Enter Student GPA:");
        double studentGPA = keyboard.nextDouble();

        calculateBookStoreCredit(studentName, studentGPA);
    }

    public static void calculateBookStoreCredit(String studentsName, double studentsGPA) {
        System.out.println(studentsName + " with their GPA of: " +studentsGPA +
                        " has received a credit of: $" + studentsGPA * 10);
    }
}