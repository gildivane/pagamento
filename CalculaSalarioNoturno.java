
package pagamento;


public class CalculaSalarioNoturno implements CalculaSalario{

    @Override
    public double calculaSalario(Funcionario f) {
       if (f.getP().isHomem())
           return 1500;
       return 1500*1.1;
    }


  
}
