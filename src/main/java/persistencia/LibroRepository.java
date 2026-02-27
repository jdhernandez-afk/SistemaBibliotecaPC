/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.Libro;
/**
 *
 * @author HP
 */
public class LibroRepository {
     private final LibroRepository repository;
     
     public LibroRepository(){
         this.repository = new LibroRepository();
     }
     
     public void crearLibro(Libro libro){
         repository.crearLibro(libro);
     }
     

    
    
}           

