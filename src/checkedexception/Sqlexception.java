package checkedexception;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Sqlexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306//database");
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
