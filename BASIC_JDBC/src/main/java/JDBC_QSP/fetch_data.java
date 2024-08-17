package JDBC_QSP;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class fetch_data {

	public static void main(String[] args) throws SQLException {
		try {
			// step1 :
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Class is Loaded");
			// step 2:
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","004321");
			// setp 3:
			Statement stm = con.createStatement();
			// step 4:
			ResultSet rs = stm.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(rs.getString(0));
				System.out.println(rs.getInt(0));
				System.out.println(rs.getLong(0));
				System.out.println("----------------");
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
