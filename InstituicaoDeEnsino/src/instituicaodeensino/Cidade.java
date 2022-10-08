
package instituicaodeensino;

/* @author SAMSUNG */
public class Cidade {
    protected String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    void imprimeCidade(){
        System.out.println("CIDADE: " + nome);
    }
}
