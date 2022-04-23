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

/* because we used Char (2).  There is a total of 10 cards based on single value.  But max is 99. 

//Procedure Code Here -  


public class grade {
    /*User must be presented with Card and it information, upon recieving entry, the system loop to the next card in assembly fashion.  
    Requesting Card Grade Entry from the user.*/
    
    /*SQL here to grab the Card Data from the Database Using Card ID*/ 

    String sql =    "Select *"
                    "FROM Card"
                    "Where ID = 1;  /*select the first card in entry.  
    ResultSet rs = stmt.executeQuery (sql)/*this execute the SQL Query in question */
    
    /*Information is shown here about the card w/out image. Can we gather image of the front and back of the 11 card to generate imaes -  ask professor. */  
    
    Scanner Grade =  new Scanner (System.in);  /*Create Scanner object*/      
    System.out.println("Enter Grade: "); //Prompts user to enter their desired Grade.  

    
    } 
   
    public class update (Grade)  { /*update Grade attribute on the card table.  Enter passed value in Parameter to alter table.   
    
    /* Insert Table Data from the user.   
    INSERT  INTO card (grade) 
    VALUES (Grade) /*Scanner Value from the userentered
    }

    for (int i=0; i<9;i++){    /*Loop here to select the next card and repeat code above for entry  
        grade

}


//Function Code Here. Value on Database requires default assignment of 0.  


public class AverageGrade {

} 
