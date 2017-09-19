package Manager;

public class IOExceptionManager extends Exception{
    private String str1;

    public IOExceptionManager(String str2){
        str1 = str2;
    }

    public String toString(){
        return  str1;
    }
}
