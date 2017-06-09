
public class ExceptionTest {
    public static void main(String args[])
    {
        try
        {
            Error1 m = new Error1();
            m.setData(12,0);
            int op = m.getCal();
            System.out.println("The result is: "+op);
            Error2 s = null;
            s.setData(12,2,2);
            int op1 = s.getCal();
            System.out.println("The result is: "+op1);
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
        catch(ArithmeticException e)
        {

            System.out.println(e);

        }
        catch(NullPointerException n)
        {
            System.out.println(n);

        }




    }
}
