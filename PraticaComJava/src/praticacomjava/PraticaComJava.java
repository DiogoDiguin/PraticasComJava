
package praticacomjava;

/* @author 836846 */
public class PraticaComJava {

    public static void main(String[] args) {
        // TODO code application logic here
        ICMS produto = new ICMS();
        produto.Especificacoes();
        System.out.println("-------------------------");
        
        IndicePoluicao valor = new IndicePoluicao();
        valor.Poluicao();
        System.out.println("-------------------------");
        
        Matriz5X5 matriz = new Matriz5X5();
        matriz.Preenchimento();     
        System.out.println("\n-------------------------");
    }
    
}
