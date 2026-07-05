package IPL.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class JDBC {
private JDBC() {};
public static Connection getConnection() throws SQLException {
	String url="jdbc:mysql://localhost:3306/IPL";
	Connection conn=DriverManager.getConnection(url,"root","MyNewPassword123!");
	
	return conn;
	
}
}
