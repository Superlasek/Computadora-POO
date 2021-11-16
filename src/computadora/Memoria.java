
package computadora;

/**
 *
 * @author Super
 */
public class Memoria {
    //ATRIBUTOS
    private String tipo;
    private int capacidad;
    
    //CONSTRUCTOR
    public Memoria (String tipo, int capacidad){
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    //SET & GET

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //toString

    @Override
    public String toString() {
        return "Memoria{" + "tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
}
