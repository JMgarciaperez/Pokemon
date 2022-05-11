package pokemon;

import java.util.ArrayList;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    ArrayList<ClasePokemon> ColeccionCaja;
    protected Combate combate;
    private ClasePokemon[] equipo; 
    protected ClasePokemon[] equipoSecundario;


  public Entrenador(String nombre, int pokeMonedas, ClasePokemon[] equipo, ClasePokemon[] equipoSecundario) {
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

    public ClasePokemon[] getEquipo() {
        return equipo;
    }
    public void  setEquipo(ClasePokemon[] equipo) {
        this.equipo = equipo;
    }

    public ClasePokemon[] getEquipoSecundario() {
        return equipoSecundario;
    }
    public void  setEquipoSecundario(ClasePokemon[] equipoSecundario) {
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

    public boolean capturarPokemon(int capturar){
     
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
