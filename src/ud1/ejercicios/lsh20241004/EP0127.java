package ud1.ejercicios.lsh20241004;

public class EP0127 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int a = 5, b = 7;
            
        System.out.println("Antes: a = " + a + ", b = " + b);
    
        // Proceso
        int temp; // variable temporal auxiliar
            
        temp = a;
        a = b;
        b = temp;
            
        // Salida
        System.out.println("Después: a = " + a + ", b = " + b);
    }
    
}
        
