import java.util.Calendar;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double grossrate, double commissionRate, double baseSalary ) {
        super ( first, last, ssn,  grossrate, commissionRate );
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary ( ) {
        return baseSalary;
    }

    public void setBaseSalary ( double baseSalary ) {
        if ( baseSalary >= 0.0 ) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException( "Base salary must be >= 0.0" );
        }
    }
    @Override
    public double  getPaymentAmount () {
        return getBaseSalary() + super. getPaymentAmount ();
    }
    @Override
    public String toString() {
        return String.format ( "%s %s; %s: $%,.2f", "base-salaried", super.toString ( ), "base salary", getBaseSalary ( ) );
    }
}

