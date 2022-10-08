package propaganda;

/* @author SAMSUNG */
public class Anunciante extends Usuario{
    protected long idAnunciante;

    public long getIdAnunciante() {
        return idAnunciante;
    }
    public void setIdAnunciante(long idAnunciante) {
        this.idAnunciante = idAnunciante;
    }

    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    void imprimeAnunciante(){
        System.out.println("ANUNCIANTE");
        System.out.println("ID Usuário: " + idUsuario + " | ID Anunciante: " + idAnunciante);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
    }
    
    
}
