
package Ejercicio8;

    
    public class Main {
    public static void main(String[] args) {
        // Crear un ProfesorEmerito con datos de ejemplo
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Juan Perez", 65, 30, 10);
        
        // Imprimir los detalles del profesor emérito y su salario base
        System.out.println("Nombre: " + profesorEmerito.getNombre());
        System.out.println("Edad: " + profesorEmerito.getEdad());
        System.out.println("Años Consolidados: " + profesorEmerito.getAñosConsolidados());
        System.out.println("Años como Emérito: " + profesorEmerito.getAñosEmerito());
        System.out.println("Salario Base: " + profesorEmerito.obtenerSalarioBase());
    }
}

//si por que estan en protected
//no se prodria acceder debido al private

//nv de acceso de prtcd y prvate