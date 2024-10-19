public class MedioDeTransporteAnimal extends MedioDeTransporte{
    protected boolean preparar;
    protected boolean descansar;

    public MedioDeTransporteAnimal(String nombre, int identificador, int anoDeCreacion, boolean preparar, boolean descansar, Mantenimiento mantenimiento) {
        super(nombre, identificador, anoDeCreacion, mantenimiento);
        this.preparar = preparar;
        this.descansar = descansar;
    }
    
    public void preparar(){
        preparar = true;
    }
    
    public void descansar(){
        descansar = true;
    }
}
