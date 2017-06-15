import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintingDatesInVariousFormats_16_19 {
    public static void main ( String[] args ) {

        String string = "06/12/2017";

        SimpleDateFormat date1 = new SimpleDateFormat ( "MM/dd/yyyy");
        SimpleDateFormat date2 = new SimpleDateFormat ("MMMM dd, yyyy");

        try{
            Date date = date1.parse ( string );
            System.out.println(date1.format(date));
            System.out.println(date2.format(date));
        } catch(ParseException e){
            System.out.println (" Parse Exception. " );
        }

    }
}
