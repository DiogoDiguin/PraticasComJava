package VendaDeProduto_SD;

/* @author SAMSUNG */
public class VendaDeProduto_SD {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Registro venda = new Registro();
        Venda compra = new Venda();
        Fatura fatura = new Fatura();
        
        venda.setValor(15.87);
        venda.fazerPagamento(venda.getValor());
        compra.criar(venda.getValor());
        fatura.AddFatura(true, venda.getNome(), venda.getDescricao(), 
                venda.getValor());
        
        venda.setValor(14.95);
        venda.fazerPagamento(venda.getValor());
        compra.criar(venda.getValor());
        fatura.AddFatura(true, venda.getNome(), venda.getDescricao(), 
                venda.getValor());
        
        venda.setValor(13.78);
        venda.fazerPagamento(venda.getValor());
        compra.criar(venda.getValor());
        fatura.AddFatura(true, venda.getNome(), venda.getDescricao(), 
                venda.getValor());
        
        compra.ImprimeTotal();
        fatura.imprimeFatura();
    }
    
}
