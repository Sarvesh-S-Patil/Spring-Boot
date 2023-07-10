import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Connections{
	public static void main(String[] args) {
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
			Statement st = con.createStatement();
			//--------------insert by using statement------------------
			String query = "USE jbdl53";
			st.execute(query);
//			String query1= "INSERT INTO bikes values (3,'Classic 350',150)";
//			st.execute(query1);
//			System.out.println("Executed successfully");
			//-------insert using PreaparedStatement--------------
			String query2= "insert into `bikes`(`BikeId`,`Model`,`Speed`) values (?,?,?)";
			PreparedStatement ps =con.prepareStatement(query2);
			ps.setInt(1, 5);
			ps.setString(2,"KTM");
			ps.setInt(3, 140);
			System.out.println(ps.executeUpdate());
			
			/*
			 * 1. executeBatch: 
			 * loop -> multiple 
			 */
			
			con.close();
			System.out.println("Executed successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Schema Updated");
	}
}