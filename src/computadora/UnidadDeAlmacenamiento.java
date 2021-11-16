
package computadora;

/**
 *
 * @author Lasek | Alexis Carlos Stephano Bravo Castañeda
 */
public class UnidadDeAlmacenamiento {
    //ATRIBUTOS
    private int capacidad;
    private String tipo;
    
    //CONSTRUCTOR
    public UnidadDeAlmacenamiento (String tipo, int capacidad){
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    //GET & SET
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
        return "UnidadDeAlmacenamiento{" + "Capacidad=" + capacidad + ", Tipo= " + tipo + '}';
    }
    
    
}
