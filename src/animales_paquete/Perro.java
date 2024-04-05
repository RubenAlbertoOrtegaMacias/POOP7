/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un Perro con atributo colorCollar
 * Hereda metodos y atributos de la clase AnimalTerrestre
 * @author poo01alu08
 */
public class Perro extends AnimalTerrestre{
    private String colorCollar;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Perro() {
    }
    /**
     * Constructor lleno
     * @param colorCollar Color del Collar
     */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Constructor lleno con herencia de AnimalTerrestre para la construccion del perro
     * @param colorCollar Color del Collar
     * @param numeroDePatas numero de patas del perro
     * @param nombre nombre del perro
     * @param lugarOrigen lugar originario del perro
     * @param color color del perro
     */
    public Perro(String colorCollar, int numeroDePatas, String nombre, String lugarOrigen, String color) {
        super(numeroDePatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    
    /**
     * Regresa el tipo de pico
     * @return la variable tipoPico
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Establece el color del collar
     * @param colorCollar
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo que realiza el pajaro
     */
    public void hacerTrucos(){
        System.out.println("Perro truco");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
    
}
