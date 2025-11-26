package PrimeiraClasse;

public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 1000;
        primeiraConta.agencia = 0003;
        primeiraConta.numero = 2;
        primeiraConta.titular = "User";

        segundaConta.saldo = 1500;
        segundaConta.agencia = 0003;
        segundaConta.numero = 2;
        segundaConta.titular = "User2";

//        System.out.println("------------------------------");
//        System.out.println("Titular: " + primeiraConta.titular);
//        System.out.println("Agencia: " + primeiraConta.agencia);
//        System.out.println("Numero: " + primeiraConta.numero);
//        System.out.println("Saldo: " + primeiraConta.saldo);
//        System.out.println("------------------------------");
//
//        primeiraConta.deposita(10);
//
//        System.out.println("------------------------------");
//        System.out.println("Titular: " + primeiraConta.titular);
//        System.out.println("Agencia: " + primeiraConta.agencia);
//        System.out.println("Numero: " + primeiraConta.numero);
//        System.out.println("Saldo: " + primeiraConta.saldo);
//        System.out.println("------------------------------");
//
//        boolean statusSaque = primeiraConta.saca(40);
//
//        System.out.println("------------------------------");
//        System.out.println("Titular: " + primeiraConta.titular);
//        System.out.println("Agencia: " + primeiraConta.agencia);
//        System.out.println("Numero: " + primeiraConta.numero);
//        System.out.println("Saldo: " + primeiraConta.saldo);
//        System.out.println("Status do saque: "+ statusSaque);
//        System.out.println("------------------------------");

        boolean statusTransferencia = segundaConta.transfere(500, primeiraConta);

        System.out.println("------------------------------");
        System.out.println("Titular: " + primeiraConta.titular);
        System.out.println("Agencia: " + primeiraConta.agencia);
        System.out.println("Numero: " + primeiraConta.numero);
        System.out.println("Saldo: " + primeiraConta.saldo);
//        System.out.println("Status do saque: "+ statusSaque);
        System.out.println("Status transferencia: "+ statusTransferencia);
        System.out.println("------------------------------");

        System.out.println("------------------------------");
        System.out.println("Titular: " + segundaConta.titular);
        System.out.println("Agencia: " + segundaConta.agencia);
        System.out.println("Numero: " + segundaConta.numero);
        System.out.println("Saldo: " + segundaConta.saldo);
//        System.out.println("Status do saque: "+ statusSaque);
        System.out.println("Status transferencia: "+ statusTransferencia);
        System.out.println("------------------------------");


    }

}


/* testando alguns metodos dentro de uma classe em java */