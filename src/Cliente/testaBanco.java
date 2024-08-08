package Cliente;
import contas.Account;
public class testaBanco {
    public static void main(String[] args) {
        TesteCliente cliente = new TesteCliente();
        cliente.setNome("João Alberto");
        cliente.setCpf("777.333.111-00");
        cliente.setProfissao("Desenvolvedor");

        Account contaJoao = new Account();
        contaJoao.deposita(2000);
        contaJoao.setTitular(cliente);

        System.out.println(contaJoao.getTitular().getNome());
        System.out.println(contaJoao.getSaldo());


    }
}
