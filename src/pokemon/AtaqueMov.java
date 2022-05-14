package pokemon;

public class AtaqueMov extends Movimientos{
    protected int potencia;


    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public AtaqueMov() {
        this.potencia=0;
    }


    public AtaqueMov(int potencia) {
        this.potencia = potencia;
    }

    public AtaqueMov(AtaqueMov am) {
        this.potencia = am.potencia;
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
            "}";
    }
}