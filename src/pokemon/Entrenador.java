package pokemon;

import java.util.Random;

public class Entrenador {


    private String nombre;
    private int pokeMonedas;
    private ClasePokemon[] equipoPokemon; 
    protected ClasePokemon[] equipoCaja;


  public Entrenador(String nombre, int pokeMonedas, ClasePokemon[] equipoPokemon, ClasePokemon[] equipoCaja) {
      super();
        this.nombre = nombre;
        this.pokeMonedas = pokeMonedas;
        this.equipoPokemon = equipoPokemon;
        this.equipoCaja =equipoCaja;
    }

    public ClasePokemon[] getEquipoPokemon() {
        return equipoPokemon;
    }
    public void  setEquipoPokemon(ClasePokemon[] equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }

    public ClasePokemon[] getEquipoCaja() {
        return equipoCaja;
    }
    public void  setEquipoCaja(ClasePokemon[] equipoCaja) {
        this.equipoCaja = equipoCaja;
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

    public void moverPokemonEquipoPokemon(ClasePokemon pokemon){
        if(equipoCaja.length > 1){
            ClasePokemon pok;

            for (int i=0; i<equipoCaja.length; i++){
                pok = equipoPokemon[i];

                if(pok.getIdPokemon() == pokemon.getIdPokemon()){
                    equipoCaja[i] = null;
                    
                    for (int j=0; j < equipoCaja.length; j++){
                        if (equipoPokemon[j]==null){
                            equipoPokemon[j] = pok;
                            break;

                        }
                    }
                }
            }
        }
    }


    public void moverPokemonCaja(ClasePokemon pokemon){
        
        if(equipoPokemon.length > 1){
            ClasePokemon pok;

            for (int i=0; i<equipoPokemon.length; i++){
                pok = equipoPokemon[i];

                if(pok.getIdPokemon() == pokemon.getIdPokemon()){
                    equipoPokemon[i] = null;
                    
                    for (int j=0; j < equipoCaja.length; j++){
                        if (equipoCaja[j]==null){
                            equipoCaja[j] = pok;
                            break;

                        }
                    }
                }
            }
        }
    }

    public boolean capturarPokemon(){
     
        return false;
    }

    public void probabilidadCaptura(int resultado){
        Random rnd = new Random();

        resultado = (rnd.nextInt(3) + 1);
        if(resultado >=2){
            
        }
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pokeMonedas='" + getPokeMonedas() + "'" +
            "}";
    }

    
}
