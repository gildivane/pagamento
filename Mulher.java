
package pagamento;

import javax.swing.JOptionPane;


public class Mulher extends Pessoa{
    
    public Mulher(String nome) {
        super(nome, "F");
    }
     public void imprimirNome(){
       System.out.println("Sra. "+ getNome());
    }
}
