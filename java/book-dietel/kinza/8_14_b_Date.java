import java.security.PublicKey;
import java.util.Arrays;

public class Date {
    private int month;
    private int day;
    private int year;
    private String monthS;

    public Date ( int month, int day, int year ) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date ( String monthS, int day,  int year) {
        this.day = day;
        this.year = year;
        this.monthS = monthS;
    }

    public Date ( int day, int year ) {
        this.day = day;
        this.year = year;
    }

    public void setMonth ( int month ) {this.month = month; }

    public void setDay ( int day ) { this.day = day; }

    public void setYear ( int year ) { this.year = year; }

    public void setMonthS ( String monthS ) { this.monthS = monthS; }

    public int getMonth ( ) {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String displayDate1(){
        return this.month + "/" + this.day + "/" + this.year ;
    }
    public String displayDate2(){
        return this.monthS + "," + this.day + "," + this.year ;
    }
    public String displayDate3(){
        return  this.day + "  " + this.year ;
    }
}
