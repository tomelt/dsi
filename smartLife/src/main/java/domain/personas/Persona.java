package domain.personas;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer numeroDeDocumento;

    public Persona(String nombre, String apellido, Integer numeroDeDocumento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeDocumento = numeroDeDocumento;
    }
}
