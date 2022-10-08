
package consultoriomedico;

/*@author 836846*/

public class Situacoes {
        
    String nome = "SERGIO";
    String sobrenome = "LIMA";
    String especialidade = "ORTOPEDIA";
    int crm = 11111;
    char atividade = 'A'; 
    String data = "22/02/2022";
    
    String nome2 = "PAULO";
    String sobrenome2 = "SILVA";
    int codigo = 99999;
    char sexo = 'M';
    String endereco = "WALTER SOUSA Nº 557";
    int telefone = 123456789; 
    
    void mostraAtributosM(){
        System.out.println("\tMÉDICO");
        System.out.println("Nome: " + nome + ", Sobrenome: " + sobrenome);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Atividade: " + atividade);
    }
    
    void mostraAtributosP(){
        System.out.println("\tPACIENTE");
        System.out.println("Nome: " + nome2 + ", Sobrenome: " + sobrenome2);
        System.out.println("Sexo: " + sexo);
        System.out.println("Codigo: " + codigo);
        System.out.println("Endereco: " + endereco + ", Telefone: " + telefone);
    }
    
    void atendePaciente(){
        System.out.println("> Medico " + nome + " " + sobrenome + " realiza " + especialidade + 
                " em " + nome2 + " " + sobrenome2 + " em " + data); 
    }    
    
//PARA MÉDICO    
    void setMedico(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    void setCrm(int crm){
        this.crm = crm;
    }
//
    void marcar(String data){
        this.data = data;
    }
    void remarcar(String data){
        System.out.println("\tConsulta REMARCADA para " + data);
        this.data = data;
    }
    void cancelar(char atividade){
        System.out.println("> Medico " + nome + " " + sobrenome + " encontra-se INDISPONÍVEL no momento, pois esta"
                + " em uma emergência. ATIVIDADE: " + atividade);    
    }
    
//PARA PACIENTE
    void setPaciente(String nome2, String sobrenome2){
        this.nome2 = nome2;
        this.sobrenome2 = sobrenome2;
    }
    void setCodigo(int codigo){
        this.codigo = codigo;
    }
    void setSexo(char sexo){
        this.sexo = sexo;
    }
    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    void setTelefone(int telefone){
        this.telefone = telefone;
    }
//
}
