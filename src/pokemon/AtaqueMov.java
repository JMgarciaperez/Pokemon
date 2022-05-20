package pokemon;

public class AtaqueMov extends Movimientos{
    
    public AtaqueMov() {
        super();
    }

    @Override
    public void consumoEstamina(ClasePokemon pokemon) {
        pokemon.setEstamina(pokemon.getEstamina() - this.estaminaMov);
    }

}