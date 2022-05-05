package pokemon;

import java.util.ArrayList;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    ArrayList<ClasePokemon> ColeccionCaja;
    protected Combate combate;
    

   
  public Entrenador(String nombre, int pokeMonedas, Combate combate) {
      super();
        this.nombre = nombre;
        this.pokeMonedas = pokeMonedas;
        this.combate=combate;
    }

    public Entrenador() {
        super();
        this.nombre = "";
        this.pokeMonedas = 0;
        this.combate= new Combate();
    }

    public Entrenador(Entrenador e) {
        super();
        this.nombre = e.nombre;
        this.pokeMonedas = e.pokeMonedas;
        this.combate=e.combate;
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
