package unifor.br.cinemafilme.dto;

public class filmeRequestDTO {
    @NotBlank(message = "Título é obrigatório")
    @Size(min = 1, max = 100, message = "Título deve ter entre 1 e 100 caracteres")
    private String titulo;

    @NotBlank(message = "Diretor é obrigatório")
    private String diretor;

    @Min( value = 1, message = "Duração deve ser maior que 1")
    private int duracao;

    @NotBlank(message = "Gênero é obrigatório")
    private String genero;

    @NotBlank(message = "Classificação é obrigatória")
    private String classificacao;

    private boolean disponivel = true;

    private String posterUrl;

    public String getPosterUrl(){
        return posterUrl;
    }

    public void setPosterUrl(String url){
        this.posterUrl = url;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    
}
