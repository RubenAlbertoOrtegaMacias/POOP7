/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 * Es la clase que crea un Pajaro con atributo de tipo de Pico 
 * Hereda metodos y atributos de la clase AnimalAereo
 * @author poo01alu08
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Pajaro() {
    }
    /**
     * Constructor lleno
     * @param tipoPico el tipo de pico del pajaro
     */
    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Constructor lleno con herencia de AnimalAereo para la construccion del pajaro
     * @param tipoPico el tipo de pico del pajaro
     * @param numeroAlas numero de alas del pajaro
     * @param nombre nombre del pajaro
     * @param lugarOrigen lugar originario del pajaro
     * @param color color del pajaro
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    
    
    /**
     * Regresa el tipo de pico
     * @return la variable tipoPico
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Establece el TipoPico
     * @param tipoPico
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo que realiza el pajaro
     */
    public void recolectarRamas(){
        System.out.println("Recolectando ramas");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}

