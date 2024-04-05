/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un Ballena con atributo largo
 * Hereda metodos y atributos de la clase AnimalAcuatico
 * @author poo01alu08
 */
public class Ballena extends AnimalAcuatico{
    private int largo;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Ballena() {
    }
    /**
     * Constructor lleno
     * @param largo largo de la ballena
     */
    public Ballena(int largo) {
        this.largo = largo;
    }
    
    /**
     * Constructor lleno con herencia de AnimalTerrestre para la construccion del perro
     * @param largo largo de la ballena
     * @param numeroAletas numero de aletas de la ballena
     * @param nombre nombre del ballena
     * @param lugarOrigen lugar originario del ballena
     * @param color color del ballena
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * Regresa el largo de la Ballena
     * @return la variable largo
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Establece el largo de la Ballena
     * @param largo
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Metodo que realiza el Ballena
     */
    public void pelearConPinocho(){
        System.out.println("Fight.. tutututuut");
    }
    /**
     * Metodo comer que se sobreescribio en ballena, esto porque las ballenas comen planckton y esto es un componente fundamental de su dieta
     */
    @Override
    public void comer() {
        System.out.println("Comiendo plancton"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Ballena{" + "largo=" + largo + '}';
    }
    
}
