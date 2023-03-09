package javaConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");

		Statement statement=	connection.createStatement();
		ResultSet  result= statement.executeQuery("Select * from register");
		while(result.next())
		{
			System.out.println("The ID number is " +result.getInt(1)+ " The Name is "  + result.getString(2));
		}
	}

}
