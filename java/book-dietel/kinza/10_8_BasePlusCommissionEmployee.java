public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee ( String first, String last, String ssn, Date birthDay, double grossSales, double commissionRate, double baseSalary ) {
        super ( first, last, ssn, birthDay, grossSales, commissionRate );
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
    public double earnings() {
            return getBaseSalary ( ) + super.earnings ( );
    }
    @Override
    public String toString() {
        return String.format ( "%s %s; %s: $%,.2f", "base-salaried", super.toString ( ), "base salary", getBaseSalary ( ) );
    }
}
