import java.sql.*;

public class Insert_Data {

	public static void main(String[] args) {
		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/D:\\Mulesoft\\MovieDB.db");
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String query1 = "INSERT INTO Movies values ('Srimanthudu','Koratala Shiva','Mahesh Babu','Shruthi Haasan',2015);";
			stmt.executeUpdate(query1); // Create Query-1

			String query2 = "INSERT INTO Movies values ('Raadhe Syam','Radha Kirshna Kumar','Prabhas','Pooja',2022);";
			stmt.executeUpdate(query2); // Create Query-2

			String query3 = "INSERT INTO Movies values ('Jersey','P Goutham ','Nani','Shradha',2019);";
			stmt.executeUpdate(query3); // Create Query-3

			String query4 = "INSERT INTO Movies values ('Chhichore','Nitesh Tiwari','S S Rajput','Shradha Kapoor',2019);";
			stmt.executeUpdate(query4); // Create Query-4

			String query5 = "INSERT INTO Movies values ('Titanic','James Cameroon','Leonardo De caprio','Kate Winslet',1997);";
			stmt.executeUpdate(query5); // Create Query-5

			stmt.close();

			con.close(); 				//Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data  Insertion successful!!");
	}
}