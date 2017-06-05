
public class Date {
       private int day;
       private int month;
       private String sMonth;
       private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, String sMonth ,int year) {
        this.day = day;
        this.sMonth = sMonth;
        this.year = year;
    }

    public Date(int day, int year) {
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getsMonth() {
        return sMonth;
    }

    public void setsMonth(String sMonth) {
        this.sMonth = sMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate1(){
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public void displayDate2(){
        System.out.println(this.sMonth + " " + this.day + "," + this.year);
    }

    public void displayDate3(){
        System.out.println(this.day + " " + this.year);
    }
}

