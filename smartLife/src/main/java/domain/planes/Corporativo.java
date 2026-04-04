package domain.planes;

import domain.personas.Cliente;

public class Corporativo extends Plan{
    private Double descuento;

    public Corporativo(Double tarifaBase, Double descuento){
        super(tarifaBase);
        this.descuento = descuento;
    }

    @Override
    public double pagoMensual(Cliente _unCliente) {
        return this.tarifaPersonalizada();
    }

    public double tarifaPersonalizada(){
        return this.tarifaBase - this.calcularDescuento();
    }

    public double calcularDescuento(){
        return this.tarifaBase * this.descuento;
    }



}
