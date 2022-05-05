package pokemon;

public class Combate {


        protected String nombreRival;
        protected int koEntrenador;
        protected int koRival;

    public Combate(String nombreRival, int koEntrenador, int koRival) {
        this.nombreRival = nombreRival;
        this.koEntrenador = koEntrenador;
        this.koRival = koRival;
    }

    public Combate() {
        this.nombreRival = "";
        this.koEntrenador = 0;
        this.koRival = 0;
    }

    public Combate(Combate c) {
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


    @Override
    public String toString() {
        return "{" +
            " nombreRival='" + getNombreRival() + "'" +
            ", koEntrenador='" + getKoEntrenador() + "'" +
            ", koRival='" + getKoRival() + "'" +
            "}";
    }
    
}
