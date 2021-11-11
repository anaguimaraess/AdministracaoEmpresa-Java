public class Vendedor extends Empregado{
    double valorVendas;
    double comissao;

//método construtor com super (usar c extends)
    public Vendedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

//método principal p/ testes
    public static void main(String[] args){
        Pessoa ps1 = new Vendedor("Lucas Silva", "8989-222", "Rua Santa Marcelina");
        ((Empregado)ps1).salarioBase = 2700.3;
        ((Vendedor)ps1).valorVendas = 50;
        ((Vendedor)ps1).salarioDeFinal();
        System.out.println("O salário de " + ((Vendedor)ps1).getNome() + " é " + ((Vendedor)ps1).salarioDeFinal());
    }

//reescrita de método da classe Empregado.java
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

//métodos pedidos no exercicio
    public double salarioDeFinal(){
        double salarioFinal = valorComissao() + calcularSalario();
        return salarioFinal;
    }
    public double valorComissao(){
        double comissao = 0.2 * valorVendas;
        return (double) comissao;
    }

//setters e getters
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public double getValorVendas() {
        return valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }
}