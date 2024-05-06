public class EstadisticasPorIdioma {
    private String idioma;
    private Long conteo;

    public EstadisticasPorIdioma(String idioma, Long conteo) {
        this.idioma = idioma;
        this.conteo = conteo;
    }

    public String getIdioma() {
        return idioma;
    }

    public Long getConteo() {
        return conteo;
    }
}
