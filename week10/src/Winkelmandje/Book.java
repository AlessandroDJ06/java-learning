package Winkelmandje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Book extends Item{
    private String title;
    private List<String> authors;

    public Book(String id,double price,String title, String author){
        super(id,price);
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author){
        authors.add(author);
    }

    @Override
    public String toString() {
        Iterator<String> it = authors.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            String authors = it.next();

            if (it.hasNext()){
                sb.append(authors).append(", ");
            } else {
                sb.append(authors);
            }
        }
        return super.getId() + "\"" + title + "\"" + ", (" + sb + ')';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book book)) return false;
        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthors());
    }
}
