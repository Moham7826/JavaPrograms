package thread;
public class TryCatch {
	public static void main(String args[]) 
    {
        int[] array = new int[1];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Is Out Of Space!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }

}
