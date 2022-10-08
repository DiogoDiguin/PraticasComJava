package propaganda;

/* @author SAMSUNG */
public class Usuario {
    protected long idUsuario;
    protected String login;
    protected String senha;
    
    void login (String login, String senha){
        System.out.println("\tLOGIN");
        if(login == "12345d" && senha == "d12345"){
            System.out.println("Login executado com sucesso!");
        }else{
            System.out.println("Login não encontrado, tente novamente");
        }
    }
    
}
