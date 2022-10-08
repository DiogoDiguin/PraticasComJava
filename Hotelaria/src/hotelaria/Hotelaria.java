package hotelaria;

import java.util.ArrayList;

/* @author 836846 */
public class Hotelaria {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        double valorTotal = 0;
        // TODO code application logic here
        Funcionario F;
        F = new Funcionario(6666, 1238, "Jose", "Gerente", "111.111.111-11", "9999-9999");
        F.imprimeFuncionario();
        
        System.out.println("-");
        
        Hospede ho = new Hospede(4444, "Diogo", "111.111.111-11", 
                "22.222.22-22", "3333-3333");
        
        Aposento ap = new Aposento(1111, 123, 250.35, "Quarto 01");        
        Hospedagem H;
        H = new Hospedagem(ap.getCodigo(), "23/02/2022", 
                "2022/31/03"); /*Código do Aposento = Código da Hospedagem*/
        H.imprimeHospedagem();
        ho.imprimeHospedagem();
        
        System.out.println("-");
        
        Consumo Co;
        Co = new Consumo(1111, "Coca-Cola", 11, 7.99);
        valorTotal = valorTotal + Co.getQuantidade() * Co.getValorUnitario();
        list.add(Co.getDescricao());
        list.add(Co.getQuantidade() * Co.getValorUnitario());
        Co.imprimeConsumo();
        
        Co = new Consumo(1111, "Pizza", 7, 25.95);
        valorTotal = valorTotal + Co.getQuantidade() * Co.getValorUnitario();
        list.add(Co.getDescricao());
        list.add(Co.getQuantidade() * Co.getValorUnitario());
        Co.imprimeConsumo();
        
        System.out.println("-");
        
        Conta C;
        C = new Conta(2356, valorTotal, true);
        C.imprimeConta();
        System.out.println(list);
        
        
        /*list.add(Co.getQuantidade());
        list.add(Co.getValorUnitario());
        System.out.println(list);*/
        
        
        
        
        //int codigo, double valorTotal, boolean pago, ArrayList consumos
        
        
    }
    
}
