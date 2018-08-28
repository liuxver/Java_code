package Javaøº ‘;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/

import java.sql.*;
public class jdbc {

	static final String DRIVER="com.mysql.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost/twoshou";
	
	public static void main(String[] args) throws SQLException{
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(URL,"root","1234");
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from user");
			ResultSetMetaData metaData=resultSet.getMetaData();
			int n=metaData.getColumnCount();
			System.out.println(n);
			
			
			for(int i=1;i<=n;i++){
				System.out.printf("%-8s\t",metaData.getColumnTypeName(i));
				
			}
			
			System.out.println();
			
			while(resultSet.next()){
				for(int i=1;i<=n;i++){
					System.out.printf("%-8s\t",resultSet.getObject(i));
				}
				
				System.out.println();
			}
			
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			resultSet.close();
			statement.close();
			connection.close();
		}
		
		
	}
}
