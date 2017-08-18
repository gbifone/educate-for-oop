import java.util.*;

public class HackerRankDay_18 {
    Queue< Character > queue = new LinkedList< Character >( );
    Stack< Character > stack = new Stack< Character >( );

    public void pushCharacter(Character ch){
        stack.push( ch );
    }
    public void enqueueCharacter(Character ch){
        queue.add( ch );
    }
    public Character popCharacter(){
        return stack.pop(  );
    }
    public Character dequeueCharacter(){
        return queue.remove(  );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        HackerRankDay_18 p = new HackerRankDay_18();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
