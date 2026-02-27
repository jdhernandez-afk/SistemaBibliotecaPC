package persistencia;
import java.util.ArrayList;
import modelos.Libro;

public class LibroRepository {
    private ArrayList<Libro> libros;

    public LibroRepository() {
        this.libros = new ArrayList<>();
    }

    public void crearLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro l : libros) {
                System.out.println(l);
            }
        }
    }

    public Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        System.out.println("Libro no encontrado.");
        return null;
    }

    public void modificarLibro(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(libro.getIsbn())) {
                libros.set(i, libro);
                System.out.println("Libro modificado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }


 public void eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }
}