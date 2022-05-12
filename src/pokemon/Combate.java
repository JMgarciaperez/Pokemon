package pokemon;

public class Combate {


        protected String nombreRival;
        protected int koEntrenador;
        protected int koRival;
        protected Turno[] turno;


    public Combate(String nombreRival, int koEntrenador, int koRival,Turno[] turno) {
        super();
        this.nombreRival = nombreRival;
        this.koEntrenador = koEntrenador;
        this.koRival = koRival;
        this.turno = turno;
    }

    public Combate() {
        super();
        this.nombreRival = "";
        this.koEntrenador = 0;
        this.koRival = 0;
        
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

    public Turno[] getTurno() {
        return this.turno;
    }

    public void setTurno(Turno[] turno) {
        this.turno = turno;
    }

    public boolean combatir(){
        
        return false;
    }

    public boolean retirarse(){
        
        return false;
    }

    public boolean experienciaObtenida(){
        
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

    public boolean primeroEnAtacar(){
        
        return false;
    }

    @Override
    public String toString() {
        return "{" +
            " nombreRival='" + getNombreRival() + "'" +
            ", koEntrenador='" + getKoEntrenador() + "'" +
            ", koRival='" + getKoRival() + "'" +
            ", turno='" + getTurno() + "'" +
            "}";
    }
 
}
