
package VendaDeProduto_SD;

import java.util.ArrayList;

/* @author SAMSUNG */
public class Fatura {
    ArrayList list = new ArrayList<>();
    
    void AddFatura(boolean inclui, String nome, String descricao, 
            double valor){
        if(inclui == true){
            list.add("\n");
            list.add(nome);
            list.add(descricao);
            list.add(valor);  
        }
    }

    void imprimeFatura(){
        System.out.println("\n\tFatura");
        System.out.println(list);
    }
}
