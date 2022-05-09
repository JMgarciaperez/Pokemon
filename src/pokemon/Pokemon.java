package pokemon;

import java.util.HashMap;
import java.util.LinkedList;

public class Pokemon {
    private HashMap<EnumeradoTipos, LinkedList<EnumeradoTipos>> debilidades;
    private EnumeradoTipos tipo1;

    public void anyadirDebilidades() {
        debilidades = new HashMap<>();
        LinkedList<EnumeradoTipos> listaAgua = new LinkedList<>();
        listaAgua.add(EnumeradoTipos.PLANTA);
        listaAgua.add(EnumeradoTipos.ELECTRICO);
        debilidades.put(EnumeradoTipos.AGUA, listaAgua);


    }

    public boolean comprobarDebilidad(EnumeradoTipos tipo){
        return this.debilidades.get(this.tipo1).contains(tipo);
    }
}
