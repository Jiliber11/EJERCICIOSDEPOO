
package Ejercicio3;


public class Empleado {
    protected String nombre;
    protected String dni;
    protected int edad;
    protected boolean casado;
    protected double salario;

    // Constructores
    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        setEdad(edad); // Validación de la edad en el setter
        this.casado = casado;
        this.salario = salario;
    }

    
    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.edad = 0;
        this.casado = false;
        this.salario = 0.0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método clasifica()
    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    // Método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "DNI: " + dni + "\n" +
               "Edad: " + edad + "\n" +
               "Estado Civil: " + (casado ? "Casado" : "Soltero") + "\n" +
               "Salario: $" + salario + "\n" +
               "Clasificación: " + clasifica();
    }

    // Método subirSalario
    public void subirSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100.0;
    }
}


