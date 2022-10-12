package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {
    private String content;

    private List<String> authors = new ArrayList <String>();

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }
    public Book() {}

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if(! authors.contains(authorName)){
            authors.add(authorName);
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
    public void remove(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
        }
    }

    @Override
    public int compareTo(Object obj) {
        Book temp = (Book)obj;
        if(temp.getTitle().compareTo(this.getTitle()) > 0) {
            return -1;
        }
        if(temp.getTitle().compareTo(this.getTitle()) < 0) {
            return 1;
        }
        return 0;
    }
}