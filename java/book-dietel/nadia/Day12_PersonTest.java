import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st name:");
        String firstName = scan.next();
        System.out.println("Enter last name:");
        String lastName = scan.next();
        System.out.println("Enter your id:");
        int id = scan.nextInt();
        System.out.println("Enter number of subjects");
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
