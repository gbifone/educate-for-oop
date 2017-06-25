
public class MinimumValueInAnArray18_18 {
    public static void main(String[] args) {
        int[] smallest = {45,2,61,12,7,18,33};
        int min = smallest[0];
            int result = recursiveMinimum(smallest, 0 ,min);
        System.out.println("The minimum value in the array is : " + result);

    }
    public static int recursiveMinimum(int[] smallest, int index ,int min){
        if(index <= (smallest.length - 1)){
            if(smallest[index] < min){
                min = smallest[index];
            }
            return recursiveMinimum(smallest, index + 1, min);
        }
        return min;
    }
}
