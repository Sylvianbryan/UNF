/*The program generate a grade for a collection of cards using a Procedure Statement. 
In additin,  A Function Statement is created to generate an Average Grade from using entries.   
Objective is to interact with the MySQL Database using Java and JDBC Library.
Group:  Team2 Project 2,  N#,  N#, N#,  N#@*/  

import java.sql.*;
import java.util.Scanner; //import Scanner class 

public class Test {

    public static void main(string[] arg)
            throws SQLException {
        DriverManager.registerDriver((Driver) new com.mysql.cj.jdbc.Driver());

        Connection conn = DriverManager.getConnection("jdbc:mysql://cisvm-winsrv-mysql1.unfcsd.unf.edu:3306/team2",
                "N#", "Passcode");

        var stmt = conn.createStatement();
        ResultSet rset = stmt.executeQuery("show tables");
        while (rset.next())
            System.out.println(rset.getString(1));
    }
}


//Procedure Code Here -  

public class grade {
    /*User must be presented with Card and it information, upon recieving entry, the system loop to the next card in assembly fashion.  
    Requesting Card Grade Entry from the user.*/
    
    /*SQL here to grab the Card Data from the Database Using Card ID*/ 
    
    /*Information is shown here about the card w/out image. Can we gather image of the front and back of the 11 card to generate imaes -  ask professor. */  
    
    Scanner Grade =  new Scanner (System.in);  /*Create Scanner object*/      
    System.out.println("Enter Grade"); //Prompts user to enter their desired Grade.  
    
    /*Loop here to select the next card and repeat code above for entry  
    
}



//Function Code Here. Vallue on Database requires default assignment of 0.  
