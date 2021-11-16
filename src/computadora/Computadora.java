
package computadora;

/**
 *
 * @author Lasek | Alexis Carlos Stephano Bravo Castañeda
 */
public class Computadora {
    //ATRIBUTOS
    private String marca;    
    private String modelo;
    
    //Referencia no es igual a objeto
    //Referencias a otras clases.
    private CPU procesador;
    private Memoria mem;
    private UnidadDeAlmacenamiento ua;

    //CONSTRUCTOR
    public Computadora(String marca, String modelo, CPU procesador, Memoria mem, UnidadDeAlmacenamiento ua) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.mem = mem;
        this.ua = ua;
    }
    
    //SET & GET

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getProcesador() {
        return procesador;
    }

    public void setProcesador(CPU procesador) {
        this.procesador = procesador;
    }

    public Memoria getMem() {
        return mem;
    }

    public void setMem(Memoria mem) {
        this.mem = mem;
    }

    public UnidadDeAlmacenamiento getUa() {
        return ua;
    }

    public void setUa(UnidadDeAlmacenamiento ua) {
        this.ua = ua;
    }

    //toString
    @Override
    public String toString() {
        return "Computadora{" + "Marca= " + marca + "\nModelo= " + modelo + "\nProcesador= " + procesador + "\nMemoria: " + mem + "\nAlmacenamiento: " + ua + '}';
    }
    
}
