
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest20_12 {
    public static void main(String[] args) {
        String[] colors = {"black" , "yellow" , "green" , "blue" , "violet" , "silver"};
        List<String> list1 = new LinkedList<>(Arrays.asList(colors));
        String[] colors2 = {"gold" , "white" , "brown" , "blue" , "gray" , "silver"};
        List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
        list1.addAll(list2);
        list2 = null;
        printList(list1);
        convertToUppercaseString(list1);
        printList(list1);
        System.out.println("Deleting element 4 to 6...");
        revomeItem(list1,4,7);
        printList(list1);
        printReverceList(list1);
    }
    private static void printList(List<String> list){
        System.out.println("\nList: ");
        for(String color : list){
            System.out.printf("%s\t" , color);
        }
        System.out.println();
    }
    private static void convertToUppercaseString(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    private static void revomeItem(List<String> list, int start ,int end){
        list.subList(start,end).clear();
    }
    private static void printReverceList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReverseList");
        while (iterator.hasPrevious()){
            System.out.printf("%s\t" , iterator.previous());
        }
    }
}
