import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EstadisticasService {

    @Autowired
    private LibroRepository libroRepository;

    public void mostrarEstadisticasPorIdioma() {
        Map<String, Long> estadisticasPorIdioma = libroRepository.countBooksByLanguage()
                .stream()
                .collect(Collectors.toMap(EstadisticasPorIdioma::getIdioma, EstadisticasPorIdioma::getConteo));

        System.out.println("Estadísticas de libros por idioma:");
        estadisticasPorIdioma.forEach((idioma, cantidad) -> System.out.println(idioma + ": " + cantidad));
    }
}
