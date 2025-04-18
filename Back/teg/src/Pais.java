import java.util.Arrays;

public class Pais {

    private int idPais;

    private String nombrePais;

    private Pais[] fronterasPais;

    private int fichas;

    private Jugador duenio;

    private Continente continente;

    public int quitarFichas(int cantidad){
        if (this.fichas >= cantidad){
            this.fichas -= cantidad;
            return this.fichas;
        }
        else{
            throw new RuntimeException("Hubo un error al quitar fichas");
        }
    }
    public int sumarFichas(int cantidad){
        if (0 < cantidad){
            this.fichas += cantidad;
            return this.fichas;
        }
        else{
            throw new RuntimeException("No se puede agregar fichas negativas");
        }
    }
    // que deberia devolver? true? false? || array[fichas pais 1,fichas pais 2 ] || los 2 paises? || una classe que sea una "actualizacion de mapa"?

    public boolean moverFichas(int cantidad, Pais pais){
        //verificar que el pais sea frontera, que tenga suficientes fichas para pasar, que tenga el mismo dueño
        try {
            this.quitarFichas(cantidad);
            pais.sumarFichas(cantidad);
            return true;
        }
        catch (Exception e){
            throw new RuntimeException("Error al mover fichas");
        }
    }

}
