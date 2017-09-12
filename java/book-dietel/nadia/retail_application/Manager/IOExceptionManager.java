package Manager;

public class IOExceptionManager extends Exception{
    String str1;

    public IOExceptionManager(String str2){
        str1 = str2;
    }

    public String toString(){
        return "Exception occured " + str1;
    }
}
