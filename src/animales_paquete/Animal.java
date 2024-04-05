/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un Animal con atributo nombre, lugarOrigen, color
 * Hereda metodos y atributos de la clase Object
 * @author poo01alu08
 */
public class Animal extends Object{
    private String nombre;
    private String lugarOrigen;
    private String color;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Animal() {
    }
    /**
     * Constructor lleno
     * @param nombre nombre del Animal
     * @param lugarOrigen lugar originario del Animal
     * @param color color del Animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Regresa el nombre del Animal
     * @return la variable nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el color del Animal
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Regresa el lugar de Origen del Animal
     * @return la variable lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Establece el color del Animal
     * @param lugarOrigen
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Regresa el color del Animal
     * @return la variable color
     */
    public String getColor() {
        return color;
    }
    /**
     * Establece el color del Animal
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodos que realiza el Animal
     * @param sonido
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
    
    public void comer(){
        System.out.println("ñam ñam ñam");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
     
}
