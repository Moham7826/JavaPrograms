package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class file {
	    public static void main(String args[]) throws FileNotFoundException, IOException {
	        System.out.println("Select A Operation: \n");
	        System.out.println(" W -> write ");
	        System.out.println(" R -> read ");
	        System.out.println(" A -> append ");
	        Scanner in =new Scanner(System.in);
	        String s=in.nextLine();
	        if(s.equalsIgnoreCase("R"))
	        {
	            new FReading();
	        }
	        else if(s.equalsIgnoreCase("W")||s.equalsIgnoreCase("A"))
	        {
	            writingToFile(s);
	            
	            
	        }
	        else
	        {
	            System.out.println("Error");
	        }
	        
	        
	        in.close();
	        
	    }
	    
	    public static void writingToFile(String s)
	    {
	        Scanner in=null;
	        try
	        {
	            String source = "";
	            File f=new File("file1.txt");
	            
	            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	            FileWriter f0 =null;
	            if(s.equalsIgnoreCase("W"))
	            {
	                f0 = new FileWriter(f,false);
	                System.out.println("content overwrite");
	                System.out.println("Type 'no' to exit");
	                System.out.println("want to proceed :type 'yes' ");
	                in=new Scanner(System.in);
	                String s1=in.nextLine();
	                if(s1.equals("no"))
	                System.exit(0);
	                System.out.println("Write 'stop' to finish ");
	                f.delete();
	                f.createNewFile();
	                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
	                    f0.write(source + System.getProperty("line.separator"));
	                    
	                }
	                
	                in.close();
	            }
	            else
	            {  f0 = new FileWriter(f,true);
	                System.out.println("Write 'stop' to finish ");
	                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
	                    f0.append(source+ System.getProperty("line.separator"));
	                }
	            }
	            f0.close();
	            
	        }
	        catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	        
	        
	    }
	    
	}

	class FReading {
	    public static String str="";
	    
	    public FReading() {
	        
	        try{
	            File f2=new File("file1.txt");
	            if(! f2.exists())
	            f2.createNewFile();
	            FileReader fl=new FileReader(f2);
	            BufferedReader bf=new BufferedReader(fl);
	            while((str=bf.readLine())!=null){
	                System.out.println(str);
	            }
	            fl.close();
	            }catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	    }
	}