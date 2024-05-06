import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private AutorRepository autorRepository;

    public void insertarLibro(Libro libro, String nombreAutor) {
        Autor autor = autorRepository.findByNombre(nombreAutor);
        if (autor == null) {
            autor = new Autor();
            autor.setNombre(nombreAutor);
            autorRepository.save(autor);
        }

        libro.setAutor(autor);
        libroRepository.save(libro);
    }
}
