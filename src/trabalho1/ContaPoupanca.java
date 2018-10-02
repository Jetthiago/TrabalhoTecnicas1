
package trabalho1;

public class ContaPoupanca extends Contas {
    private double taxa = 0.1;
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    
    public void reajustar(double taxa){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * taxa;
        this.depositar(reajuste);
    }
    public void reajustar(){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * this.taxa;
        this.depositar(reajuste);
    }
    public void tipoConta(){
        System.out.println("Tipo de conta: conta-polpança");
    }
}
