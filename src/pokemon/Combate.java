package pokemon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Combate {

        protected String nombreRival;
        protected int koEntrenador;
        protected int koRival;
        protected List<Turno> turnos;
        public static final String PATH = "./log/combate.log";

    public Combate(String nombreRival, int koEntrenador, int koRival) {
        super();
        this.nombreRival = nombreRival;
        this.koEntrenador = koEntrenador;
        this.koRival = koRival;

    }

    public Combate() {
        super();
        this.nombreRival = "";
        this.koEntrenador = 0;
        this.koRival = 0;
        this.turnos = new LinkedList<>();
    }

    public Combate(Combate c) {
        super();
        this.nombreRival = c.nombreRival;
        this.koEntrenador = c.koEntrenador;
        this.koRival = c.koRival;
        
    }

    public String getNombreRival() {
        return this.nombreRival;
    }

    public void setNombreRival(String nombreRival) {
        this.nombreRival = nombreRival;
    }

    public int getKoEntrenador() {
        return this.koEntrenador;
    }

    public void setKoEntrenador(int koEntrenador) {
        this.koEntrenador = koEntrenador;
    }

    public int getKoRival() {
        return this.koRival;
    }

    public void setKoRival(int koRival) {
        this.koRival = koRival;
    }

    public void addTurnos(Turno t){
        this.turnos.add(t);

    }

    public void escribirFichero(){

        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

           for (Turno turno : turnos) {
                bw.write("Turno " + turno.getNumeroTurno() + ": \n");
                bw.write("Entrenador: " + turno.getNombreAtaqueEntrenador() + "\n");
                bw.write("Rival: " + turno.getNombreAtaqueRival() + "\n");
           }

           bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean retirarse(){
        
        return false;
    }

    public boolean generarRivalAleatorio(){
        
        return false;
    }

	public static void generarPokemonsEnemigo() {

     }

    public boolean obtenerPokeMoneda(){
        
        return false;
    }
}
