package pokemon;

public class Ataque_mov extends Movimientos{
    private int potencia;


    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public Ataque_mov() {
        this.potencia=0;
    }


    public Ataque_mov(int potencia) {
        this.potencia = potencia;
    }

    public Ataque_mov(Ataque_mov am) {
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