package usuariosescola;

/*@author 836846 */
public class UsuariosEscola {

    public static void main(String[] args) {
        // TODO code application logic here
        Aluno A;
        A = new Aluno("Diogo", 836846, "Exatas", "Engenharia de Software");
        A.setProvas(8.5, 8.7, 8.6);
        A.setFaltas(2);
        A.imprimeAluno();
        System.out.printf("\n");
        A = new Aluno("Lucas", 457861, "Exatas", "Engenharia de Produção");
        A.setProvas(7.5, 7.1, 8.0);
        A.setFaltas(5);
        A.imprimeAluno();
        System.out.printf("\n");
        A = new Aluno("Gabriel", 256471, "Humanas", "Filosofia");
        A.setProvas(5.0, 6.4, 6.6);
        A.setFaltas(8);
        A.imprimeAluno();
        System.out.printf("\n");
        
        Professor P;
        P = new Professor("Matheus", 111111, "Exatas", "Engenharia de Software");
        P.setQtds(50, 4);
        P.setFormacao("Doutorado", "Engenharia");
        P.imprimeProfessor();
        System.out.printf("\n");
        P = new Professor("Lúcia", 222222, "Humanas", "Sociologia");
        P.setQtds(75, 7);
        P.setFormacao("Pós - Doutorado", "Sociologia");
        P.imprimeProfessor();
        System.out.printf("\n");
        P = new Professor("Paula", 333333, "Humanas", "Psicologia");
        P.setQtds(45, 5);
        P.setFormacao("Mestrado", "Psicologia");
        P.imprimeProfessor();
    }
    
}
