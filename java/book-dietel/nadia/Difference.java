
public class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        int max = 0;
        for(int i =0; i < elements.length; i++){
            for(int j=0; j < elements.length; j++){
                max = elements[i] - elements[j];
                if(maximumDifference < max){
                    maximumDifference = max;
                }
            }
        }
    }
}
