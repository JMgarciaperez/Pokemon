package pokemon;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;

   
  public Entrenador(String nombre, int pokeMonedas) {
        this.nombre = nombre;
        this.pokeMonedas = pokeMonedas;
    }

    public Entrenador() {
        this.nombre = "";
        this.pokeMonedas = 0;
    }

    public Entrenador(Entrenador e) {
        this.nombre = e.nombre;
        this.pokeMonedas = e.pokeMonedas;
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
