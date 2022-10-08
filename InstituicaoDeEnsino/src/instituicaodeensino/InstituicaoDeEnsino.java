
package instituicaodeensino;
import java.util.ArrayList;

/* @author SAMSUNG */
public class InstituicaoDeEnsino {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList<>();
        double valorTotal = 0;
        
        /*Instancia dos Objetos*/
        Aluno A; Turma T; Curso C;
        Disciplina D; Professor P;
        Endereco E; Bairro B;
        Cidade Ci; UF UF;
        Pagamento Pa; Fatura F;
        
        /*TURMA*/
        T = new Turma("19:00", 2022, "VII Turma");
        T.imprimeTurma();
        System.out.println("");
        
        /*CURSOs*/
        C = new Curso();
        C.setNome("Engenharia de Software");
        C.imprimeCurso();
        C.setNome("Engenharia de Computação");
        C.imprimeCurso();
        System.out.println("");
        
        /*DISCIPLINAs*/
        D = new Disciplina();
        D.incluirDisciplina(true, "Estrutura de Dados I", 75);
        D.incluirDisciplina(true, "Estrutura de Dados II", 75);
        D.incluirDisciplina(true, "Programação Orientada à Objetos", 75);
        D.incluirDisciplina(false, "Fim", 0);
        D.imprimeDisciplina();
        System.out.println("");
        
        /*ALUNOs*/
        A = new Aluno();
        A.incluirAluno(true, 836846);
        A.incluirAluno(true, 836847);
        A.incluirAluno(true, 836848);
        A.incluirAluno(true, 836849);
        A.incluirAluno(true, 836850);
        A.imprimeAluno();
        System.out.println("");
        
        /*PROFESSOR*/
        P = new Professor("Eduardo", 39811111, 991111111, "Masculino", "Homem", "Parda", "01/01/2021", 5025.65,
        "01/01/2021", "Engenharia de Software");
        P.setDataInicio("01/01/2021");
        P.setFormacao("Engenharia de Software");
        P.imprimeProfessor();
        System.out.println("");
        
        /*ENDEREÇO*/
        B = new Bairro();
        B.setNome("Jardim das Oliverias");

        E = new Endereco("São Paulo", "Instituição de Ensino", 14860000, B.getNome());
        E.imprimeEndereco();
        
        UF = new UF();
        UF.setPais("Brasil");
        UF.setNome("SP");
        UF.imprimeUF();
        
        Ci = new Cidade();
        Ci.setNome("São Paulo");
        Ci.imprimeCidade();
        System.out.println("");
        
        /*PAGAMENTOs*/
        Pa = new Pagamento(52.00, "21/01/2022");
        Pa.setInclui(true);
        if(Pa.inclui == true){
            valorTotal = valorTotal + Pa.getValor();
            list.add(Pa.getValor()); list.add(Pa.getData());
        }
        
        Pa = new Pagamento(35.00, "01/04/2022");
        Pa.setInclui(true);
        if(Pa.inclui == true){
            valorTotal = valorTotal + Pa.getValor();
            list.add(Pa.getValor()); list.add(Pa.getData());
        }
        
        F = new Fatura("123", valorTotal, "01/08/2022", false, "Boleto");
        F.imprimeFatura();
        System.out.println(list);

    }
        
}
