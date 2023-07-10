/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́á
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
*/
package extraejercicio01;

import Service.SongService;

public class ExtraEjercicio01 {

    public static void main(String[] args) {
        SongService ss = new SongService();
        ss.loadSong();
        System.out.println("");
        ss.showSong();
    }
}