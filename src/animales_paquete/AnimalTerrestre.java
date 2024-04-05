/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un AnimalTerrestre con atributo numeroDePatas
 * Hereda metodos y atributos de la clase Animal
 * @author poo01alu08
 */
public class AnimalTerrestre extends Animal{
    private int numeroDePatas;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public AnimalTerrestre() {
    }
    /**
     * Constructor lleno
     * @param numeroDePatas numerod de patas del AnimalTerrestre
     */
    public AnimalTerrestre(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    /**
     * Constructor lleno con herencia de Animal para la construccion del AnimalTerrestre
     * @param numeroDePatas numero de patas del AnimalTerrestre
     * @param nombre nombre del AnimalTerrestre
     * @param lugarOrigen lugar originario del AnimalTerrestre
     * @param color color del AnimalTerrestre
     */
    public AnimalTerrestre(int numeroDePatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroDePatas = numeroDePatas;
    }
    /**
     * Regresa el numero de patas del AnimalTerrestre
     * @return la variable numeroDePatas
     */
    public int getNumeroDePatas() {
        return numeroDePatas;
    }
    /**
     * Establece el numero de patas del AnimalTerrestre
     * @param numeroDePatas
     */
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    /**
     * Metodos que realiza el AnimalTerrestre
     */
    public void correr(){
        System.out.println("run run run....");
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
        return "AnimalTerrestre{" + "numeroDePatas=" + numeroDePatas + '}';
    }
    
    
    
}
