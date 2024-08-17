package JDBC_QSP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

//import java.sql.*;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Class.forName("org.postgresql.Driver");
			System.out.println("Driver Class is loaded ");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","004321");
			System.out.println(con);
			Statement stm=con.createStatement();
			stm.execute("insert into college values('xyz')");
			System.out.println("Value insterted");
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
