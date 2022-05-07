package pokemon;

public class EstadoMov extends Movimientos{
    protected int potencia;
    private TiposEstados estado;


    public EstadoMov() {
        this.potencia=0;
        this.estado= TiposEstados.SIN_ESTADO;
    }


    public EstadoMov(int potencia, TiposEstados estado) {
        this.potencia = potencia;
        this.estado = estado;
    }
    
    public EstadoMov(EstadoMov em) {
        this.potencia = em.potencia;
        this.estado = em.estado;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public TiposEstados getEstado() {
        return this.estado;
    }

    public void setEstado(TiposEstados estado) {
        this.estado = estado;
    }
    
    @Override
    public boolean consumoEstamina(double estaminaUsada) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public String toString() {
        return super.toString() + "{" +
            " potencia='" + getPotencia() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

}