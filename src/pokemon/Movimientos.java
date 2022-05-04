package pokemon;

public abstract class Movimientos {
    protected String nombre;
    protected int numeroTurnos;
    protected EnumeradoTipos tipo;


    public Movimientos() {
        super();
        this.nombre ="";
        this.numeroTurnos=0;
        this.tipo = EnumeradoTipos.NORMAL;
    }

    public Movimientos(String nombre, int numeroTurnos, EnumeradoTipos tipo) {
        this.nombre = nombre;
        this.numeroTurnos = numeroTurnos;
        this.tipo = tipo;
    }

    public Movimientos(Movimientos m) {
        this.nombre = m.nombre;
        this.numeroTurnos = m.numeroTurnos;
        this.tipo = m.tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public abstract boolean consumoEstamina(double estaminaUsada);

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numeroTurnos='" + getNumeroTurnos() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
}