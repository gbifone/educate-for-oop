
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee () { }

    public Employee(String first, String last, String ssn, Date birthDate){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        this.birthDate = birthDate;
    }

    public String getFirstName ( ) { return firstName; }

    public void setFirstName ( String first ) { this.firstName = first; }

    public String getLastName ( ) { return lastName; }

    public void setLastName ( String last ) { this.lastName = last; }

    public String getSocialSecurityNumber ( ){ return socialSecurityNumber; }

    public void setSocialSecurityNumber ( String ssn ) { this.socialSecurityNumber = ssn; }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override

    public String toString() {
        return String.format( "%s %s\nsocial security number: %s",getFirstName(), getLastName(), getSocialSecurityNumber() );
    }
    public abstract double earnings();
}

