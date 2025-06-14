package unifor.br.cinemafilme.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "FilmeCinema")
public class filmeModel {
    private String titulo;
    private String genero;
    private float duracao;
    private String diretor;
    private String classificacao;
    private boolean disponivel;
    private String posterUrl;
    @Id
    private String id; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    @Override
    public String toString() {
        return "FilmeModel{" +
                ", titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                ", disponivel=" + disponivel +
                ", posterUrl='" + posterUrl + '\'' +
                '}';
    }
}
