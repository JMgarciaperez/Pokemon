package pokemon;

import java.util.ArrayList;

public class ClasePokemon {

private String nombre;
private String mote;
private int vitalidad;
private int ataque;
private int defensa;
private int ataqueEspecial;
private int defensaEspecial;
private float velocidad;
private int estamina;
private int nivel;
ArrayList<Movimientos> Coleccion_mov ;

    public ClasePokemon(){
        super();
        this.nombre = "";
        this.mote = "";
        this.vitalidad = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.ataqueEspecial = 0;
        this.defensaEspecial = 0;
        this.velocidad = 0;
        this.estamina = 0;
        this.nivel = 1;
    }
    
    public ClasePokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, float velocidad, int estamina, int nivel) {
        super();
        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = nivel;
    }

    public ClasePokemon(ClasePokemon cp){
        super();
        this.nombre = cp.nombre;
        this.mote = cp.mote;
        this.vitalidad = cp.vitalidad;
        this.ataque = cp.ataque;
        this.defensa = cp.defensa;
        this.ataqueEspecial = cp.ataqueEspecial;
        this.defensaEspecial = cp.defensaEspecial;
        this.velocidad = cp.velocidad;
        this.estamina = cp.estamina;
        this.nivel = cp.nivel;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return this.mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getVitalidad() {
        return this.vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEspecial() {
        return this.ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return this.defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstamina() {
        return this.estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre=" + getNombre() + "" +
            ", mote=" + getMote() + "" +
            ", vitalidad=" + getVitalidad() + "" +
            ", ataque=" + getAtaque() + "" +
            ", defensa=" + getDefensa() + "" +
            ", ataqueEspecial=" + getAtaqueEspecial() + "" +
            ", defensaEspecial=" + getDefensaEspecial() + "" +
            ", velocidad=" + getVelocidad() + "" +
            ", estamina=" + getEstamina() + "" +
            ", nivel=" + getNivel() + "" +
            "}";
    }

}