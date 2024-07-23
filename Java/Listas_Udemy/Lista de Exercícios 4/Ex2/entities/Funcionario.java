package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    @Override
    public String toString(){
        return String.format("%s, $%.2f", nome, (salarioBruto- imposto));
    }

    public void aumentoSalario(double porcentagem){
        this.salarioBruto += (salarioBruto * (porcentagem / 100));
    }


}
