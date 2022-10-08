
package instituicaodeensino;
import java.util.ArrayList;

/* @author SAMSUNG */
public class Aluno {
    ArrayList list = new ArrayList<>();
    protected int matricula;

    void incluirAluno(boolean inclui, int matricula){
        if(inclui == true){
            list.add(matricula);
        }
    }

    void imprimeAluno(){
        System.out.println("ALUNOS MATRICULADOS");
        System.out.println(list);
    }
}
