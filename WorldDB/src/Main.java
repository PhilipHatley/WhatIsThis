public class Main
{
    public static void main(String[] args)
    {
        MovielistDB movielistDB = new MovielistDB();
        movieList movieList = new movieList();
        //movieList.run();
        movielistDB.createMovieTable();
    }
}