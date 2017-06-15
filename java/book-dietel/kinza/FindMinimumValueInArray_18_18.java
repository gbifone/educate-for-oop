public class FindMinimumValueInArray_18_18 {
    public static void main ( String[] args ) {
        int[] minimum = { 2, 6, 30, 11, 9 };

        int minimumValue = recursiveMinimum ( minimum, 0);
        System.out.println ("Minimum value in the array is: "+ minimumValue );

    }

    public static int recursiveMinimum( int[] minimum, int index ){
        if (index == minimum.length - 1) {
            return minimum[index];
        }

        int val = recursiveMinimum(minimum, index + 1);

        if (minimum[index] < val)
            return minimum[index];
        else
            return val;
    }
}
