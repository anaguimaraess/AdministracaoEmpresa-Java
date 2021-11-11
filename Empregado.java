public class Empregado extends Pessoa{
    int codigoSetor;
    double salarioBase;
    double imposto;

    //método construtor super (sempre usar c extends)
    public Empregado(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

//método principal p/ teste
    public static void main(String[] args){
        Pessoa e1 = new Empregado("Carlos Alberto", "4444-2121", "Rua das rosas");
        ((Empregado) e1).salarioBase = 100;
        ((Empregado) e1).calcularSalario();
        System.out.println(((Empregado) e1).calcularSalario());
    }
//método para calcular salario (pedido no exercicio)
    public double calcularSalario(){
        double salarioFinal = 0;
        double salario1 = 1903.98;
        double salario2 = 2826.65;

        if (salarioBase <= salario1){
            this.salarioBase = salarioBase;
            return salarioBase;
        }else if(salarioBase >= salario1 && salarioBase <= salario2){
            double imposto1 = 0.075 * salarioBase;
            salarioFinal = (double) (salarioBase - imposto1);
        }else{
            double imposto2 = 0.275 * salarioBase;
            salarioFinal = (double) (salarioBase - imposto2);
        }
        return salarioFinal;
    }

// setter e getters
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double getImposto() {
        return imposto;
    }


}