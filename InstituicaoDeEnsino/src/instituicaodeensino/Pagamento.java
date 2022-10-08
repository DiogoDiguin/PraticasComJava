
package instituicaodeensino;
import java.util.ArrayList;

/* @author SAMSUNG */
public class Pagamento {
    ArrayList list = new ArrayList<>();
    protected double valor;
    protected String data;
    protected boolean inclui;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public void setInclui(boolean inclui) {
        this.inclui = inclui;
    }
    
    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    void incluirPagamento(double valor, String data, boolean inclui){
        if(inclui == true){
            list.add(valor);
            list.add(data);
        }
    }
        
}
