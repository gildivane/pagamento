
package pagamento;

import javax.swing.JOptionPane;


public class Homem extends Pessoa{
    
  
    
    public Homem(String nome) {
        super(nome, "M");
    }
    
    public Homem(Homem h) {
        super(h.getNome(), "M");
    }
    
    public void imprimirNome(){
        System.out.println("Sr. "+ getNome());
    }
    
    public void imprimirFunc(){
        System.out.println("Funcionario: "+ getNome());
    }
    
}
