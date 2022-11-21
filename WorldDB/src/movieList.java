import java.sql.*;
import java.util.ArrayList;

public class movieList
{
    private Connection connection;

    private final String url = "jdbc:mysql://localhost/world?" + "autoReconnect=true&useSSL=false";

// <editor-fold desc="Credentials">
    private final String username = "root";
    private final String password = "QW123123";
    //</editor-fold>
    private final ArrayList<Movie> movies = new ArrayList<>();

    public void run()
    {
        // connection
        establishConnection();

        // statement
        String query = "SELECT * FROM movie ORDER BY rating DESC LIMIT 100";

        try
        {
            Statement statement = this.connection.createStatement();
            statement.execute(query);

            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next())
            {
                String movieName = resultSet.getString("Name");
                int movieYear = resultSet.getInt("Year");
                String movieCategory = resultSet.getString("Category");
                float rating = resultSet.getInt("Rating");

                Movie movie = new Movie(movieName, movieYear, movieCategory, rating);
                this.movies.add(movie);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }


        // verify via sout
        printMovies();
    }

    private void printMovies()
    {
        for(Movie c : this.movies)
        {
            System.out.println(c.movieName + " : " + c.rating);
        }
    }

    private void establishConnection()
    {
        // connection
        try
        {
            connection = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}