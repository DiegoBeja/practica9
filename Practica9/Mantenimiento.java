public class Mantenimiento {
    protected String tipo;
    protected int fecha;
    protected float costo;

    public Mantenimiento(String tipo, int fecha, int costo){
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "Tipo: " + tipo + " Fecha: " + fecha + " Cost: " + costo;
    }
}
