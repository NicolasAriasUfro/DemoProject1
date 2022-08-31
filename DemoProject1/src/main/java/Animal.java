public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    public Animal(){

    }

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = 0;
    }

    public void cumpleaños(){
        edad++;
    }

    public void cumpleaños(int n){
        edad*=n;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
