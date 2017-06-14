import java.util.Scanner;

public class SearchingStrings16_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = in.nextLine();
        int[] alpha = new int[26];
        for(int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'A' || text.charAt(i) == 'a')
                    alpha[0]++;
                else if (text.charAt(i) == 'B' || text.charAt(i) == 'b')
                    alpha[1]++;
                else if (text.charAt(i) == 'C' || text.charAt(i) == 'c')
                    alpha[2]++;
                else if (text.charAt(i) == 'D' || text.charAt(i) == 'd')
                    alpha[3]++;
                else if (text.charAt(i) == 'E' || text.charAt(i) == 'e')
                    alpha[4]++;
                else if (text.charAt(i) == 'F' || text.charAt(i) == 'f')
                    alpha[5]++;
                else if (text.charAt(i) == 'G' || text.charAt(i) == 'g')
                    alpha[6]++;
                else if (text.charAt(i) == 'H' || text.charAt(i) == 'h')
                    alpha[7]++;
                else if (text.charAt(i) == 'I' || text.charAt(i) == 'i')
                    alpha[8]++;
                else if (text.charAt(i) == 'J' || text.charAt(i) == 'j')
                    alpha[9]++;
                else if (text.charAt(i) == 'K' || text.charAt(i) == 'k')
                    alpha[10]++;
                else if (text.charAt(i) == 'L' || text.charAt(i) == 'l')
                    alpha[11]++;
                else if (text.charAt(i) == 'M' || text.charAt(i) == 'm')
                    alpha[12]++;
                else if (text.charAt(i) == 'N' || text.charAt(i) == 'n')
                    alpha[13]++;
                else if (text.charAt(i) == 'O' || text.charAt(i) == 'o')
                    alpha[14]++;
                else if (text.charAt(i) == 'P' || text.charAt(i) == 'p')
                    alpha[15]++;
                else if (text.charAt(i) == 'Q' || text.charAt(i) == 'q')
                    alpha[16]++;
                else if (text.charAt(i) == 'R' || text.charAt(i) == 'r')
                    alpha[17]++;
                else if (text.charAt(i) == 'S' || text.charAt(i) == 's')
                    alpha[18]++;
                else if (text.charAt(i) == 'T' || text.charAt(i) == 't')
                    alpha[19]++;
                else if (text.charAt(i) == 'U' || text.charAt(i) == 'u')
                    alpha[20]++;
                else if (text.charAt(i) == 'V' || text.charAt(i) == 'v')
                    alpha[21]++;
                else if (text.charAt(i) == 'W' || text.charAt(i) == 'w')
                    alpha[22]++;
                else if (text.charAt(i) == 'X' || text.charAt(i) == 'x')
                    alpha[23]++;
                else if (text.charAt(i) == 'Y' || text.charAt(i) == 'y')
                    alpha[24]++;
                else if (text.charAt(i) == 'Z' || text.charAt(i) == 'z')
                    alpha[25]++;
        }
        char k = 65;
        for(int i = 0; i < alpha.length; i++ ) {
            System.out.printf("%c%s%3d%s\n", k," comes: ", alpha[i], " times");
            k++;
        }
    }
}
