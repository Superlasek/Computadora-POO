
package computadora;

/**
 *
 * @author Lasek | Alexis Carlos Stephano Bravo Castañeda
 */

public class CPU {
    //ATRIBUTOS
    private int nucleos;
    private double velocidad;
    
    //CONSTRUCTOR
    public CPU(int nucleos, double velocidad){
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    //SET & GET
    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "CPU{" + "nucleos= " + nucleos + ", velocidad= " + velocidad + '}';
    }
    
}
