package Films;

public class MovieCollection {
    private final int MAX_SIZE = 20;
    private Movie[] movies;
    private int index;
    private boolean isFull;


    public MovieCollection(){
        this.movies = new Movie[MAX_SIZE];
        this.index = 0;
        this.isFull = false;
    }

    public int getIndex(){
        return this.index;
    }

    public boolean getIsFull(){
        return this.isFull;
    }

    public Movie[] getMovies(){
        return this.movies;
    }

    public void addMovie(Movie movie){
        if (!isFull){
            this.movies[this.index] = movie;
            this.index++;
            if (this.index >= this.MAX_SIZE){
                this.isFull = true;
            }
        }
    }








}
