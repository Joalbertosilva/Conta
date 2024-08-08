package contas;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Account primeryAccount = new Account();
        primeryAccount.setName("João Alberto");
        primeryAccount.setSalary(10000);
        primeryAccount.setAge(22);
        primeryAccount.aumento(5000);

        System.out.println("O cliente " + primeryAccount.getName() + " que tem " + primeryAccount.getAge() + " anos possui em sua conta: " + primeryAccount.getSalary());
    }
}