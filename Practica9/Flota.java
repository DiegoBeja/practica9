import java.util.ArrayList;

public class Flota {
    protected ArrayList<MedioDeTransporte> flota;

    public Flota(){
        flota = new ArrayList<>();
    }

    public void agregarTransporte(MedioDeTransporte transporteNuevo){
        flota.add(transporteNuevo);
        System.out.println("Se ha agregado " + transporteNuevo.toString() + " a la flota");
    }

    public void eliminarTransporte(MedioDeTransporte transporteNuevo){
        flota.remove(transporteNuevo);
        System.out.println("Se ha eliminado " + transporteNuevo.toString() + " de la flota");
    }

    public void mostraFlota(){
        for(MedioDeTransporte i : flota){
            System.out.println(i.toString());
        }
    }

    public int contidadFlota(){
        int contadorFlota = 0;
        for(MedioDeTransporte i : flota){
            contadorFlota ++;
        }
        return contadorFlota;
    }
}
