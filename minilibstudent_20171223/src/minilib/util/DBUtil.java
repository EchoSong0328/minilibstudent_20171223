package minilib.util;

//import com.mysql.jdbc.Connection;
import java.sql.*;

public class DBUtil {
	//数据库的用户信息
	private static String rootname = "root";
	private static String rootpass = "echo19960328";
	
	//MySQL的驱动程序
	private static String driver="com.mysql.jdbc.Driver";
	
	//数据库的位置
	private static String url="jdbc:mysql://localhost:3306/book";//数据库名为book
	
	//创建与数据库的连接
	public static Connection getConnnection() throws InstantiationException, SQLException, IllegalAccessException, ClassNotFoundException{
		
			Class.forName(driver).newInstance();
			
		return DriverManager.getConnection(url,rootname,rootpass);
	}
}
