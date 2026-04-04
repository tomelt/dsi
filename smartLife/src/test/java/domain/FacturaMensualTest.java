package domain;

import domain.facturas.FacturaMensual;
import domain.personas.Cliente;
import domain.planes.Comercio;
import domain.planes.Corporativo;
import domain.planes.Hogar;
import domain.planes.Plan;
import org.junit.Assert;
import org.junit.Test;

public class FacturaMensualTest {

    @Test
    public void testFacturaPlanHogar() {
        Plan planHogar = new Hogar(10.5);
        Cliente juan = new Cliente("Juan", "Clavito", 46958458, 3, planHogar);

        FacturaMensual facturaJuan = new FacturaMensual(juan);

        Assert.assertEquals(10.5, facturaJuan.calcularMonto(), 0);
    }

    @Test
    public void testFacturaComercio() {
        Plan planComercio = new Comercio(10.5, 5);
        Cliente juan = new Cliente("Juan", "Clavito", 46958458, 3, planComercio);

        FacturaMensual facturaJuan = new FacturaMensual(juan);

        Assert.assertEquals(25.5, facturaJuan.calcularMonto(), 0);
    }

    @Test
    public void testFacturaPlanCorporativo() {
        Plan planCorporativo = new Corporativo(20.0, 0.5);
        Cliente juan = new Cliente("Juan", "Clavito", 46958458, 3, planCorporativo);

        FacturaMensual facturaJuan = new FacturaMensual(juan);

        Assert.assertEquals(10, facturaJuan.calcularMonto(), 0);
    }



}
