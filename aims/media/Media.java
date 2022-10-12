package aims.media;

public abstract class Media {

    private String title; 
    private String category;
    private float cost;
    private int id;

    Media(String title){
        this.title = title;
    }

    Media(String title, String category){
        this(title);
        this.category = category;
    }

    Media(String title, String category, float cost){
        this(title, category);
        this.cost = cost;
    }
    
    Media() {
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }
    
}
