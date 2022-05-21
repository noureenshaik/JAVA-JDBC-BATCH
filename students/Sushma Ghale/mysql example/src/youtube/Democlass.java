package youtube;

import java.sql.*;

/*step1 import --->java,sql
 * step2 load and register the driver---> com.mysql.jdbc.driver
 * step3 create connection ----> object connection interface
 * step4 create a statement ---->object statement interface
 * step4 execute the query ---->  details of the query which needs to be executed
 * step6 process the results -----> running application
 * step7close
 */
public class Democlass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String password = "Pachok07!";
		String query = "select username from demotable where userid = 21";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		rs.next();
		String name = rs.getString("username");

		System.out.println(name);

		
		st.close();
		con.close();
	}
}