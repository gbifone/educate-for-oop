
public class OverloadingGenericMethodWithNongenericMethod21_6 {
    public static void main(String[] args) {

        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        System.out.println( "\nArray stringArray contains:" );
        printArray(stringArray);

    }
    public static <T> void printArray(T[] string){
        T[] element = string;
        for(int i = 0 ; i < string.length; i++){
            if (i == 4) {
                System.out.println();
                System.out.printf("%s\t", element[i]);
            }
            else
            System.out.printf("%s\t\t" , element[i]);
        }
    }
}
