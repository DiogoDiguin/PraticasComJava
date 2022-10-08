package contasbancarias;

/* @author 836846 */

public class ContaPoupanca extends Contas{
    int diaVencimento;
    
    public void setVencimento(int diaVencimento){
        this.diaVencimento = diaVencimento;
    }
    
    ContaPoupanca(int n_agencia, int n_conta, double saldo){
        this.n_conta = n_conta;
        this.n_agencia = n_agencia;
        this.saldo = saldo;
    }

    void imprimePoupanca(){
        System.out.printf("CONTA POUPANÇA\n");
        System.out.printf("Agência: " + n_agencia + "\n");
        System.out.printf("Conta: " + n_conta + "\n");
        System.out.printf("Saldo: " + saldo + "\n");
        System.out.printf("Vencimento: " + diaVencimento + "\n");
    }
}