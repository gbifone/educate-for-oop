import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class InsertingElementInSorteOrder20_17 {
    public static void main(String[] args) {
        List<Integer> numberList = new LinkedList<>();
        Random ran = new Random();
        for(int i = 0 ; i < 25; i++){
            int randomNumber = ran.nextInt(25);
            numberList.add(randomNumber);
        }
        System.out.println("list\n" + numberList);
        int sum = 0;
        ListIterator<Integer> iterator = numberList.listIterator();
        while (iterator.hasNext()){
             sum = sum + iterator.next();
        }
        float avg = sum / 25;
        System.out.println("The sum of the random number is: " + sum);
        System.out.println("The avg of the random number is: " + avg);
    }
}
