
package instituicaodeensino;

/* @author SAMSUNG */
public class PessoaFisica extends Pessoa{
    protected String sexo;
    protected String genero;
    protected String raca;

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

}
