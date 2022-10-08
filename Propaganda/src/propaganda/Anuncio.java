
package propaganda;

/* @author SAMSUNG */
public class Anuncio {
    protected long id;
    protected String palavras;
    protected String dataPublicacao;
    protected double valor;
    protected String titulo;
    protected String dataInsercao;
    protected int publicar;
    protected String nomeContato;
    protected String telefone;
    protected String observacao;

    public String getPalavras() {
        return palavras;
    }
    public void setPalavras(String palavras) {
        this.palavras = palavras;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInsercao() {
        return dataInsercao;
    }
    public void setDataInsercao(String dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public int getPublicar() {
        return publicar;
    }
    public void setPublicar(int publicar) {
        this.publicar = publicar;
    }

    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    void anunciar(){
        System.out.println("ANUNCIO");
        System.out.println("Data publicação: " + dataPublicacao);
        System.out.println("Data inserção: " + dataInsercao);
        System.out.println(titulo);
        System.out.println(palavras);
        System.out.println(observacao);
    }
    
}
