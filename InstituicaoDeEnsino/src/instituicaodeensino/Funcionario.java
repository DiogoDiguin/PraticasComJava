
package instituicaodeensino;

/* @author SAMSUNG */
public class Funcionario extends PessoaFisica{
    protected String dataAdmissao;
    protected double salario;

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
