package domain.planes;

import domain.personas.Cliente;

public class Comercio extends Plan{
    private Integer adicionalPorDispositivo;

    public Comercio(Double tarifaBase, Integer adicionalPorDispositivo){
        super(tarifaBase);
        this.adicionalPorDispositivo = adicionalPorDispositivo;
    }

    @Override
    public double pagoMensual(Cliente unCliente) {
        return this.tarifaBase + this.adicional(unCliente.getDispositivosConectados());
    }

    public Integer adicional(Integer dispositivosConectados){
        return dispositivosConectados * adicionalPorDispositivo;
    }
}
