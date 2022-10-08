
package instituicaodeensino;
import java.util.ArrayList;

/*  @author SAMSUNG */
public class Disciplina {
    ArrayList list = new ArrayList<>();
    protected String nome;
    protected int cargaHoraria;
    
    void incluirDisciplina(boolean inclui, String nome, int cargaHoraria){
        list.add("\n");
        if(inclui == true){
            list.add(nome);
            list.add(cargaHoraria);
        }
    }
    
    void imprimeDisciplina(){
        System.out.println("DISCIPLINAS");
        System.out.println(list);
    }

}
