import java.util.Scanner;

public class Zoologico {

    private String nombre;
    private Animal[] animales;

    public Zoologico(String nombre, int cantidad) {

        this.nombre = nombre;
        this.animales = new Animal[cantidad];
    }
    public void modificarAnimal(Zoologico zoo){


        int indice = introNumero("Ingrese el indice del animal que quiere modificar");

        String nombreAnimal = introDatos("Nombre  del animal: ");
        String especieAnimal = introDatos("Especie del animal: ");
        int edadAnimal = introNumero("Edad del animal: ");

        zoo.animales[indice].setNombre(nombreAnimal);
        zoo.animales[indice].setEspecie(especieAnimal);
        zoo.animales[indice].setEdad(edadAnimal);

    }

    public void agregarAnimal(Zoologico zoo){

        int indice = introNumero("Ingrese el indice del animal que quiere agregar");

        String nombreAnimal = introDatos("Nombre  del animal: ");
        String especieAnimal = introDatos("Especie del animal: ");
        int edadAnimal = introNumero("Edad del animal: ");

        zoo.getAnimales()[indice].setNombre(nombreAnimal);
        zoo.getAnimales()[indice].setEspecie(especieAnimal);
        zoo.getAnimales()[indice].setEdad(edadAnimal);

    }
    public String introDatos(String datoaPreguntar){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese :");
        System.out.print(datoaPreguntar);
        String dato = null;
        try {
            dato = leer.nextLine();
        }catch (Exception e){
            introDatos(datoaPreguntar);
        }

        return dato;
    }
    public int introNumero(String datoaPreguntar){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese :");
        System.out.print(datoaPreguntar);
        int numero = 0;
        try {
            numero = leer.nextInt();
        }catch (Exception e){
            introNumero(datoaPreguntar);
        }
        return numero;
    }


    public void eliminarAnimal(Zoologico zoo) {

        int indice = introNumero("Ingrese el indice del animal que quiere eliminar");
        zoo.animales[indice].setNombre(null);
        zoo.animales[indice].setEspecie(null);
        zoo.animales[indice].setEdad(0);
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void mostrarZoo(Zoologico zoo) {
        for (int i = 0; i < zoo.animales.length; i++) {
            System.out.println(zoo.animales[i].toString());
        }
    }

}