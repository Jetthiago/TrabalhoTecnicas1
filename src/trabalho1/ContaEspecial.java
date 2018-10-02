
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
    public void tipoConta(){
        System.out.println("Tipo de conta: conta-especial");
    }
}
