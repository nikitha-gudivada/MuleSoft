import java.sql.*;

public class Retrieve_Data {

	public static void main(String args[]) {

		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/D:\\Mulesoft\\MovieDB.db");
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM Movies;");

			while (rs.next()) {

				String moviename = rs.getString("NameOfMovie");

				String moviedirector = rs.getString("NameOfDirector");

				String maleLeadActor = rs.getString("Actor");

				String femaleLeadActor = rs.getString("Actress");

				Integer releaseYear = rs.getInt("YearOfRelease");
				

				System.out.println("Name of Movie    : " + moviename);

				System.out.println("Name of director : " + moviedirector);

				System.out.println("Actor    : " + maleLeadActor);

				System.out.println("Actress  : " + femaleLeadActor);

				System.out.println("Release Year  : " + releaseYear);
				
				System.out.println();

			}

			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data retrieval successful!!");
	}
}