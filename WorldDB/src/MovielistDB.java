import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovielistDB {
    public void createMovieTable(){
        try {
            //Connection to MYSQL
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sp3plus", "root", "QW123123");
            PreparedStatement createTable = connection.prepareStatement("CREATE TABLE IF NOT EXISTS MovieList(iD int NOT NULL AUTO_INCREMENT, MovieName varchar(255), MovieYear varchar(255), MovieCategory varchar(255), Rating varchar(255), PRIMARY KEY(iD))");
            createTable.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Your Table Has Been Created");
        }
    }


}


