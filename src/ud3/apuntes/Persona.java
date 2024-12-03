package ud3.apuntes;

public class Persona {
    // Datos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public static int contadorPersonas;

    // Métodos
    public void inicializar(String n, String a1, String a2, int e) {
        nombre = n;
        apellido1 = a1;
        apellido2 = a2;
        edad = e;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void incrementarContador() {
        contadorPersonas++;
    }

    public int getEdad() {
        return edad;
    }

    public  void cumplirAnhos() {
        edad++;
    }
}