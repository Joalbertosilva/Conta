package contas;

public class TesteSacaNegativo {
    public static void main(String [] args){
        Account contaTeste = new Account();
        contaTeste.deposita(100);
        contaTeste.sacar(200);
        //proibido mexer dessa maneira
        //contaTeste.saldo = contaTeste.saldo - 200;
        System.out.println(contaTeste.getSaldo());
    }
}
//Encapsulamento serve para privar os atributos
//No poo voce não mexe com atributos, para usa-los ou modificalos voce utiliza get ou setter