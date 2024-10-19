public class MedioDeTransporteMecanico extends MedioDeTransporte{
    protected boolean encendido;

    public MedioDeTransporteMecanico(String nombre, int identificador, int anoDeCreacion, boolean encendido, Mantenimiento mantenimiento) {
        super(nombre, identificador, anoDeCreacion, mantenimiento);
        this.encendido = encendido;
    }

    public void encender(){
        encendido = true;
    }
}
