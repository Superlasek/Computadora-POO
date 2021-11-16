
package computadora;
import java.util.Scanner;

/**
 *
 * @author Lasek | Alexis Carlos Stephano Bravo Castañeda
 */
public class TestComputadora {
    private Scanner entrada = new Scanner(System.in);
    private CPU procesador;
    private Memoria mem;
    private UnidadDeAlmacenamiento ua;
    private Computadora pc;

//[1] CREAR
    private void crearComputadora(){
        if(pc == null){
            
            //CPU
            System.out.println("— PROCESADOR —");
            System.out.println("Ingresar los nucleos del procesador: ");
            int nucleos = entrada.nextInt();
            System.out.println("Ingresar la velocidad del procesador: ");
            double velocidad = entrada.nextDouble();
            procesador = new CPU(nucleos,velocidad);
            
            //Memoria
            System.out.println("— MEMORIA —");
            System.out.println("Ingresar el tipo de memoria: ");
            String tipo = entrada.next();
            System.out.println("Ingresar la capacidad de memoria: ");
            int capacidad = entrada.nextInt();
            mem = new Memoria(tipo, capacidad);
            
            //Almacenamiento
            System.out.println("— ALMACENAMIENTO —");
            System.out.println("Ingresar el tipo de almacenamiento: ");
            tipo = entrada.next();
            System.out.println("Ingresar la capacidad de la unidad de almacenamiento: ");
            capacidad = entrada.nextInt();
            ua = new UnidadDeAlmacenamiento(tipo, capacidad);
            
            //Computadora
            System.out.println("— MARCA —");
            System.out.println("Ingresar la marca: ");
            String marca = entrada.next();
            System.out.println("Ingresar el modelo: ");
            String modelo = entrada.next();
            pc = new Computadora(marca, modelo, procesador, mem, ua);
            System.out.println(pc);
            System.out.println("\n");
        }
        else{
            System.out.println("Necesita destruir la computadora existente para crear una nueva.");
        }
    }
    
//[2] MODIFICAR
    private void modificarDatos(){
        short opc;
        System.out.println("0 | Ninguno");
        System.out.println("1 | Marca");
        System.out.println("2 | Modelo");
        System.out.println("3 | Procesador");
        System.out.println("4 | Memoria");
        System.out.println("5 | Unidad de Almacenamiento");
        opc = entrada.nextShort();
        switch(opc){
            case 0:
                break;
            case 1:
                System.out.println("— MARCA —");
                System.out.println("Marca actual: "+pc.getMarca());
                System.out.println("Ingrese la nueva marca: ");
                pc.setMarca(entrada.next());
                break;
            case 2:
                System.out.println("— MODELO —");
                System.out.println("Modelo actual: "+pc.getModelo());
                System.out.println("Ingrese el nuevo modelo: ");
                pc.setModelo(entrada.next());
                break;
            case 3:
                System.out.println("— PROCESADOR —");
                System.out.println("Velocidad del Procesador actual: "+pc.getProcesador().getVelocidad());
                System.out.println("Ingresa la nueva velocidad: ");
                pc.getProcesador().setVelocidad(entrada.nextDouble());
                System.out.println("Nucleos del Procesador Actual: "+pc.getProcesador().getNucleos());
                System.out.println("Ingresa los nuevos nucleos: ");
                pc.getProcesador().setNucleos(entrada.nextInt());
                break;
            case 4:
                System.out.println("— MEMORIA —");
                System.out.println("Tipo de memoria actual: "+pc.getMem().getTipo());
                System.out.println("Ingresar nuevo tipo de memoria: ");
                pc.getMem().setTipo(entrada.next());
                System.out.println("Capacidad de memoria actual: "+pc.getMem().getCapacidad());
                System.out.println("Ingresar nueva capacidad de memoria: ");
                pc.getMem().setCapacidad(entrada.nextInt());
                break;
            case 5:
                System.out.println("— ALMACENAMIENTO —");
                System.out.println("Tipo de almacenamiento actual: "+pc.getUa().getTipo());
                System.out.println("Ingresar nuevo tipo de almacenamiento: ");
                pc.getUa().setTipo(entrada.next());
                System.out.println("Capacidad de almacenamiento actual: "+pc.getUa().getCapacidad());
                System.out.println("Ingresar nueva capacidad de almacenamiento: ");
                pc.getUa().setCapacidad(entrada.nextInt());
        }
    }
    
//[3] REEMPLAZAR
    private void reemplazarDatos(){
        short opc;
        System.out.println("0 | Ninguno");
        System.out.println("1 | Procesador");
        System.out.println("2 | Memoria");
        System.out.println("3 | Unidad de Almacenamiento");
        System.out.println("4 | Modelo");
        System.out.println("5 | Marca");
        System.out.println("\nSELECCIONAR OPCIÓN>> ");
        opc = entrada.nextShort();
        switch(opc){
            case 0:
                break;
            //PROCESADOR
            case 1:
                pc.setProcesador(null);//Limpia el dato introducido anteriormente para crear uno nuevo
                System.out.println("Ingresar los nucleos del procesador: ");
                int nucleos = entrada.nextInt();
                System.out.println("Ingresar la velocidad del procesador: ");
                double velocidad = entrada.nextDouble();
                procesador = new CPU(nucleos,velocidad);
                pc.setProcesador(procesador);
                break;
            //MEMORIA
            case 2:
                mem.setTipo(null);
                System.out.println("Ingresar el Tipo de Memoria: ");
                String tipo = entrada.next();
                System.out.println("Ingresar la Capacidad de Memoria: ");
                int capacidad = entrada.nextInt();
                mem = new Memoria(tipo, capacidad);
                pc.setMem(mem);
                break;
            //ALMACENAMIENTO
            case 3:
                ua.setTipo(null);
                System.out.println("— Reemplazar Unidad de Almacenamiento —");
                System.out.println("Ingresar el Tipo de Almacenamiento: ");
                tipo = entrada.next();
                System.out.println("Ingresar la Capacidad de Almacenamiento: ");
                capacidad = entrada.nextInt();
                ua = new UnidadDeAlmacenamiento(tipo, capacidad);
                pc.setUa(ua);
                break;
            //MARCA
            /*case 4:
                pc.
                break;*/
        }
    }
       
//[4] QUITAR COMPONENTES   
    private void quitarComponentes(){
        short opc;
        System.out.println("0 | Ninguno");
        System.out.println("1 | Procesador");
        System.out.println("2 | Memoria");
        System.out.println("3 | Unidad de Almacenamiento");
        System.out.println("\nSELECCIONAR OPCIÓN>> ");
        opc = entrada.nextShort();
        switch(opc){
            case 0:
                break;
            case 1:
                pc.setProcesador(null);
                break;
            case 2:
                pc.setMem(null);
                break;
            case 3:
                pc.setUa(null);
                break;
            default: 
                System.out.println("Ingresa únicamente el tipo de valor requerido.");
                modificarDatos();
                break;
        }
    }
    
//[5] DESTRUIR PC
    private void destruirPC(){
        short opc;
        if(pc == null){
        System.out.println("Necesita crear una computadora primero.");
        }else{
        System.out.println("Computadora Actual: " + pc);
        System.out.println("");
        System.out.println("¿Desea destruir la computadora actual? (1=SI / 2=NO)");
        System.out.print(">>");
        opc = entrada.nextShort();
        switch(opc){
            case 1:
                pc=null;
                System.out.println("Se destruyo la computadora exitosamente. ");
                break;
            case 2:
                System.out.println("No se destruyo la computadora. ");
                menu();
                break;
           }
        }
    }
        
    
//[6] CONFIG ACTUAL
    private void configActual(){
    if(pc == null){
            System.out.println("Necesita crear una computadora primero.");
        }else{
        System.out.println(pc);
        }
    }
    
    private void menu(){
        short opc;
        do{
            System.out.println("1 | Crear Computadora");
            System.out.println("2 | Modificar Datos de Computadora");
            System.out.println("3 | Reemplazar Componentes de Computadora");
            System.out.println("4 | Quitar Componentes");
            System.out.println("5 | Destruir Computadora");
            System.out.println("6 | CONFIGURACIÓN ACTUAL");
            System.out.println("\n0 | SALIR");
                System.out.print("\nSELECCIONAR OPCIÓN>> ");
                opc = entrada.nextShort();
                System.out.println("");
            switch (opc) {
                case 0:
                    break;
                case 1:
                    crearComputadora();
                    System.out.println("");
                    break;
                case 2:
                    modificarDatos();
                    System.out.println("");
                    break;
                case 3:
                    reemplazarDatos();
                    System.out.println("");
                    break;
                case 4:
                    quitarComponentes();
                    System.out.println("");
                    break;
                case 5:
                    destruirPC();
                    System.out.println("");
                    break;
                case 6:
                    configActual();
                    System.out.println("");
                }
        }while(opc!=0);
    }
    public static void main(String[] args) {
        System.out.println("=== CREACIÓN DE COMPUTADORA ===\n");
        TestComputadora tpc = new TestComputadora();
        tpc.menu();
        
    }
    
}
