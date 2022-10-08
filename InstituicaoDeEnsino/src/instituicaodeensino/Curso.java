
package instituicaodeensino;

/* @author SAMSUNG */
public class Curso {
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    void imprimeCurso(){
        System.out.println("CURSO: " + nome);
    }
        
}
