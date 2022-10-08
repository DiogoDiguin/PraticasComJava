package hotelaria;

/* @author 836846 */
public class Aposento {
    private int codigo;
    private int numero;
    private double valor;
    private String descricao;

    public Aposento(int codigo, int numero, double valor, String descricao) {
        this.codigo = codigo;
        this.numero = numero;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
