package domain.planes;

import domain.personas.Cliente;

public class Hogar extends Plan{

    public Hogar(Double tarifaBase){
        super(tarifaBase);
    }

    @Override
    public double pagoMensual(Cliente _unCliente) {
        return this.tarifaBase;
    }

}
