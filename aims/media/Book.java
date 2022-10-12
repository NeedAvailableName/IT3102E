package aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable{
    private ArrayList<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens;
    private Map<String, Integer> wordFrequency;

    public Book(String title){
        super(title);
    }
    public Book(String title, String category){
        super(title, category);
    }
        
    public Book(String title, String category, ArrayList<String> authors){
        super(title, category);
        this.authors = authors;
    }

    public Book(String title, String category, ArrayList<String> authors, float cost){
        super(title, category, cost);
        this.authors = authors;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }


    public void addAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.add(authorName);
            System.out.println("Added author successfully!");
        }else{
            System.out.println("Cannot add, author exists in the list!");
        }
    }

    public void removeAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("Removed author successfully!");
        }else{
            System.out.println("Cannot remove, author does not exist in the list!");
        }
    }
    @Override
    public int compareTo(Object o) {
        Book b = new Book("");
        b = (Book) o;
        if(b.getTitle().compareTo(this.getTitle()) > 0){
            return -1;
        }
        if(b.getTitle().compareTo(this.getTitle()) < 0){
            return 1;
        }
        return 0;
    }
    
    public void processContent(){
        String temp = new String(content);
        for (int i = 0; i < temp.length(); i++) {
            if(isPunctuation(temp.charAt(i)))
                temp.replace(temp.charAt(i), ' ');
        }
        String[] newContent = temp.split(" ");
        for (int i = 0; i < newContent.length; i++) {
            for(int j = 0; j < newContent.length - i; j++){
                if(newContent[j].compareTo(newContent[j + 1]) >= 0){
                    swap(newContent[j], newContent[j + 1]);
                }
            }
        }
        for (String item : newContent) {
            if(wordFrequency.containsKey(item)){
                wordFrequency.putIfAbsent(item, 1);
            }else{
                wordFrequency.replace(item, wordFrequency.get(item), wordFrequency.get(item)+ 1);
            }
            contentTokens.add(item);
        }

    }

    private boolean isPunctuation(Character c){
        if(Character.isLetterOrDigit(c))
            return true;
        return false;
    }

    private void swap(String a, String b){
        String temp = new String(a);
        temp.replaceAll(temp, a);
        a.replaceAll(a, b);
        b.replaceAll(b, temp);
    }

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("Author:" + authors.toString() + "\n");
        result.append("Content: " + content + "\n");
        result.append("Contents length: " + contentTokens.size() + "\n");
        result.append("Content token: " + contentTokens.toString() + "\n");
        result.append("Wordfrequency: " + wordFrequency.toString());
        return result.toString();
    }
}