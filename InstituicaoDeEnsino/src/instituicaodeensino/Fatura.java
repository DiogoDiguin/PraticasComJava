
package instituicaodeensino;

import java.util.ArrayList;

/* @author SAMSUNG */
public class Fatura {
    ArrayList list = new ArrayList<>();
    private String NumDoc;
    private double valorTotal;
    private String dataVencimento;
    private boolean cancelada;
    private String tipo;
    private ArrayList <Pagamento> lista;

    public Fatura(String NumDoc, double valorTotal, String dataVencimento, boolean cancelada, String tipo
            /*, ArrayList<Pagamento> lista*/) {
        this.NumDoc = NumDoc;
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
        this.cancelada = cancelada;
        this.tipo = tipo;
        //this.lista = lista;
    }

    void imprimeFatura(){
        System.out.println("FATURA");
        System.out.println("Valor: R$" + valorTotal);
        System.out.println("Vencimento: " + dataVencimento);
        System.out.printf("Cancelada: " );
        if(cancelada == true){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
        System.out.println("Tipo:  " + tipo);
    }
    
    
    
    
}
