package miniProject.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "random_lunch";
	private static final String USER = "root";
	private static final String PASSWORD = "skffkqhd831!";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
		
	}
	
	// lunch table 생성
	public static void dropAndCreateTable() {
		
		final String dropTableQuery = "DROP TABLE IF EXISTS lunch";
		
		// Statement : Query 전달 객체
		Connection conn;
		Statement stmt;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			stmt.execute(dropTableQuery); 
			
			final String createTableQuery = 
		            "CREATE TABLE lunch (" +
		            "food_id INT(5) unsigned NOT NULL AUTO_INCREMENT," +
		            "food_type CHAR(255)," +
		            "food_name CHAR(255)," +		            
		            "food_noodle BOOLEAN DEFAULT false," +
		            "food_rice BOOLEAN DEFAULT false," +
		            "food_stew BOOLEAN DEFAULT false," +
		            "PRIMARY KEY (food_id))";
			
			stmt.execute(createTableQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// profile table 생
	public static void dropAndCreateUserTable() {
			
		Connection conn;
		Statement stmt;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
				
			final String createTableQuery = 
					"CREATE TABLE profile (" +
				    "user_num INT(5) unsigned NOT NULL AUTO_INCREMENT," +
			        "user_id VARCHAR(255)," +
			        "user_password VARCHAR(255)," +	            
			        "PRIMARY KEY (user_num));";
				
			stmt.execute(createTableQuery);
			System.out.println("end");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


