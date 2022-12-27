import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql:///AJP_PR","root","");
			PreparedStatement preparedStatement = connection.prepareStatement("update student set studentName=(?) where rollNo=(?)");
			System.out.println("Enter the student Roll no : ");
			int rollNo = scanner.nextInt();
			System.out.println("Enter the student name : ");
			String studentNameString = scanner.next();
			
			preparedStatement.setString(1, studentNameString);
			preparedStatement.setInt(2, rollNo);
			
			int rowUpdate = preparedStatement.executeUpdate();
			
			if (rowUpdate!=0) {
				System.out.println("Studnet Name Updated");
			} else {
				System.out.println("Student Name not Updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
