package Films;

public class Movie {
    private String title;
    private int year;

    public Movie(String title,int year){
        this.title = title;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

}
