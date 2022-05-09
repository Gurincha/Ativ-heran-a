public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;    
    private double imposto;
    
    public double calcularSalario(){
        double salarioLiquido= this.salarioBase - this.imposto;
        return salarioLiquido;
    }
    
}