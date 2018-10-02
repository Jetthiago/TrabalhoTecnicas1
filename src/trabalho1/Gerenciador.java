
package trabalho1;

public class Gerenciador {
    public Contas comum;
    public ContaPoupanca poupanca;
    public ContaEspecial especial;
    
    public void armazenar(Contas comum, ContaPoupanca poupanca, ContaEspecial especial){
        this.comum = comum;
        this.poupanca = poupanca;
        this.especial = especial;
    }
    public void armazenar(Contas comum){
        this.comum = comum;
    }
    public void armazenar(ContaPoupanca poupanca){
        this.poupanca = poupanca;
    }
    public void armazenar(ContaEspecial especial){
        this.especial = especial;
    }
    
    public void abrirTelaOperacoes(){
        System.out.println(this.comum.getNome());
        TelaDeOperacoes tela = new TelaDeOperacoes(this);
        tela.setVisible(true);
    }
}
