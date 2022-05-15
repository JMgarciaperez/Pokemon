package pokemon;

public class EstadoMov extends Movimientos{
    private TiposEstados estado;


    public EstadoMov() {
        this.estado= TiposEstados.SIN_ESTADO;
    }


    public EstadoMov(int potencia, TiposEstados estado) {
        this.estado = estado;
    }
    
    public EstadoMov(EstadoMov em) {
        this.estado = em.estado;
    }

    public TiposEstados getEstado() {
        return this.estado;
    }

    public void setEstado(TiposEstados estado) {
        this.estado = estado;
    }
    
    @Override
    public void consumoEstamina(ClasePokemon pokemon) {
        pokemon.setEstamina(pokemon.getEstamina() - this.estaminaMov);
    }
    
    @Override
    public String toString() {
        return super.toString() + "{" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

}