package ud3.apuntes;

public class EjemploPoo {
    public static void main(String[] args) {
        // se crea un objeto de tipo Persona
        Persona p;
        p = new Persona();

        // se utilizan los métodos definidos en la clase Persona
        p.inicializar("Arsenio", "Leante", "Gomez", 30);
        String nombre2 = p.nombreCompleto();
        if (p.esMayorEdad()) {
            System.out.println(nombre2 + " es mayor de edad");
        } else {
            System.out.println(nombre2 + " no es mayor de edad");
        }

        Persona p3 = new Persona();
        p3.inicializar("Maria", "Pérez", "Lastro", 17);
        String nombre3 = p3.nombreCompleto();
        if (p3.esMayorEdad()) {
            System.out.println(nombre3 + " es mayor de edad");
        } else {
            System.out.println(nombre3 + " es menor de edad");
        }

        Persona cumpleanhero = p;
        cumpleanhero.cumplirAnhos();
        System.out.println(cumpleanhero.nombreCompleto() + " tiene " + cumpleanhero.getEdad() + " años.");

        cumpleanhero = null;
        p = null;

        // MIEMBROS ESTÁTICOS
        System.out.println(Persona.contadorPersonas);
        Persona.incrementarContador();
        System.out.println(Persona.contadorPersonas);
    }
}