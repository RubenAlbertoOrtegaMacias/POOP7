/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 * Importamos las clases que utilizaremos para el proyecto del paquete 
 * animales_paquete
 */
import animales_paquete.Animal;
import animales_paquete.AnimalAcuatico;
import animales_paquete.Ballena;
import animales_paquete.Pajaro;
import animales_paquete.Perro;

/**
 * Programa que inicializa un animal dependiendo de lo que requiera de forma mas 
 * especifica como Perro, Ballena, Pajaro o mas general como AnimalAcuatico, AnimalTerrestre,
 * AnimalAereo o aun mas general Animal
 * @author RUBENO
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializacion de un Objeto de Tipo Animal
        Animal animal = new Animal("leopardo","Alaska","moteado");
        animal.sonido("eeeeeee 321 leopardos raw");
        System.out.println(animal);
        String a = new String("Hola Mundo");
        System.out.println(a);
        String b = "Hola Mundo";
        System.out.println(b);
        // Inicializacion de un Objeto de Tipo Animal Acuatico
        AnimalAcuatico animal1 = new AnimalAcuatico(4);
        System.out.println(animal1);
        animal1.setNombre("walle");
        animal.setLugarOrigen("Obregon");
        animal1.setColor("azul");
        System.out.println(animal1);
        AnimalAcuatico animal2 = new AnimalAcuatico(4,"keiko","Antartida","azul");
        System.out.println(animal2);
        animal2.sonido("oaaaoaoaoaooa");
        // Inicializacion de un Objeto de Tipo Ballena y utilizacion de metodo comer
        Ballena ballena = new Ballena(25,4,"Wall-e","Amazonas","gris");
        System.out.println(ballena);
        ballena.comer();
        // Inicializacion de un Objeto de Tipo Perro y utilizacion de metodo hacerTrucos
        Perro perro = new Perro("azul");
        System.out.println(perro);
        Perro perro1 =new Perro("negro",4,"tututu Max Verstappen","Holandes","wero");
        System.out.println(perro1);
        perro.hacerTrucos();
        // Inicializacion de un Objeto de Tipo Pajaro y utilizacion de metodo comer
        Pajaro pajaro = new Pajaro("Robusto y curvo");
        System.out.println(pajaro);
        Pajaro pajaro1 = new Pajaro("Robusto y curvo",2,"Scavenger","Africa","marron con collar blanco");
        System.out.println(pajaro1);
        pajaro.comer();
    }
    
}