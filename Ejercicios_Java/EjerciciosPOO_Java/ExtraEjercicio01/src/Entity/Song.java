
package Entity;


public class Song {
    
    private String title;
    private String author;

    public Song() {
        title = "";
        author = "";
    }

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Título: " + title + ", autor: " + author;
    }   
}