package PrimeiraClasse;

public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        primeiraConta.agencia = 0003;
        primeiraConta.numero = 2;
        primeiraConta.titular = "User";

        System.out.println("------------------------------");
        System.out.println("Titular: " + primeiraConta.titular);
        System.out.println("Agencia: " + primeiraConta.agencia);
        System.out.println("Numero: " + primeiraConta.numero);
        System.out.println("Saldo: " + primeiraConta.saldo);
        System.out.println("------------------------------");

    }

}
