package sqlite.org.app.app;

import java.sql.*;

public class SqliteDataBase {
   public String path = "jdbc:sqlite:/home/lewi/Softwares/";
   private final Statement statement =null;
   private final PreparedStatement preparedStatement = null;

   public void createDatabase(String databaseName){
      String url = path.concat(databaseName);
      try(Connection connection =DriverManager.getConnection(url)) {
         if (connection != null){
            System.out.println("Connection has been created");
         }
      }catch (SQLException e){
         System.out.println(e.getMessage());
      }
   }
   public void createTables(String tableName){

   }

}
