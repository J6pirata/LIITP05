package Conecta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;

public class Conectou {
	  private static Connection cn ;
	  
	  public static Connection getConnection() {
		   try {
			     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			   cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4SUFUR;databsaename=Cadstro;user=sa;password=teste123"
					   );
		   } 
		   catch(SQLException e) {
			   throw new RutimeException(e);
		   }
			   cn= null;
		   } return cn;
	  }
	  
