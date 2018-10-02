
package trabalho1;

public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    public Contas(){
        this.saldo = 0;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public int depositar(double valor){
        this.saldo += valor;
        return 1;
    }
    public int sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
            return 1;
        } else {
            System.out.println("Saldo insuficiente");
            return 2;
        }
    }
    public void transferir(int conta1, int conta2, int valor){
        // wtf?
    }
    public void tipoConta(){
        System.out.println("Tipo de conta: comum");
    }
    
}
