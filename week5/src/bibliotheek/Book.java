package bibliotheek;

public class Book {
    private String author;
    private String title;
    private int numberOfPages;
    private boolean borrowed;


    public Book(String author,String title,int numberOfPages){
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.borrowed = false;
    }
    public Book(){
        this("Onbekend","Onbekend",0);
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void printDetails(){
        String isBorrowed = (this.borrowed) ? "ontleend":"niet ontleend";
        System.out.println("Het boek " + this.title + "( " + this.numberOfPages + " pages), geschreven door " + this.author + " is momenteel " + isBorrowed);

    }

}
