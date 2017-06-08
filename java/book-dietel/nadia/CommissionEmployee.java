
public class CommissionEmployee  extends Object{

    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber ,double sales ,double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setGrossSales( double sales )  {
        if ( sales >= 0.0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0" );
    }
    public double getGrossSales()  {
        return grossSales;
    }
    public void setCommissionRate( double rate )  {
        if ( rate > 0.0 && rate < 1.0 )
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0" );
    }
    public double getCommissionRate()  {
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee:" ,getFirstName(),getLastName() ,
                "social security Number:" ,getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}

