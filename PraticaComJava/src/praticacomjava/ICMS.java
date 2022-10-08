
package praticacomjava;
import java.util.Scanner;

public class ICMS {   
//Variáveis Exercício 01
    Scanner leitor;
    String nome;
    String descricao;
    double precoCusto;
    double precoVenda;
    int qtdEstoque;
/**/    
    
    //Preenchimento de Informações
    public void Especificacoes(){
        System.out.printf("\tDESCONTO DE PRODUTO\n\n");
        leitor = new Scanner (System.in);
        System.out.printf("Digite o nome do produto: ");
        nome = leitor.nextLine();
        System.out.printf("Digite a descrição do produto: ");
        descricao = leitor.nextLine();
        System.out.printf("Digite o preco de compra do produto: R$");
        precoCusto = leitor.nextDouble();
        precoVenda = precoCusto * 1.18;
        System.out.printf("Preco com ICMS (Venda): R$" + precoVenda + "\n");
        System.out.printf("Quantidade em estoque do produto: ");
        qtdEstoque = leitor.nextInt();   
        
        Julgamento(precoVenda);
    }
    
    //Definição do Desconto
    void Julgamento(double precoVenda){
        double desconto;
        
        if(precoVenda > 1 && precoVenda < 1000){
            desconto = 0.05;
            System.out.println("Desconto de 5%, preco aplicado R$" + 
                    (precoVenda - (precoVenda * desconto)));
        }else if(precoVenda > 1000.01 && precoVenda < 2000){
            desconto = 0.10;
            System.out.println("Desconto de 10%, preco aplicado R$" + 
                    (precoVenda - (precoVenda * desconto)));
        }else if(precoVenda > 2000){
            desconto = 0.15;
            System.out.println("Desconto de 15%, preco aplicado R$" + 
                    (precoVenda - (precoVenda * desconto)));
        }
    }
}
