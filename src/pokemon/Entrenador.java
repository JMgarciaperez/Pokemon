package pokemon;

import java.util.ArrayList;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    ArrayList<ClasePokemon> ColeccionCaja;
    protected Combate combate;
    private Pokemon[] equipo; 
    protected Pokemon[] equipoSecundario;


  public Entrenador(String nombre, int pokeMonedas, Pokemon[] equipo,Pokemon[] equipoSecundario) {
      super();
        this.nombre = nombre;
        this.pokeMonedas = pokeMonedas;
        this.equipo = equipo;
        this.equipo=equipoSecundario;
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

    public Pokemon[] getEquipoSecundario() {
        return equipoSecundario;
    }
    public void  setEquipoSecundario(Pokemon[] equipoSecundario) {
        this.equipo = equipoSecundario;
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

    public boolean moverPokemonEquipo(){
        
        return false;
    }

    public boolean moverPokemonCaja(){
        
        return false;
    }

    public boolean entrenarPokemon(){
        
        return false;
    }

    public boolean capturarPokemon(){
        
        return false;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pokeMonedas='" + getPokeMonedas() + "'" +
            "}";
    }

    
}
