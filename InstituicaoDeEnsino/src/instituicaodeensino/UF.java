
package instituicaodeensino;

/* @author SAMSUNG */
public class UF {
    protected String nome;
    protected String pais;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }  
        
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    void imprimeUF(){
        System.out.println("UF: " + nome + " | Pais: " + pais);
    }
}
