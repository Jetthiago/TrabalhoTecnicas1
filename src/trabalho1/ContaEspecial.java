
package trabalho1;

public class ContaEspecial extends Contas {
    private int limite;
    private double multa;
    public void setLimite(int limite){
        this.limite = limite;
    }
    public void setMulta(double multa){
        this.multa = multa;
    }
    public void descontar(double multa){
        //
    }
    @Override
    public int sacar(double valor){
        if(valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
            return 1;
        } else if(valor > this.getSaldo() + this.limite) {
            System.out.println("Saldo insuficiente");
            return 2;
        } else {
            this.setSaldo(this.getSaldo() - (valor + ((valor - this.getSaldo()) * this.multa)));
            System.out.println("Saque efetuado com cheque especial");
            return 3;
        }
    }
    public void tipoConta(){
        System.out.println("Tipo de conta: conta-especial");
    }
}
