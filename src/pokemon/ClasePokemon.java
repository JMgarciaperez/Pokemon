package pokemon;

import java.util.ArrayList;
import java.util.Random;

public class ClasePokemon {

    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private float velocidad;
    protected int estamina;
    private int nivel;
    private double experiencia;
    private EnumeradoTipos tipo1;
    private EnumeradoTipos tipo2;
    private ArrayList<Movimientos> ColeccionMov;
    private static ArrayList<String> nombresPokemon = new ArrayList<>();


    private static final double VENTAJA = 2;
    private static final double DESVENTAJA = 0.5;
    private static final double NEUTRO = 1;
    
    // TODO: Esto se hace en un main o fuera de la clase
    // ClasePokemon pokemonEntrenador = new ClasePokemon();
    // ClasePokemon pokemonRival = new ClasePokemon();

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
        this.experiencia = 0;
        this.tipo1 = EnumeradoTipos.NORMAL;
        this.tipo2 = EnumeradoTipos.NORMAL;
        this.ColeccionMov = new ArrayList<Movimientos>();
    }

    
    
    public ClasePokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial, 
                        int defensaEspecial, float velocidad, int estamina, int nivel, double experiencia , 
                        EnumeradoTipos tipo1, EnumeradoTipos tipo2, ArrayList<Movimientos> ColeccionMov) {
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
        this.experiencia = experiencia;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.ColeccionMov = ColeccionMov;
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
        this.experiencia = cp.experiencia;
        this.tipo1 = cp.tipo1;
        this.tipo2 = cp.tipo2;
        this.ColeccionMov = cp.ColeccionMov;
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

    public double getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<Movimientos> getColeccionMov() {
        return this.ColeccionMov;
    }

    public void setColeccionMov(ArrayList<Movimientos> ColeccionMov) {
        this.ColeccionMov = ColeccionMov;
    }

    public EnumeradoTipos getTipo1() {
        return this.tipo1;
    }

    public void setTipo1(int tipo1) {
        this.tipo1 = EnumeradoTipos.NORMAL;
    }

    public EnumeradoTipos getTipo2() {
        return this.tipo2;
    }

    public void setTipo2(int tipo2) {
        this.tipo2 = EnumeradoTipos.NORMAL;
    }

    public void experienciaTrasCombate(ClasePokemon pokemonEntrenador ,ClasePokemon pokemonRival){

        if ((pokemonEntrenador.vitalidad>0)&&(pokemonRival.vitalidad==0))
        pokemonEntrenador.setExperiencia( pokemonEntrenador.getExperiencia()+((pokemonEntrenador.nivel + pokemonRival.nivel)*10)/4);
    }

    public boolean subirNivel() {
        boolean resultado=false;
        if(this.experiencia >= (10*nivel)){
            this.experiencia -= (10*nivel);
            nivel++;
            this.vitalidad=(int) (this.vitalidad+(Math.random()* 5+1));
            this.ataque=(int) (this.ataque+(Math.random()* 5+1));
            this.defensa=(int) (this.defensa+(Math.random()* 5+1));
            this.ataqueEspecial=(int) (this.ataqueEspecial+(Math.random()* 5+1));
            this.defensaEspecial=(int) (this.defensaEspecial+(Math.random()* 5+1));
            resultado=true;
        }
        return false;
    }

    public boolean descansar() {

        return false;
    }

    public double ventajaDesventaja(EnumeradoTipos tip1, EnumeradoTipos tip2) {
    
        if(tip1 == EnumeradoTipos.AGUA && tip2 == EnumeradoTipos.FUEGO || tip2 == EnumeradoTipos.TIERRA){
            return VENTAJA;

        }else if(tip1 == EnumeradoTipos.AGUA && tip2 == EnumeradoTipos.PLANTA || tip2 == EnumeradoTipos.ELECTRICO){
            return DESVENTAJA;

        }else if(tip1 == EnumeradoTipos.FUEGO && tip2 == EnumeradoTipos.PLANTA || tip2 == EnumeradoTipos.BICHO){
            return VENTAJA;

        }else if(tip1 == EnumeradoTipos.FUEGO && tip2 == EnumeradoTipos.TIERRA || tip2 == EnumeradoTipos.AGUA){
            return DESVENTAJA;

        }else if(tip1 == EnumeradoTipos.PLANTA && tip2 == EnumeradoTipos.TIERRA || tip2 == EnumeradoTipos.AGUA){
            return VENTAJA;

        }else if(tip1 == EnumeradoTipos.PLANTA && tip2 == EnumeradoTipos.FUEGO || tip2 == EnumeradoTipos.BICHO){
            return DESVENTAJA;

        }else if(tip1 == EnumeradoTipos.BICHO && tip2 == EnumeradoTipos.PLANTA || tip2 == EnumeradoTipos.AGUA){
            return VENTAJA;

        }else if(tip1 == EnumeradoTipos.BICHO && tip2 == EnumeradoTipos.FUEGO|| tip2 == EnumeradoTipos.VOLADOR){
            return DESVENTAJA;

        }else if(tip1== EnumeradoTipos.VOLADOR && tip2 == EnumeradoTipos.PLANTA || tip2 == EnumeradoTipos.BICHO){
            return VENTAJA;

        }else if(tip1== EnumeradoTipos.VOLADOR && tip2 == EnumeradoTipos.ELECTRICO || tip2 == EnumeradoTipos.TIERRA){
            return DESVENTAJA;

        }else if(tip1== EnumeradoTipos.ELECTRICO && tip2 == EnumeradoTipos.VOLADOR || tip2 == EnumeradoTipos.AGUA){
            return VENTAJA;

        }else if(tip1== EnumeradoTipos.ELECTRICO && tip2 == EnumeradoTipos.TIERRA || tip2 == EnumeradoTipos.PLANTA){
            return DESVENTAJA;

        }else if(tip1== EnumeradoTipos.TIERRA && tip2 == EnumeradoTipos.FUEGO || tip2 == EnumeradoTipos.ELECTRICO){
            return VENTAJA;

        }else if(tip1== EnumeradoTipos.TIERRA && tip2 == EnumeradoTipos.AGUA || tip2 == EnumeradoTipos.PLANTA){
            return DESVENTAJA;

        }
        return NEUTRO;
    }

    public double potenciaTotal(Movimientos movimientoUsar, ClasePokemon pokemonRival){
        double potenciaTotal = 0;
        if(movimientoUsar.tipo == EnumeradoTipos.NORMAL){
            potenciaTotal = ((this.ataque * movimientoUsar.getPotencia()) - pokemonRival.defensa);
            potenciaTotal *= ventajaDesventaja(this.tipo1, pokemonRival.tipo1);
        }else if(movimientoUsar.tipo == this.tipo1){
            potenciaTotal = ((this.ataque * 1.2 *  movimientoUsar.getPotencia()) - pokemonRival.defensa);
            potenciaTotal *= ventajaDesventaja(this.tipo1, pokemonRival.tipo1);
        }else if(ventajaDesventaja(pokemonRival.tipo1, movimientoUsar.tipo)==VENTAJA){
            potenciaTotal = ((this.ataque * 0.5 *  movimientoUsar.getPotencia()) - pokemonRival.defensa);
            potenciaTotal *= ventajaDesventaja(this.tipo1, pokemonRival.tipo1);
        }
        return potenciaTotal;
    }

    public void ataqueMovimientos(ClasePokemon pokemonEntrenador, ClasePokemon pokemonRival, Movimientos movimientoUsar){
        if (pokemonEntrenador.velocidad >= pokemonRival.velocidad){
            
            do {
                pokemonRival.actualizarVida(pokemonEntrenador.potenciaTotal(movimientoUsar, pokemonRival));
                pokemonEntrenador.actualizarVida(pokemonRival.potenciaTotal(movimientoUsar, pokemonRival));
                
            } while (pokemonEntrenador.vitalidad == 0 || pokemonRival.vitalidad == 0);
        }
        do {
            pokemonEntrenador.actualizarVida(pokemonRival.potenciaTotal(movimientoUsar, pokemonRival));
            pokemonRival.actualizarVida(pokemonEntrenador.potenciaTotal(movimientoUsar, pokemonRival));
            
        } while (pokemonEntrenador.vitalidad == 0 || pokemonRival.vitalidad == 0);

    }

    public void actualizarVida(double cantidad) {
        this.vitalidad -= cantidad;
        if (this.vitalidad < 0) {
            this.vitalidad = 0;
        }
    }
    
    public static void inicializarListaNombres(ArrayList<String> paramNombresPokemon){
        nombresPokemon = paramNombresPokemon;
    }

    public static ClasePokemon generarPokemonAleatorio(String nombre){
        Random rnd = new Random();
        ClasePokemon nuevoPokemon = new ClasePokemon();
        nuevoPokemon.setNivel(1);
        nuevoPokemon.set(rnd.nextInt(5)+1);
        nuevoPokemon.setVitalidad(rnd.nextInt(5)+1);
        nuevoPokemon.setAtaque(rnd.nextInt(5)+1);
        nuevoPokemon.setDefensa(rnd.nextInt(5)+1);
        nuevoPokemon.setAtaqueEspecial(rnd.nextInt(5)+1);
        nuevoPokemon.setDefensaEspecial(rnd.nextInt(5)+1);
        nuevoPokemon.setVelocidad(rnd.nextInt(5)+1);
        nuevoPokemon.setEstamina(rnd.nextInt(5)+1);
        nuevoPokemon.setColeccionMov(rnd.nextInt(5)+1);
        nuevoPokemon.setTipo1(rnd.nextInt(5)+1);
        nuevoPokemon.setTipo2(rnd.nextInt(5)+1);
        nuevoPokemon.setNombre(nombresPokemon.get(rnd.nextInt(nombresPokemon.size() -1)));
        return nuevoPokemon;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", mote='" + getMote() + "'" +
            ", vitalidad='" + getVitalidad() + "'" +
            ", ataque='" + getAtaque() + "'" +
            ", defensa='" + getDefensa() + "'" +
            ", ataqueEspecial='" + getAtaqueEspecial() + "'" +
            ", defensaEspecial='" + getDefensaEspecial() + "'" +
            ", velocidad='" + getVelocidad() + "'" +
            ", estamina='" + getEstamina() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", experiencia='" + getExperiencia() + "'" +
            ", tipo1='" + getTipo1() + "'" +
            ", tipo2='" + getTipo2() + "'" +
            ", ColeccionMov='" + getColeccionMov() + "'" +
            "}";
    }
    
}