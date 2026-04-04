package domain.facturas;

import domain.personas.Cliente;

public class FacturaMensual {
    private Cliente unCliente;

    public FacturaMensual(Cliente unCliente){
        this.unCliente = unCliente;
    }

    public double calcularMonto(){
        return unCliente.calcularPago();
    }

}
