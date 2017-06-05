
public class DateTest {
    public static void main(String[] args) {

         Date d1 = new Date(4,6,2017);
         Date d2 = new Date(4,"june",2017);
         Date d3 = new Date(321,2017);

         d1.displayDate1();
         d2.displayDate2();
         d3.displayDate3();
    }
}
