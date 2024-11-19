package ud2.ejerciciosfunciones;

public class E0405 {
    public static boolean esVocal(char letra) {
        return switch (Character.toLowerCase(letra)) {
            case 'a', 'e', 'i', 'o', 'u' ->  {yield true;}
            default -> {yield false;}
        };
    }

    public static void main(String[] args) {
        if (esVocal('A')) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
}
