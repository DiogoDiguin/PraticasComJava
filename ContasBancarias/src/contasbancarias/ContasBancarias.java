
package contasbancarias;

/* @author 836846 */
public class ContasBancarias {

    public static void main(String[] args) { 
        ContaPoupanca CP;
        CP = new ContaPoupanca(1111, 22, 87000.45);
        CP.setVencimento(25);
        CP.imprimePoupanca();
        System.out.printf("\n");
        CP = new ContaPoupanca(5555, 99, 5047.87);
        CP.setVencimento(14);
        CP.imprimePoupanca();
        System.out.printf("\n");
        CP = new ContaPoupanca(6666, 87, 6178.65);
        CP.setVencimento(07);
        CP.imprimePoupanca();
        
        System.out.printf("\n");
        ContaCorrente CC;
        CC = new ContaCorrente(1111, 22, 87000.45, 100000.00);
        CC.imprimeCorrente();
        System.out.printf("\n");
        CC = new ContaCorrente(1473, 81, 1093.50, 7302.00);
        CC.imprimeCorrente();
        System.out.printf("\n");
        CC = new ContaCorrente(1648, 74, 17953.45, 20000.10);
        CC.imprimeCorrente();
    } 
}
