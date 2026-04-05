package domain.service.georef.entities;

import java.util.List;

//clase molde
public class ListadoDeProvincias {
    //usamos int ya que es dato puro, lo mas primitivo posible
    public int cantidad;
    public int inicio;
    public int total;
    public Parametro parametros;
    public List<Provincia> provincias;

    private class Parametro {
        public List<String> campos;
    }



}
