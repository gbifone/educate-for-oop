public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;

    public Employee () { }

    public Employee(String first, String last, String ssn, Date birthDay){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        setBirthDay ( birthDay );
    }

    public String getFirstName ( ) { return firstName; }

    public void setFirstName ( String first ) { this.firstName = first; }

    public String getLastName ( ) { return lastName; }

    public void setLastName ( String last ) { this.lastName = last; }

    public String getSocialSecurityNumber ( ){ return socialSecurityNumber; }

    public void setSocialSecurityNumber ( String ssn ) { this.socialSecurityNumber = ssn; }

    public Date getBirthDay ( ) { return birthDay; }

    public void setBirthDay ( Date birthDay ) { this.birthDay = birthDay; }

    @Override
    public String toString() {
        return String.format( "%s %s\nsocial security number: %s \nBirthday: %s",getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDay () );
    }
    public abstract double earnings();
}
