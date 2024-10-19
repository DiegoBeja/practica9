public class Bicicleta extends MedioDeTransporteMecanico{

    public Bicicleta(String nombre, int identificador, int anoDeCreacion, boolean encendido, Mantenimiento mantenimiento) {
        super(nombre, identificador, anoDeCreacion, encendido, mantenimiento);
    }

    @Override
    public void encender(){
        encendido = true;
        System.out.println("La bici esta lista para usarse");
    }
    
}
