import java.util.Scanner;

public class OwnStringSearchMethods16_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ");
        String search = in.nextLine();
        System.out.println("Enter character to search its index");
        char ch = in.next().charAt(0);
        int index = searchIndex(search,ch);
        if(index == -1)
            System.out.println("String not Found");
        else
            System.out.println("String " + "'" + search + "'" +  " is found at index " + index);

    }
    public static int searchIndex(String search , char ch){
        int index = 0;
    for(int i = 0; i < search.length(); i++) {
        if (search.charAt(i) == ch) {
             index = i;
        }
    }
    return index;
    }
}
