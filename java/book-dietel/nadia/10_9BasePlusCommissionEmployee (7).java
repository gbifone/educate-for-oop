
public class PieceWorker extends Employee{
     private double wage;
     private double piece;

    public PieceWorker(String first, String last, String ssn, Date birthDate, double wage ,double piece) {
        super(first, last, ssn, birthDate);
        this.wage = wage;
        this.piece = piece;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public double getPiece() {
        return piece;
    }

    public void setPriece(int piece) {
        this.piece = piece;
    }

    @Override
    public double earnings() {
        return wage * piece ;
    }

    @Override
    public String toString() {
        return String.format( "piece Worker: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "piece wage", getWage(), "piece", getPiece() );
    }
}
