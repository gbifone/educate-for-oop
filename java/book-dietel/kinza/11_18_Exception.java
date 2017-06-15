public class Exception_11_18 {
    public static void main ( String[] args ) {
            ExceptionA a = new ExceptionA();
            ExceptionB b = new ExceptionB();
            try
            {
                a.throwException();
            }
            catch( Exception e )
            {
                System.out.println ("Exception in ExceptionA "+ e.getMessage () );
            }
            try
            {
                b.throwException();
            }
            catch( Exception e )
            {
                System.out.println ("Exception in ExceptionB "+ e.getMessage () );
            }


    }
}
