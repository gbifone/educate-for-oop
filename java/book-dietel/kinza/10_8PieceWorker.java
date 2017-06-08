public class PieceWorker extends Employee {
    private double wage;
    private int piece;

    public PieceWorker ( String first, String last, String ssn, Date birthDay, double wage, int piece ) {
        super ( first, last, ssn, birthDay );
        this.wage = wage;
        this.piece = piece;
    }

    public double getWage ( ) { return wage; }

    public void setWage ( double wage ) { this.wage = wage; }

    public int getPiece ( ) { return piece; }

    public void setPiece ( int piece ) { this.piece = piece; }

    @Override
    public double earnings ( ) {
            return getWage ( ) * getPiece ( );
    }

    @Override
    public String toString ( ) {

        return String.format( "PieceWorker: %s\n%s: $%,.2f; %s: %d", super.toString(), "Wage ", getWage(), "Pieces ", getPiece () );
    }
}

