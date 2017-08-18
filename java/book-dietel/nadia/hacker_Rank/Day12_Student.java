
public class Student extends Person {
    private int[] testScores;
    private int sum = 0;
    private double avg;

    Student(String firstName, String lastName,int id, int[] testScores){
        super(firstName,lastName,id);
        this.testScores = testScores;
    }

    char calculate(){
        for(int i = 0; i < testScores.length; i++){
            sum = sum + testScores[i];
        }
        avg = sum / (testScores.length);
        if(avg >= 90){
            return 'O';
        }
        else if(avg >= 80){
            return 'E';
        }
        else if(avg >= 70){
            return 'A';
        }
        else if(avg >= 55){
            return 'P';
        }
        else if(avg >= 40){
            return 'D';
        }
        else{
            return 'T';
        }
    }
}

