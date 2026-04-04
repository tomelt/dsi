package domain.planes;

import domain.personas.Cliente;

public abstract class Plan {
    protected Double tarifaBase;

    public Plan(Double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public abstract double pagoMensual(Cliente unCliente);
}
