
public class BasePlusCommissionEmployee extends CommissionEmployee {
     private double baseSalary;

     public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber ,double sales ,double rate,double salary) {
         super(firstName, lastName, socialSecurityNumber, sales, rate);
         this.baseSalary = salary;
     }
    public  void setBaseSalary(double salary){
        if(salary >= 0.0)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    @Override
    public double earnings(){
        return baseSalary +super.earnings();
    }
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f","base_Salaried",
                super.toString(),
                "base Salary",baseSalary);
    }
}

