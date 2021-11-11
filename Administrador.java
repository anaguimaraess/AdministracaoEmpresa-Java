public class Administrador extends Empregado{
    double ajudaDeCusto;

//método construtor super (sempre usar c extends)
    public Administrador(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

//reescrita de método da classe empregado
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

//método principal p/ teste
    public static void main(String[] args){
        Pessoa adm1 = new Administrador("Joao Rodrigues", "12345", "Rua Verde");
        ((Empregado)adm1).salarioBase = 2500;
        ((Empregado) adm1).calcularSalario();
        ((Administrador)adm1).ajudaDeCusto = 100;
        System.out.println(((Administrador) adm1).receberAjudaDeCusto());
    }
//setters e getters
    public double receberAjudaDeCusto(){
        double recebimentoAjuda = ajudaDeCusto + calcularSalario();
        return recebimentoAjuda;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
}