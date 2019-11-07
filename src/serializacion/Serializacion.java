/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author dmorenoar
 */
public class Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
       
        
        try{
            File pokedex = new File("pokedex");
            
            //Creamos los pokemons
            Pokemon p = new Pokemon("Pikachu", 10, new Entrenador("Ash"));
            
            //Escribimos en el archivo
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pokedex));
            
            oos.writeObject(p);
            
            oos.close();
            
            //Leemos del archivo
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pokedex));
            Pokemon aux = (Pokemon) ois.readObject();
            
            System.out.println("Nombre del pokemon:" + aux.getNombre());
            
            System.out.println("Nombre entrenador:" + aux.getEntrenador().getNombre());
            
            /*Creamos un arraylist que guardaremos en un fichero*/
            ArrayList<Pokemon> listaPokemons = new ArrayList();
            
            Agua blastoise = new Agua("Blastoise", 16, new Entrenador("Misty"));
            Agua squirtle = new Agua("Squirtle", 33, new Entrenador("Misty"));
            
            Planta bulbasaur = new Planta("Bulbasaur", 46, new Entrenador("Ash"));
            
            Planta odish = new Planta("Odish", 15, new Entrenador("Desconocido"));
            
            listaPokemons.add(blastoise);
            listaPokemons.add(squirtle);
            listaPokemons.add(bulbasaur);
            listaPokemons.add(odish);

            File pokedex2 = new File("pokedex2");
            
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(pokedex2));
            
            oos2.writeObject(listaPokemons);
            
            oos2.close();
            
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(pokedex2));
            
            for(Pokemon poke : (ArrayList<Pokemon>) ois2.readObject()){
                
                if(poke instanceof Agua){
                    System.out.println("Soy pokemon de agua");
                }else if(poke instanceof Planta){
                    Planta pla = (Planta) poke;
                    System.out.println("Soy pokemon planta");  
                    System.out.println("Tipo de piedra:" + ((Planta) poke).getTipoPiedra());
                    System.out.println("Tipo de piedra:" + pla.getTipoPiedra());
                }
                
                System.out.println("Nombre poke:" + poke.getNombre());
            }

        }catch(IOException e){
            System.out.println("Error obtenido:" + e.getMessage());
        }catch(ClassNotFoundException t){
            System.out.println("Error con la clase:" + t.getMessage());
        }finally{
            
        }
            
        
        
        
    } 
    
}
