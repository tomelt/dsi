package domain.personas;

import domain.planes.Plan;

public class Cliente extends Persona{
    private Integer dispositivosConectados;
    private Plan planAsociado;

    public Cliente(String nombre, String apellido, Integer numeroDeDocumento, Integer dispositivosConectados, Plan planAsociado){
        super(nombre, apellido, numeroDeDocumento);
        this.dispositivosConectados = dispositivosConectados;
        this.planAsociado = planAsociado;
    }

    public Integer getDispositivosConectados() {
        return dispositivosConectados;
    }

    public double calcularPago(){
        return planAsociado.pagoMensual(this);
    }

    public void setDispositivosConectados(Integer dispositivosConectados) {
        this.dispositivosConectados = dispositivosConectados;
    }

    public Plan getPlanAsociado() {
        return planAsociado;
    }

    public void setPlanAsociado(Plan planAsociado) {
        this.planAsociado = planAsociado;
    }
}
