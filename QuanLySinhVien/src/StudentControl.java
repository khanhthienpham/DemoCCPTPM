import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentControl {
	public static ArrayList<Student> getAllStudent(){
		ArrayList<Student> list = new ArrayList<>();
		
		Connection conn = DatabaseConn.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from SinhVien");	
			while(rs.next()) {
				String Name = rs.getString("HoTen");
				String ID = rs.getString("MaSV");
				String Password = rs.getString("Password");
				
				Student sv = new Student(Name, ID, Password);
				list.add(sv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
