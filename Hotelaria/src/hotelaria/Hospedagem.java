package hotelaria;
import java.util.Date;
/* @author 836846 */
public class Hospedagem{
    private int codigo;
    private String dataEntrada;
    private String dataSaida;

    public Hospedagem(int codigo, String dataEntrada, String dataSaida) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }  

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    void imprimeHospedagem(){
    System.out.println("HOSPEDAGEM");
    System.out.println("Código: " + codigo);
    System.out.println("Data Entrada: " + dataEntrada);
    System.out.println("Data Saída: " + dataSaida);
    }
}
