
package VendaDeProduto_SD;

/* @author SAMSUNG */
public class Venda {
    private double valortotal;
    private double valor;
    
    public void criar(double valor){
        valortotal = valortotal + valor;
    }
    public void ImprimeTotal(){
        System.out.printf("Total da Venda: R$" + valortotal);
        System.out.printf("\n");
    }
}
