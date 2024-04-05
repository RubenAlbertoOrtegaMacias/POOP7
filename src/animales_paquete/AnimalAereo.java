/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un AnimalAereo con atributo numeroAlas
 * Hereda metodos y atributos de la clase Animal
 * @author poo01alu08
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public AnimalAereo() {
    }
    /**
     * Constructor lleno
     * @param numeroAlas numero de alas del AnimalAereo
     */
    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Constructor lleno con herencia de Animal para la construccion del AnimalAereo
     * @param numeroAlas numero de alas de la AnimalAereo
     * @param nombre nombre del AnimalAereo
     * @param lugarOrigen lugar originario del AnimalAereo
     * @param color color del AnimalAereo
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Regresa el numero de alas del AnimalAereo
     * @return la variable numeroAlas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Establece el numero de alas del AnimalAereo
     * @param numeroAlas
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodos que realiza el AnimalAereo
     */
    public void volar(){
        System.out.println("hay que lindo es volarr a las 3 de la mañana");
    }
    /**
     * Es una sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("Comiendo endo");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
     
}
