import java.util.ArrayList;

public class MedioDeTransporte {
    protected String nombre;
    protected int identificador;
    protected int anoDeCreacion;
    protected ArrayList<Mantenimiento> cantidadMantenimientos;
    
    public MedioDeTransporte(String nombre, int identificador, int anoDeCreacion, Mantenimiento mantenimiento){
        this.nombre = nombre;
        this.identificador = identificador;
        this.anoDeCreacion = anoDeCreacion;
        this.cantidadMantenimientos = new ArrayList<>();
        cantidadMantenimientos.add(mantenimiento);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Id: " + identificador + " Año: " + anoDeCreacion + " | Mantenimientos:" +cantidadMantenimientos.toString();
    }

    public void avanzar(){
        System.out.println("El auto esta avanzando");
    }

    public void retroceder(){
        System.out.println("El auto esta retrocediendo");
    }

    public void virar(){
        System.out.println("El auto esta girando");
    }
}
