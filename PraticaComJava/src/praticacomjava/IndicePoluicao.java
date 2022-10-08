
package praticacomjava;
import java.util.Scanner;

/* @author 836846 */
public class IndicePoluicao {
//Variáveis Exercício 02
    Scanner leitor;
    float indice;
/**/
    
    //Informar o índice
    public void Poluicao(){ 
        System.out.printf("\tÍNDICE POLUIÇÃO\n\n");
        leitor = new Scanner (System.in);
        System.out.printf("Digite o indice de poluição: ");
        indice = leitor.nextFloat();
        
        Decisao(indice);
    }
        
    //Executa a decisão de providência
    void Decisao(float indice){
        if (indice < 0.30){
            System.out.printf("\nSituação | Providência \n");
            System.out.printf("   BOA   | Nenhuma providencia \n");
        }else if (0.30 <= indice && indice  < 0.40){
            System.out.printf("\nSituação | Providência \n");
            System.out.printf("  RUIM   | Suspender empresas da lista A \n");
        }else if (0.40 <= indice && indice  <= 0.50){
            System.out.printf("\nSituação | Providência \n");
            System.out.printf(" PESSIMA | Suspender empresas das listas A e B \n");
        }else if (0.50 < indice){
            System.out.printf("\nSituação | Providência \n");
            System.out.printf(" CRITICA | Suspender todas as empresas \n");
        }
    }
}
