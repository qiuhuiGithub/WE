package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCtrl {
	public Connection getConnection() {  
        Connection con = null;
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "qiuhui");
        } catch (Exception e) {  
        	e.printStackTrace();
            System.out.println("���ݿ�����ʧ��" + e.getMessage());  
        }  
        return con;   
    }  
}
