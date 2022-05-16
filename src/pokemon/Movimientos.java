package pokemon;

public abstract class Movimientos {
    protected String nombre;
    protected int estaminaMov;
    protected int numeroTurnos;
    protected EnumeradoTipos tipo;
    protected double potencia;

    public Movimientos() {
        super();
        this.nombre ="";
        this.numeroTurnos=0;
        this.tipo = EnumeradoTipos.NORMAL;
        this.potencia = 0;
    }

    public Movimientos(String nombre, int numeroTurnos, EnumeradoTipos tipo, double potencia) {
        this.nombre = nombre;
        this.numeroTurnos = numeroTurnos;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public Movimientos(Movimientos m) {
        this.nombre = m.nombre;
        this.numeroTurnos = m.numeroTurnos;
        this.tipo = m.tipo;
        this.potencia = m.potencia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstaminaMov() {
     return estaminaMov;
    }

    public void setEstaminaMov(int estaminaMov) {
        this.estaminaMov = estaminaMov;
    }
    
    public int getNumeroTurnos() {
        return this.numeroTurnos;
    }

    public void setNumeroTurnos(int numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }

    public EnumeradoTipos getTipo() {
        return this.tipo;
    }

    public void setTipo(EnumeradoTipos Tipo) {
        this.tipo = Tipo;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public abstract void consumoEstamina(ClasePokemon pokemon);


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", estaminaMov='" + getEstaminaMov() + "'" +
            ", numeroTurnos='" + getNumeroTurnos() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", potencia='" + getPotencia() + "'" +
            "}";
    }
   
}