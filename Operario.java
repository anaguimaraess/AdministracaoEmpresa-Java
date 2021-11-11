public class Operario extends Empregado{
    double valorProducao;

//método construtor super (sempre usar c extends)
    public Operario(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

//reescrita do método de empregado.java
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

//métodos pedidos no exercici
    public double salarioDeFinal(){
        double salarioFinal = valorComissao() + calcularSalario();
        return salarioFinal;
    }
    public double valorComissao(){
        double comissao = 0.1 * valorProducao;
        return (double) comissao;
    }

//método principal p/ testes
    public static void main(String[] args){
        Pessoa op1 = new Operario("Alice Silva", "1212-000", "Rua dos lagos");
        ((Empregado)op1).salarioBase = 3000;
        ((Operario)op1).valorProducao = 50;
        ((Operario)op1).salarioDeFinal();
        System.out.println("O salário de " + ((Operario)op1).getNome() + " é " + ((Operario)op1).salarioDeFinal());
    }

//setters e getters
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getValorProducao() {
        return valorProducao;
    }

}
