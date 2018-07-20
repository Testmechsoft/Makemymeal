package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class connectingToDB {

	private Connection con = null;
	private Statement stmt = null;
	ResultSet resultSet = null;
	private String username = "M2SDBSrv_sa@svk1agk0m9";
	private String password = "Math.Shine";
	private String sqlquery = "select top 10 * from L3_Class";

	@Test
	public void test() throws SQLException, ClassNotFoundException {
		// Load Microsoft SQL Server JDBC driver.
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// Prepare connection url.
		String url = "jdbc:sqlserver://svk1agk0m9.database.windows.net;DatabaseName=WSDBPrime_Preuat";
		// Get connection to DB.
		con = DriverManager.getConnection(url, username, password);
		// Create statement object which would be used in writing DDL and DML
		// SQL statement.
		stmt = con.createStatement();

		resultSet = stmt.executeQuery(sqlquery);

		try {
			while (resultSet.next()) {
				// resultValue = resultSet.getString(1).toString();
				System.out.println(resultSet.getString(1).toString());
				System.out.println(resultSet.getString(2).toString());
				System.out.println(resultSet.getString(3).toString());
				// System.out.print(resultSet.getString(4).toString());
				System.out.println(resultSet.getString(5).toString());
				System.out.println(resultSet.getString(6).toString());
				// System.out.print(resultSet.getString(7).toString());
				// System.out.print(resultSet.getString(8).toString());
				System.out.println(resultSet.getString(9).toString());
				System.out.println(resultSet.getString(10).toString());
				System.out.println(resultSet.getString(11).toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
