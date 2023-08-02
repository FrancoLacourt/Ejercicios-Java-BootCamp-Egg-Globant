
package Entities;


public class FamousSinger {
    
    private String name;
    private String BestSellingAlbum;

    public FamousSinger() {
    }

    public FamousSinger(String name, String BestSellingAlbum) {
        this.name = name;
        this.BestSellingAlbum = BestSellingAlbum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestSellingAlbum() {
        return BestSellingAlbum;
    }

    public void setBestSellingAlbum(String BestSellingAlbum) {
        this.BestSellingAlbum = BestSellingAlbum;
    }

    @Override
    public String toString() {
        return "Singer: " + name + ", Best selling album" + BestSellingAlbum;
    }
}
