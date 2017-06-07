
public class DateMain_8_14 {
    public static void main ( String[] args ) {
        Date date1 = new Date(6,4,2017);
        Date date2 = new Date ("Septemper ", 5,2005);
        Date date3 = new Date ( 255, 2010 );


        System.out.println ( date1.displayDate1 () );
        System.out.println ( date2.displayDate2 ());
        System.out.println ( date3.displayDate3() );
    }
}
