
package instituicaodeensino;

/* @author SAMSUNG */
public class Endereco {
    protected String logradouro;
    protected String complemento;
    protected int CEP;
    protected String bairro;

    public Endereco(String logradouro, String complemento, int CEP, String Bairro) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = Bairro;
    }


    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCEP() {
        return CEP;
    }
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
    
    void imprimeEndereco(){
        System.out.println("ENDEREÇO");
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Complemento: " + complemento);
        System.out.println("CEP: " + CEP);
        System.out.println("Bairro: " + bairro);
        
    }
    
}
