import java.sql.*;

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
