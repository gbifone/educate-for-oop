import java.util.Calendar;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee ( String first, String last, String ssn, Date birthDay, double grossSales, double commissionRate ) {
        super ( first, last, ssn, birthDay );
        setGrossSales ( grossSales );
        setCommissionRate ( commissionRate );
    }

    Calendar c            = Calendar.getInstance ( );
    int      currentMonth = c.get(Calendar.MONTH) + 1;

    public double getGrossSales ( ) {
        return grossSales;
    }

    public void setGrossSales ( double grossSales ) {
        if ( grossSales >= 0.0 ) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException( "Gross sales must be >= 0.0" );
        }
    }

    public double getCommissionRate ( ) {
        return commissionRate;
    }

    public void setCommissionRate ( double commissionRate ) {
        if ( commissionRate > 0.0 && commissionRate < 1.0 ) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0" );
        }
    }
    @Override
    public double earnings() {
        if( getBirthDay ().getMonth () == currentMonth ){
            return (getCommissionRate() * getGrossSales() + 100) ;
        } else {
            return getCommissionRate ( ) * getGrossSales ( );
        }
    }
    @Override
    public String toString() {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(),
                              "gross sales", getGrossSales(), "commission rate", getCommissionRate() );
    }
}
