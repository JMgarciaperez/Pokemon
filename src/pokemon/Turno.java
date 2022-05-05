package pokemon;

public class Turno {

    private int numeroTurno;
    private String nombreAtaqueEntrenador;
    private String nombreAtaqueRival;



    public Turno(int numeroTurno, String nombreAtaqueEntrenador, String nombreAtaqueRival) {
        this.numeroTurno = numeroTurno;
        this.nombreAtaqueEntrenador = nombreAtaqueEntrenador;
        this.nombreAtaqueRival = nombreAtaqueRival;
    }

    public Turno() {
        this.numeroTurno = 1;
        this.nombreAtaqueEntrenador = "";
        this.nombreAtaqueRival = "";
    }

    
    public Turno(Turno t) {
        this.numeroTurno = t.numeroTurno;
        this.nombreAtaqueEntrenador = t.nombreAtaqueEntrenador;
        this.nombreAtaqueRival = t.nombreAtaqueRival;
    }



    public int getNumeroTurno() {
        return this.numeroTurno;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public String getNombreAtaqueEntrenador() {
        return this.nombreAtaqueEntrenador;
    }

    public void setNombreAtaqueEntrenador(String nombreAtaqueEntrenador) {
        this.nombreAtaqueEntrenador = nombreAtaqueEntrenador;
    }

    public String getNombreAtaqueRival() {
        return this.nombreAtaqueRival;
    }

    public void setNombreAtaqueRival(String nombreAtaqueRival) {
        this.nombreAtaqueRival = nombreAtaqueRival;
    }



    @Override
    public String toString() {
        return "{" +
            " numeroTurno='" + getNumeroTurno() + "'" +
            ", nombreAtaqueEntrenador='" + getNombreAtaqueEntrenador() + "'" +
            ", nombreAtaqueRival='" + getNombreAtaqueRival() + "'" +
            "}";
    }



    
}
