import Scanner.*;  
import Parser.sym;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java.io.*;

public class MiniJava {
	//
    public static void main(String [] args) 
    {
    	
    	
    	if ( args.length == 2 && args[0].equals("-S") )
    	{
        	
        	 scanner( args[1] );
    	}
    	else
    	{
    		System.err.println("Invalid program arguments.");
    		
    	}
    	
		
   }
    
    public static int scanner(String fname)
    {
    
    	
        try {
	       
	        ComplexSymbolFactory sf = new ComplexSymbolFactory();
	        Reader in = new BufferedReader(new FileReader(fname));
	        //PrintStream out = new PrintStream(new FileOutputStream("test.txt", true));
	        //System.setOut(out);
	       
	        scanner s = new scanner(in, sf);
	        Symbol t = s.next_token();
	        while (t.sym != sym.EOF){ 
	        	
	        	System.out.print(s.symbolToString(t)  + "\n");
	         
	        	 t = s.next_token();
	        	 
	          
	           
	           
	        }
	        
	      } catch (Exception e) {
          
        }
        
        return 1;    	
    }
}


