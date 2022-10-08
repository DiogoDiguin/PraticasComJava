
package propaganda;

/* @author SAMSUNG */
public class Cliente extends Usuario{
    protected long cod_assinante;
    protected long qtd_assinantes = 0;
    protected long idCliente;
    protected String email;

    public Cliente(String email) {
        //this.cod_assinante = cod_assinante;
        this.email = email;
    }

    public long getCod_assinante() {
        return cod_assinante;
    }
    public void setCod_assinante(long cod_assinante) {
        this.cod_assinante = cod_assinante;
    }

    public long getQtd_assinantes() {
        return qtd_assinantes;
    }
    public void setQtd_assinantes(long qtd_assinantes) {
        this.qtd_assinantes = qtd_assinantes;
    }

    public long getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

/*Usuário*/
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
     
    void imprimeCliente(){
        System.out.println("\nCLIENTE");
        System.out.println("ID Usuário: " + idUsuario + " | ID Cliente: " + idCliente);
        System.out.println("Código assinante: " + cod_assinante);
        System.out.println("E-mail: " + email);
        System.out.printf("\n");
        
        
    }
    
    
    
    
}
