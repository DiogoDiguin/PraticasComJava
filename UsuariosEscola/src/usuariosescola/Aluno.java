
package usuariosescola;

/* @author SAMSUNG */
public class Aluno extends Usuario{
    double prova1, prova2, prova3;
    int faltas;
    String status;
    
    Aluno(String nome, int codigo, String Dpto, String Curso){
        this.nome = nome;
        this.codigo = codigo;
        this.Dpto = Dpto;
        this.Curso = Curso;
    }
    
    public void setProvas(double prova1, double prova2, double prova3){
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    
    void imprimeAluno(){
        double media = (prova1 + prova2 + prova3) / 3;
        System.out.printf("ALUNO\n");
        System.out.printf("Nome: " + nome + "\n");
        System.out.printf("Código: " + codigo + "\n");
        System.out.printf("Departamento: " + Dpto + "\n");
        System.out.printf("Curso: " + Curso + "\n");
        System.out.printf("Prova 01: " + prova1 + " | Prova 02: " + prova2 + 
                " | Prova 03: " + prova3 + "\n" + "Media: " + media );
        System.out.printf("\n" + "Faltas: " + faltas + "\n");
        if(media > 7 && faltas < 10){
            this.status = "Apr";
            System.out.printf("Status: " + status + "\n");
        }else{
           this.status = "Rep";
           System.out.printf("Status: " + status + "\n");
        }
    }
    
}
