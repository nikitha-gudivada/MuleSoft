import java.sql.*;

public class Create_Table {
	public static void main(String[] args) {

		try {

			Connection con = null; // Create Connection
			Statement stmt = null; // Declare Statement & Initialize with null

			con = DriverManager // Connect to DataBase
					.getConnection("jdbc:sqlite:/D:\\Mulesoft\\MovieDB.db");
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String qry = "CREATE TABLE Movies " + "(NameOfMovie TEXT NOT NULL," + " NameOfDirector TEXT NOT NULL, " // CreateQuery
					+ "Actor TEXT NOT NULL, " + "Actress TEXT NOT NULL, " + " YearOfRelease INTEGER NOT NULL)";

			stmt.executeUpdate(qry); // Execute Query

			stmt.close(); // Close Statement
			con.close(); // Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created successfully!!!!");
	}
}