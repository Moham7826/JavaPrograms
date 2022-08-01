package thread;

public class ThrowsandFinally{
	void Multiplication() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a*b;
        System.out.print("\nThe result is : " + rs);
    }
     public static void main(String[] args)
    {
       ThrowsandFinally t = new ThrowsandFinally();
         try
        {
            t.Multiplication();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
        	System.out.print("\nEnd of program.");
        }
    }

}
