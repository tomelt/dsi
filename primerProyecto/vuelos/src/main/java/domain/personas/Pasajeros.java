package domain.personas;

import domain.lugares.Ciudad;
import domain.lugares.Pais;
import domain.viajes.Vuelo;

import java.util.List;

public class Pasajeros extends Persona{
    private List<Vuelo> vuelos;
    private Integer numeroDePasaporte;
    private Pais pais;

     public Integer cantidadVecesQueVisitaste(Ciudad unaCiudad){
         return (int) this.vuelos
                 .stream()
                 .filter(vuelo -> vuelo.tuDestinoEs(unaCiudad))
                 .count();
     }

     
}
