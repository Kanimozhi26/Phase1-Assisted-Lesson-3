package keywords_exceptions;

public class throws1
{
    void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
throws1 T = new throws1();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }
}
