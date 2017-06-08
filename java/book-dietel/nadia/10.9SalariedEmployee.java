import java.util.Calendar;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee ( String first, String last, String ssn, Date birthDate , double weeklySalary ) {
        super ( first, last, ssn , birthDate);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary ( ) {
        return weeklySalary;
    }

    public void setWeeklySalary ( double weeklySalary ) {
        if ( weeklySalary >= 0.0 ) {
            this.weeklySalary = weeklySalary;
        } else { throw new IllegalArgumentException ( "Weekly salary must be >= 0.0" );
        }
    }
    @Override
    public double earnings() {
        double earning = getWeeklySalary();
        if (getBirthDate().getMonth() == Calendar.MONTH) {
            return earning + 100.00;
        }else
            return earning;
    }

    @Override public String toString() {
        return String.format( "salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary() );
    }
}
