import java.util.Calendar;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee ( String first, String last, String ssn, Date birthDay, double wage, double hours ) {
        super ( first, last, ssn, birthDay );
        this.wage = wage;
        this.hours = hours;
    }

    Calendar c = Calendar.getInstance ();
    int currentMonth = c.get(Calendar.MONTH) + 1;

    public double getWage ( ) {
        return wage;
    }

    public void setWage ( double wage ) {
        if ( wage >= 0.0 ) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException( "Hourly wage must be >= 0.0" );
        }
    }

    public double getHours ( ) {
        return hours;
    }

    public void setHours ( double hours ) {
        if ( ( hours >= 0.0 ) && ( hours <= 168.0 )) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException( "Hours worked must be >= 0.0 and <= 168.0" );
        }
    }
    @Override
    public double earnings() {
        double earning;
        if ( getHours() <= 40 ) {
            earning = getWage ( ) * getHours ( );
        } else {
            earning =  40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
        }
        if ( getBirthDay().getMonth () == currentMonth ){
            return earning + 100 ;
        } else {
            return earning;
        }
    }
    @Override
    public String toString() {
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours() );
    }
}
