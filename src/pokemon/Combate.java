package pokemon;

public class Combate {


        protected String nombreRival;
        protected int koEntrenador;
        protected int koRival;
        protected Turno turno;


    public Combate(String nombreRival, int koEntrenador, int koRival,Turno turno) {
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
        this.turno = new Turno();
    }

    public Combate(Combate c) {
        super();
        this.nombreRival = c.nombreRival;
        this.koEntrenador = c.koEntrenador;
        this.koRival = c.koRival;
        this.turno = c.turno;
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

    public Turno getTurno() {
        return this.turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
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
