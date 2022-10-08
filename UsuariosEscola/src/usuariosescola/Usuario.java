package usuariosescola;

/* @author 836846 */
public class Usuario {
    protected String nome;
    protected int codigo;
    protected String Dpto;
    protected String Curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDpto() {
        return Dpto;
    }

    public void setDpto(String Dpto) {
        this.Dpto = Dpto;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
}
