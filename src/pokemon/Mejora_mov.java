package pokemon;

public class Mejora_mov extends Movimientos{
    private String mejora;
    private int cantidadMejora;

    public Mejora_mov() {
        this.mejora="";
        this.cantidadMejora=0; 
    }

    public Mejora_mov(String mejora, int cantidadMejora) {
        this.mejora = mejora;
        this.cantidadMejora = cantidadMejora;
    }
   
    public Mejora_mov(Mejora_mov mm) {
        this.mejora = mm.mejora;
        this.cantidadMejora = mm.cantidadMejora;
    }

    public String getMejora() {
        return this.mejora;
    }

    public void setMejora(String mejora) {
        this.mejora = mejora;
    }

    public int getCantidadMejora() {
        return this.cantidadMejora;
    }

    public void setCantidadMejora(int cantidadMejora) {
        this.cantidadMejora = cantidadMejora;
    }

    @Override
    public boolean consumoEstamina(double estaminaUsada) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " mejora='" + getMejora() + "'" +
            ", cantidadMejora='" + getCantidadMejora() + "'" +
            "}";
    }
}