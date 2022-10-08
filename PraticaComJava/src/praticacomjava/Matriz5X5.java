
package praticacomjava;
import java.util.Random;

/* @author 836846 */
public class Matriz5X5 {
//Variáveis Exercício 03
    Random gerador = new Random();
    int contPar = 0, contImpar = 0;
    int max = 0, min = 9999;
    int[][] matriz = new int [5][5];
/**/
    
    //Preenchimento da Matriz
    public void Preenchimento(){
        //Preenchimento de Matriz
        System.out.printf("\tMATRIZ 5 X 5\n\n");
        int i, j;
        for(i = 0; i < 5; i ++){
            for(j = 0; j < 5; j ++){
                matriz[i][j] = gerador.nextInt(-100, 100);
                
                if(matriz[i][j] % 2 == 0){contPar += 1;}
                else{contImpar += 1;}
                
                if(matriz[i][j] > max){max = matriz[i][j];}
                else if(matriz[i][j] < min){min = matriz[i][j];}
            }
        }
        
        ImprimeMatriz(matriz);
        System.out.printf("Qtd de PARES (%d) e IMPARES (%d) \n", contPar, contImpar);
        if(min < 10 && min >= 0){
            System.out.printf("MAIOR (%d) e MENOR (0%d)", max, min);
        }else{
            System.out.printf("MAIOR (%d) e MENOR (%d)", max, min);
        }
    }
    
    //Impressão da Matriz
    public void ImprimeMatriz(int matriz[][]){
        int i, j;
        for(i = 0; i < 5; i ++){
            for(j = 0; j < 5; j ++){
               if(matriz[i][j] < 10 && matriz[i][j] >= 0){
                   System.out.printf("0");
               }
               System.out.printf(matriz[i][j] + "\t");
               if(j == 4 || j == 9){
                   System.out.printf("\n");
               }
            }
        }
        
        //Diagonais
        System.out.printf("\nDiagonal PRINCIPAL: ");
        for(i = 0; i < 5; i ++){
            if(matriz[i][i] < 10 && matriz[i][i] >= 0){
                   System.out.printf("0");
               }
            System.out.printf(matriz[i][i] + " ");
        }
        
        System.out.printf("\nDiagonal SECUNDÁRIA: ");
        for(i = 4; i >= 0; i --){
            if(matriz[i][5 - 1 - i] < 10 && matriz[i][5 - 1 - i] >= 0){
                   System.out.printf("0");
               }
            System.out.printf(matriz[i][5 - 1 - i] + " ");
        }
        
        System.out.printf("\n");
        }        
    
}
