package contasbancarias;

/* @author 836846 */

public class Contas {
    protected int n_agencia;
    protected int n_conta;
    protected double saldo;
        
    public void setAgencia(int n_agencia){
        this.n_agencia = n_agencia;
    }
    public int getAgencia(int n_agencia){
        return this.n_agencia;
    }
    
    public void setConta(int n_conta){
        this.n_conta = n_conta;
    }
    public int getConta(int n_conta){
        return this.n_conta;
    }
    
    public double getSaldo(double saldo){
        return this.saldo;
    }
}






