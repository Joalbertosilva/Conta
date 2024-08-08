package contas;

import Cliente.TesteCliente;

public class Account {
    private String name;
    private double salary;
    private int age;
    private double saldo;
    private TesteCliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }
    public void aumento(double valor){
        this.salary += valor;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque efetuado");
            return true;
        } else{
            System.out.println("Saque indisponivel");
            return false;
        }
    }
    //metodo void não retorna nada, então nao usa return
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TesteCliente getTitular() {
        return titular;
    }

    public void setTitular(TesteCliente titular) {
        this.titular = titular;
    }
}
