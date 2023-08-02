
package Services;

import Entities.FamousSinger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class SingerService {
    
    private LinkedList<FamousSinger> singers = new LinkedList();
    private ArrayList<String> listOfSingersAsStrings = new ArrayList();
    
    public FamousSinger createSinger(String name, String bestSellingAlbum) {
        return new FamousSinger(name, bestSellingAlbum);
    }
    
    public void addSingerToTheList(FamousSinger singer) {
        singers.add(singer);
        updateListOfSingersAsStrings();
    }
    
    public void createAndAdd(String name, String bestSellingAlbum) {
        FamousSinger singer = createSinger(name, bestSellingAlbum);
        addSingerToTheList(singer);
    }
    
    public ArrayList<String> getListOfSingersAsStrings() {
        return listOfSingersAsStrings;
    }
    
    public void updateListOfSingersAsStrings() {
        listOfSingersAsStrings.clear();
        for (FamousSinger singer : singers) {
            listOfSingersAsStrings.add(singer.toString());
        }
    }
    
    public int listSize() {
        return singers.size();
    }
    
    public boolean searchSinger(String name) {

        boolean check = false;

        for (FamousSinger singer : singers) {

            if (singer.getName().equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
    
    public void removeSinger(String name) {
        Iterator<FamousSinger> iterator = singers.iterator();
        
        while (iterator.hasNext()) {
            FamousSinger singer = iterator.next();
            if (singer.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
        updateListOfSingersAsStrings();
    }   
}