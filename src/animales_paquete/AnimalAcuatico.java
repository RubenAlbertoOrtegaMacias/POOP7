/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un AnimalAcuatico con atributo numeroAletas
 * Hereda metodos y atributos de la clase Animal
 * @author poo01alu08
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public AnimalAcuatico() {
    }
    /**
     * Constructor lleno
     * @param numeroAletas numero de aletas del AnimalAcuatico
     */
    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Constructor lleno con herencia de Animal para la construccion del AnimalAcuatico
     * @param numeroAletas numero de aletas de la AnimalAcuatico
     * @param nombre nombre del AnimalAcuatico
     * @param lugarOrigen lugar originario del AnimalAcuatico
     * @param color color del AnimalAcuatico
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     * Regresa el numero de aletas del AnimalAcuatico
     * @return la variable numeroAletas
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Establece el numero de aletas del AnimalAcuatico
     * @param numeroAletas
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodos que realiza el AnimalAcuatico
     * @param sonido
     */
    public void nadar(String sonido){
        System.out.println("nadaremos nadaremos en el mar el mar");
    }
    /**
     * Es una sobreescritura del metodo comer
     */
    @Override
    public void comer(){
        System.out.println("ñam ñam ñam delicius");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
    
}
