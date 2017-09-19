package Manager;

public class IoExceptionManager extends Exception {
    private String str1 ;

    IoExceptionManager(String str ){ str1 = str; }

    public String toString(){ return " Exception occur: " + str1 ; }
}