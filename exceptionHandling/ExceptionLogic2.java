package com.cg.exceptionHandling;

public class ExceptionLogic2 {
	
	public static void main(String args[]) {
		
		//java7
        try {
             // Dbconnect db=getConnection();
            // how to skip finally() block
        }
        catch(Exception e) {
            
        }
        finally { // if exception is raised or not    
            //db.close();
        }
   //try with resource
  /* try(Dbconnect db=getConnection();) {
            
        }
        catch(Exception e) {
            
        }
        */
        //finally {}   - not required 
        
    /*    try {
            
        }
        catch(Exception1 | Exception2 | Exception 3... e1) { } //instead of creating multiple catch blocks(advantage of java7)
        
            
        }
        */
        
        
    }

 


	}


