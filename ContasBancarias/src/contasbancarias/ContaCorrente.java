package contasbancarias;

/* @author 836846 */

public class ContaCorrente extends Contas{
    double limite;
    
    /*
    public void setLimite(double limite){
        this.limite = limite;
    }
    */
    
    ContaCorrente(int n_agencia, int n_conta, double saldo, double limite){
        this.n_conta = n_conta;
        this.n_agencia = n_agencia;
        this.saldo = limite - saldo;
        this.limite = limite;
    }
    
    void imprimeCorrente(){
        System.out.printf("CONTA CORRENTE\n");
        System.out.printf("Agência: " + n_agencia + "\n");
        System.out.printf("Conta: " + n_conta + "\n");
        System.out.printf("Saldo: " + saldo + "\n");
        System.out.printf("Limite: " + limite + "\n");
    }
}
