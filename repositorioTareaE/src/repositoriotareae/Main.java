
package repositoriotareae;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");

        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
        Empleado.imprimir_emp(empleado1);
        empleado1.calcula_sueldo(1000);
        System.out.println(empleado1.calcula_sueldo(1000));
    }

    
}
