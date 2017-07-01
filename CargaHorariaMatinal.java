
package pagamento;

import javax.swing.JOptionPane;


public class CargaHorariaMatinal extends CargaHoraria{
    
    

    @Override
    void primeiroTurno() {
        System.out.println("7h00 - 9h45");
    }

    @Override
    void segundoTurno() {
         System.out.println("10h00 - 12h00");
    }
    
}
