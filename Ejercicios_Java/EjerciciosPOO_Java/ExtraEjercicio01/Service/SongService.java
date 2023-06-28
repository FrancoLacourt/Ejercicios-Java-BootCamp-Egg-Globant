
package Service;

import Entity.Song;
import java.util.Scanner;


public class SongService {
    Scanner sc = new Scanner(System.in);
    
    public Song loadSong() {
        Song s = new Song();
        
        System.out.println("Ingrese el título de la canción.");
        s.setTitle(sc.nextLine());
        System.out.println("Ingrese el nombre del autor de la canción.");
        s.setAuthor(sc.nextLine());
        
        return s;
    }
    
    public void showSong(Song s) {
        System.out.println(s.toString());
    }
}