package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/* Step 1:  Create Connection
 * Step 2 : Create Statement
 * Step 3 : Execute Query
 * Step 4 : Close the connection
 * 
 * 
 * */

public class ConnectionDemo {
	
	public static void main(String[] args) throws SQLException {
		
		//step 1
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arti04");
		
		//step 2
		Statement stmt = conn.createStatement();
		
		
		//step 3
		//String query = "insert into student_info values('9','Om','1989-03-09','vadodara')";
		//String query = "update student_info set Name ='Omkar' where Student_Id=9";
		String query = "delete from student_info where Student_Id=9";
		stmt.executeUpdate(query);
		
		//step 43
		conn.close();
		
		System.out.println("Connected Successfully");
		
		
	}

}
