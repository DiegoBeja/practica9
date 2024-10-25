import java.util.ArrayList;

public class Escenario {
    private String nombre;
    private int N;
    private Elemento[][] campoDeBatalla;

    public Escenario(String nombre, int N){
        campoDeBatalla = new Elemento[N][N];
        this.nombre = nombre;
        this.N = N;
    }

    public void agregarElemento(Elemento e){
        campoDeBatalla[e.getPosicion().getColumna()][e.getPosicion().getRenglon()] = e;
    }

    public void destruirElementos(Posicion p, int radio){
        ArrayList<Elemento> objetosAreaExplosion = new ArrayList<>();

        for (int i = Math.max(0, p.getRenglon() - radio); i <= Math.min(N - 1, p.getRenglon() + radio); i++) {
            for (int j = Math.max(0, p.getColumna() - radio); j <= Math.min(N - 1, p.getColumna() + radio); j++) {
                Elemento elemento = campoDeBatalla[i][j];
                if (elemento != null) {
                    objetosAreaExplosion.add(elemento);
                }
            }
        }

        for(Elemento i : objetosAreaExplosion){
           if(i instanceof Destruible){
                ((Destruible)i).destruir();
                Posicion pos = i.getPosicion();
                campoDeBatalla[pos.getRenglon()][pos.getColumna()] = null;
           }    
        }
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (campoDeBatalla[i][j] == null) {
                    sb.append(" 0 ");  
                } else if(campoDeBatalla[i][j] instanceof Bomba){
                    sb.append(" B ");
                } else if(campoDeBatalla[i][j] instanceof Roca){
                    sb.append(" R ");
                } else if(campoDeBatalla[i][j] instanceof Terricola){
                    sb.append(" T ");
                } else if(campoDeBatalla[i][j] instanceof Extraterrestre){
                    sb.append(" E ");
                }
            }
            sb.append('\n'); 
        }
        return sb.toString();
    }


}
