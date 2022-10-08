package propaganda;

/* @author SAMSUNG */
public class SecaoDeInteresse {
    protected long id_Secao_Interesse;
    protected long AnuncioInteresse;
    protected String nome;
    
    void localizarInteresse(long AnuncioInteresse){
        this.AnuncioInteresse = AnuncioInteresse;
        System.out.println("Anuncio de Interesse: " + AnuncioInteresse);
    }

    public long getId_Secao_Interesse() {
        return id_Secao_Interesse;
    }
    public void setId_Secao_Interesse(long id_Secao_Interesse) {
        this.id_Secao_Interesse = id_Secao_Interesse;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
