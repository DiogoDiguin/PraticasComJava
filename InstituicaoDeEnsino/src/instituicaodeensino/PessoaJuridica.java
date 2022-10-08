
package instituicaodeensino;

/* @author SAMSUNG */
public class PessoaJuridica extends Pessoa{
    protected long CNPJ;
    protected long inscEstadual;
    protected long inscMunicipal;
    protected String abertura;
    protected String nomeFantasia;
    protected int CNAE;

    public long getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public long getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(long inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public long getInscMunicipal() {
        return inscMunicipal;
    }
    public void setInscMunicipal(long inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    public String getAbertura() {
        return abertura;
    }
    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getCNAE() {
        return CNAE;
    }
    public void setCNAE(int CNAE) {
        this.CNAE = CNAE;
    }

}
