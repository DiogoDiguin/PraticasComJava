
package instituicaodeensino;

/* @author SAMSUNG */
public class Turma {
    protected String horario;
    protected int ano;
    protected String nome;

    public Turma(String horario, int ano, String nome) {
        this.horario = horario;
        this.ano = ano;
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    void imprimeTurma(){
        System.out.println("TURMA");
        System.out.println("NOME: " + nome);
        System.out.println("ANO: " + ano);
        System.out.println("HORÁRIO: " + horario);
    }
        
}
