package pagamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pagamento {


    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        //Sigleton
        MonitoramentoPagamento monitor = null;
        monitor = monitor.getInstance();
        
        
        for (int i=0;i<3;i++){
            
          String nome = JOptionPane.showInputDialog("NOME DO FUNCIONARIO");
          String sexo = JOptionPane.showInputDialog("SEXO DO FUNCIONARIO [M] [F]");
          String cargo = JOptionPane.showInputDialog("CARGA HORARIA [M] [N]");  
          boolean matinal = false;
          
          if (cargo.equals("M"))
              matinal = true;
          
          //FACTORY
          Pessoa p = FactoryPessoa.getPessoa(nome, sexo);
          Funcionario f = new Funcionario(p, matinal);
          
          funcionarios.add(f);
          
        }
        //FACADE
        monitor.ligar();
        
        //TEMPLATE
        CargaHorariaMatinal chm = new CargaHorariaMatinal();
        CargaHorariaNoturna chn = new CargaHorariaNoturna();
        
        //STRATEGY
        CalculaSalarioMatinal csm = new CalculaSalarioMatinal();
        CalculaSalarioNoturno csn = new CalculaSalarioNoturno();
        
        for (Funcionario f : funcionarios){
            System.out.print( "Analisando Funcionario... ");
            f.imprimir();
            if (f.getMatinal()){
               chm.Tudo();
                System.out.println( "Salário: "+csm.calculaSalario(f));
            }else{
                chn.Tudo();
                System.out.println( "Salário: "+csn.calculaSalario(f));
            }
                
            System.out.println( "Pagando Funcionario: "+f.getP().getNome());
        }
        
        
        
        monitor.desligar();
        
    }
    
}
