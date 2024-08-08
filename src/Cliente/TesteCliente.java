package Cliente;

public class TesteCliente {
    private String profissao;
    private String cpf;
    private String nome;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
