public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        System.out.println("Dados de " + nome + " foram armazenados!");
    }

//dois métodos pedidos no exercicio
    public void alterarTelefone(String novoTelefone){
        this.telefone = novoTelefone;
        System.out.println("Número de telefone alterado com sucesso!");
    }

    public void alterarEndereco(String novoEndereco){
        this.endereco = novoEndereco;
        System.out.println("Endereço alterado com sucesso!");
    }

//setters e getters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
}

