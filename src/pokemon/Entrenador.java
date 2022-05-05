package pokemon;

import java.util.ArrayList;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    ArrayList<ClasePokemon> ColeccionCaja;
    protected Combate combate;
    private Pokemon[] equipo; 


  public Entrenador(String nombre, int pokeMonedas, Pokemon[] equipo) {
      super();
        this.nombre = nombre;
        this.pokeMonedas = pokeMonedas;
        this.equipo = equipo;
    }

    public Entrenador() {
        super();
        this.nombre = "";
        this.pokeMonedas = 0;
    }

    public Entrenador(Entrenador e) {
        super();
        this.nombre = e.nombre;
        this.pokeMonedas = e.pokeMonedas;
    }

    public Pokemon[] getEquipo() {
        return equipo;
    }
    public void  setEquipo(Pokemon[] equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPokeMonedas() {
        return this.pokeMonedas;
    }

    public void setPokeMonedas(int pokeMonedas) {
        this.pokeMonedas = pokeMonedas;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pokeMonedas='" + getPokeMonedas() + "'" +
            "}";
    }

    
}
