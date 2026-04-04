package domain.lugares;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.aeropuertos = new ArrayList<>();
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public Integer cantidadDeAeropuertos() {
        return this.aeropuertos.size();
    }

    public void agregarAeropuertos(Aeropuerto ... aeropuertos){
        Collections.addAll(this.aeropuertos, aeropuertos);
    }

    public Integer cantidadDePasajerosQueLLegaronElDia(LocalDate unDia){
        List<Vuelo> vuelosQueLlegaronEseDia = this.aeropuertos
                .stream()
                .flatMap(aeropuerto -> aeropuerto.vuelosQueLlegaronElDia(unDia).stream())
                .collect(Collectors.toList());
        return vuelosQueLlegaronEseDia
                .stream()
                .mapToInt(Vuelo::cantidadDePasajeros)
                .sum();
    }


}
