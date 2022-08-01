package thread;

public class Interface {
	interface first{
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class TestClass implements first, Second 
	{  
	    public void show() 
	    {  
	        first.super.show(); 
	        Second.super.show(); 
	    } 
	    public void main(String args[]) 
	    { 
	        TestClass ob = new TestClass(); 
	        ob.show(); 
	    } 

}
}