
package instituicaodeensino;

/* @author SAMSUNG */
public class Professor extends Funcionario{
    protected String dataInicio;
    protected String formacao;

    public Professor(String nome, int telefone, int celular, String sexo, String genero,
            String raca, String dataAdmissao, double salario, String dataInicio, String formacao){
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.sexo = sexo;
        this.genero = genero;
        this.raca = raca;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
        
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    void imprimeProfessor(){
        System.out.println("PROFESSOR");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone + " | Celular: " + celular);
        System.out.println("Sexo: " + sexo + " | Gênero: " + genero);
        System.out.println("Raça: " + raca);
        System.out.println("Data Admissão: " + dataAdmissao);
        System.out.println("Salario: R$" + salario);
        
        System.out.println("Data Início: " + dataInicio);
        System.out.println("Formação: " + formacao);
        
    }
    
    
}
