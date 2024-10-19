public class Caballo extends MedioDeTransporteAnimal{

    public Caballo(String nombre, int identificador, int anoDeCreacion, boolean preparar, boolean descansar, Mantenimiento mantenimiento) {
        super(nombre, identificador, anoDeCreacion, preparar, descansar, mantenimiento);
    }
    

    @Override
    public void virar(){
        System.out.println("El caballo a cambiado de direccion");
    }


}
