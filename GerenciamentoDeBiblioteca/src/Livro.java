public class Livro {
    public int id;
    public String titulo;
    protected String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = id;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [" + id + "]: Título:" + titulo + ", Autor:" + autor + ", Ano de Publicação:" + anoPublicacao
                + "\n";
    }
}
