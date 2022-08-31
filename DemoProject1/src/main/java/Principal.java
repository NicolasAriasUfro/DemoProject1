import java.util.Scanner;
//by Nicolas Arias

public class Principal {


    static Scanner leer= new Scanner(System.in);
    static int numero = 5;
    public static void main(String[] args) {
        Animal a = new Animal("Jose", "perro");
        System.out.println("a = " + a);
        Zoologico z = new Zoologico("Z", 7);
        for (int i = 0; i <z.getAnimales().length ; i++) {
            z.getAnimales()[i] = new Animal();
        }
        menu(z);
        System.out.println("Programa finalizado");
    }

    private static void menu(Zoologico zoo) {
        System.out.println("Menu");
        System.out.println("""
                seleccione una opcion:
                1) agregar animal
                2) eliminar animal
                3) modificar animal
                4) ver Zoologico
                5) finalizar programa
                """);
        int option = 0;



        try {
            option = leer.nextInt();
        } catch (Exception e){
            menu(zoo);
        }


        switch (option){
            case 1 -> {agregarAnimal(zoo);menu(zoo);}
            case 2 -> {eliminarAnimal(zoo);menu(zoo);}
            case 3 -> {modificarAnimal(zoo);menu(zoo);}
            case 4 -> {mostrarZoo(zoo);menu(zoo);}
            case 5 -> {}
            default -> menu(zoo);
        }
    }

    private static void mostrarZoo(Zoologico zoo) {
        zoo.mostrarZoo(zoo);
    }

    private static void modificarAnimal(Zoologico zoo) {
        zoo.modificarAnimal(zoo);
    }

    private static void eliminarAnimal(Zoologico zoo) {
        zoo.eliminarAnimal(zoo);
    }

    private static void agregarAnimal(Zoologico zoo) {
        zoo.agregarAnimal(zoo);
    }

}
