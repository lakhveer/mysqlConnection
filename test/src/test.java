import java.sql.*;

public class test {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World !");
	}

}

class db {

	public static final String DRIVERS = "com.mysql.jdbc.Driver";
	public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/employee";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(DRIVERS);
			con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}