import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintingDatesInVariousFormats16_19 {
    public static void main(String[] args) {

        String string = "08/12/2017" ;

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM dd, yyyy");

        try {
            Date date = dateFormat.parse(string);
            System.out.println(dateFormat.format(date));
            System.out.println(dateFormat1.format(date));
        } catch (ParseException e){
            System.out.println("P");
        }
    }
}
