import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author name: ");
        String author = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
