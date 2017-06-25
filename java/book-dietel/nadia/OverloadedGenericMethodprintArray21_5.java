
public class OverloadedGenericMethodprintArray21_5 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};


        System.out.println("Array integerArray contains:");
        printArray(intArray);
        System.out.println("Array integerArray from possition 1 to 3 contains:");
        printArray(intArray, 1, 3);

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);
        System.out.println("Array doubleArray from possition 1 to 3 contains:");
        printArray(doubleArray, 1, 3);

        System.out.println("Array charArray contains:");
        printArray(charArray);
        System.out.println("Array charArray from possition -1 to 30 contains:");
        printArray(intArray, -1, 30);
    }

    public static <T> void printArray(T[] inputArray) {
        int counter = 0;
        for (T element : inputArray) {
            System.out.printf("%s ", element);
            counter++;
        }
        System.out.println();
        System.out.println(counter + " element(s) were output");
        counter = 0;
    }

    public static <T> void printArray(T[] inputArray, int lowSubscript, int hightSubscript) throws InvalidSubScriptException {
        int counter = 0;
        if (lowSubscript >= 0 && hightSubscript < inputArray.length) {
            for (int i = lowSubscript; i <= hightSubscript; i++) {
                System.out.printf("%s ", inputArray[i]);
                counter++;
            }
            System.out.println();
            System.out.println(counter + " element(s) were output");
            counter = 0;
        } else {
            throw new InvalidSubScriptException();
        }

    }
}
