package hotelaria;

import java.util.ArrayList;

/* @author 836846 */
public class Conta{
    ArrayList list = new ArrayList<>();
    private int codigo;
    private double valorTotal;
    private boolean pago;
    private ArrayList <Consumo> lista;

    public Conta(int codigo, double valorTotal, boolean pago/*, ArrayList <Consumo> lista*/) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.pago = pago;
        this.lista = lista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public ArrayList<Consumo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Consumo> lista) {
        this.lista = lista;
    }
        
    void imprimeConta(){
        System.out.println("CONTA");
        System.out.println("Codigo: " + codigo);
        System.out.println("Valor TOTAL: R$" + valorTotal);
        System.out.println("Pago: " + pago);
    }
}
