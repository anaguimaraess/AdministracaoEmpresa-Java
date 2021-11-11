public class Fornecedor extends Pessoa {
    float valorCredito;
    float valorDivida;

//método construtor super (sempre usar c extends)
    public Fornecedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

//método principal p/ teste
    public static void main(String[] args){
        Pessoa p1 = new Fornecedor("Julia Santos", "2222-3333", "Avenida Paulista, 123");
        System.out.println(p1.getNome() + " " + p1.getTelefone());
        ((Fornecedor) p1).valorCredito = 400;
        ((Fornecedor) p1).valorDivida = 100;
        ((Fornecedor) p1).obterSaldo();
        System.out.println(((Fornecedor) p1).obterSaldo());
        p1.alterarTelefone("1233-1234");
        System.out.println(p1.getTelefone());
    }
// setter e getters
    public void setValorCredito(float valorCredito){
        this.valorCredito = valorCredito;
    }
    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    public float getValorDivida() {
        return valorDivida;
    }

    public float obterSaldo(){
        float saldo = valorCredito - valorDivida;
        return saldo;
    }
}