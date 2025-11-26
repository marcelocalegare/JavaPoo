package PrimeiraClasse;/* Este arquivo será utilizado para anotar conteudos durante meus estudos em Java Poo. */

public class Conta{
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita (double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

}


