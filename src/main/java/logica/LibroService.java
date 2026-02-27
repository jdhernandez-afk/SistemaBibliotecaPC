package logica;
import java.util.ArrayList;
import modelos.Libro;
import persistencia.LibroRepository;

public class LibroService {
    private LibroRepository repository;

    public LibroService() {
        this.repository = new LibroRepository();
    }

    public void crearLibro(String isbn, String titulo, String autor, String genero, int anioPublicacion, boolean disponible) {
        Libro libro = new Libro(isbn, titulo, autor, genero, anioPublicacion, disponible);
        repository.crearLibro(libro);
    }

    public void listarLibros() {
        repository.listarLibros();
    }

    public Libro buscarLibro(String isbn) {
        return repository.buscarLibro(isbn);
    }

    public void modificarLibro(String isbn, String nuevoTitulo, String nuevoAutor,
                                String nuevoGenero, int nuevoAnio, boolean disponible) {
        Libro libro = repository.buscarLibro(isbn);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            libro.setGenero(nuevoGenero);
            libro.setAnioPublicacion(nuevoAnio);
            libro.setDisponible(disponible);
            repository.modificarLibro(libro);
        } else {
            System.out.println("No se puede modificar, libro no encontrado.");
        }
    }
}