package hotelaria;

/* @author 836846 */
public class Funcionario {
    private int codigo;
    private double salario;
    private String nome;
    private String cargo;
    private String cpf;
    private String telefone;

    public Funcionario(int codigo, double salario, String nome, String cargo, String cpf, String telefone) {
        this.codigo = codigo;
        this.salario = salario;
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    void imprimeFuncionario(){
        System.out.printf("FUNCIONÁRIO\n");
        System.out.printf("Nome: " + nome + "\n");
        System.out.printf("Código: " + codigo + "\n");
        System.out.printf("Salário: R$" + salario + "\n");
        System.out.printf("Cargo: " + cargo + "\n");
        System.out.printf("CPF: " + cpf + "\n");
        System.out.printf("Telefone: " + telefone + "\n");
    }
    
}
