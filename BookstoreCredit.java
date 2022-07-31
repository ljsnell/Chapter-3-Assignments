public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName = "Bill";
        double studentGPA = 3.2;

        calculateBookStoreCredit(studentName, studentGPA);
    }

    public static void calculateBookStoreCredit(String studentsName, double studentsGPA) {
        System.out.println(studentsName + " with their GPA of: " +studentsGPA +
                        " has received a credit of: $" + studentsGPA * 10);
    }
}
