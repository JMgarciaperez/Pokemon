package pokemon;

import java.util.ArrayList;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    ArrayList<ClasePokemon> ColeccionCaja;
    protected Combate combate;
    private ClaseMain[] equipo; 
    protected ClaseMain[] equipoSecundario;


  public Entrenador(String nombre, int pokeMonedas, ClaseMain[] equipo,ClaseMain[] equipoSecundario) {
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

    public ClaseMain[] getEquipo() {
        return equipo;
    }
    public void  setEquipo(ClaseMain[] equipo) {
        this.equipo = equipo;
    }

    public ClaseMain[] getEquipoSecundario() {
        return equipoSecundario;
    }
    public void  setEquipoSecundario(ClaseMain[] equipoSecundario) {
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
