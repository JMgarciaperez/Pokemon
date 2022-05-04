package pokemon;

public class Estado_mov extends Movimientos{
    private int potencia;
    private TiposEstados estado;


    public Estado_mov() {
        this.potencia=0;
        this.estado= TiposEstados.SIN_ESTADO;
    }


    public Estado_mov(int potencia, TiposEstados estado) {
        this.potencia = potencia;
        this.estado = estado;
    }
    
    public Estado_mov(Estado_mov em) {
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