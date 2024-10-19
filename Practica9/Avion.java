public class Avion extends MedioDeTransporteMecanico{

    public Avion(String nombre, int identificador, int anoDeCreacion, boolean encendido, Mantenimiento mantenimiento) {
        super(nombre, identificador, anoDeCreacion, encendido, mantenimiento);
    }
    

    @Override
    public void encender(){
        encendido = true;
        System.out.println("El avion tiene los motores listos");
    }
}
