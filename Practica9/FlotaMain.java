public class FlotaMain{
    public static void main(String[] args) {
        Flota flota = new Flota();
        Mantenimiento mantenimiento = new Mantenimiento("Lavado", 18102024, 1500);
        MedioDeTransporte carro = new MedioDeTransporte("GT-R", 1497, 1997, mantenimiento);
        MedioDeTransporte carro2 = new MedioDeTransporte("GT-R", 1497, 1997, mantenimiento);

        flota.agregarTransporte(carro);
        flota.agregarTransporte(carro2);
        flota.mostraFlota();
        
    }
}
