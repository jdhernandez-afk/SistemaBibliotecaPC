/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author HP
 */
public class Libro {
  private String isbn;
  private String titulo;
  private String autor;
  private String genero;
  private int anioPublicacion;
  private boolean disponible;
  

  
  public Libro(String isbn, String titulo, String autor, String genero, int anioPublicacion, boolean disponible){
      this.isbn = isbn;
      this.titulo = titulo;
      this.genero = genero;
      this.anioPublicacion = anioPublicacion;
      this.disponible = disponible;
  }
  
  public Libro(){
  }
      
}
  

