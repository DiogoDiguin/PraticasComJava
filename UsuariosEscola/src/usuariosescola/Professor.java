
package usuariosescola;

/* @author SAMSUNG */
public class Professor extends Usuario{
    int qtdAulas, qtdDisciplinas;
    String titulo, areaFormacao;
    
    Professor (String nome, int codigo, String Dpto, String Curso){
        this.nome = nome;
        this.codigo = codigo;
        this.Dpto = Dpto;
        this.Curso = Curso;
    }
    public void setQtds(int qtdAulas, int qtdDisciplinas){
        this.qtdAulas = qtdAulas;
        this.qtdDisciplinas = qtdDisciplinas;
    }
    public void setFormacao(String titulo, String areaFormacao){
        this.titulo = titulo;
        this.areaFormacao = areaFormacao;
    }
    
    void imprimeProfessor(){
        System.out.printf("PROFESSOR\n");
        System.out.printf("Nome: " + nome + "\n");
        System.out.printf("Código: " + codigo + "\n");
        System.out.printf("Departamento: " + Dpto + "\n");
        System.out.printf("Curso: " + Curso + "\n");
        System.out.printf("Aulas: " + qtdAulas + " | Disciplinas: " + qtdDisciplinas + "\n");
        System.out.printf("Titulo: " + titulo + "\n");
        System.out.printf("Área de Formação: " + areaFormacao + "\n");
    }
    
}
