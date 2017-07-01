/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

import javax.swing.JOptionPane;

/**
 *
 * @author Maykon
 */
public class CargaHorariaNoturna extends CargaHoraria{

    @Override
    void primeiroTurno() {
        System.out.println("18h00 - 20h45");
    }

    @Override
    void segundoTurno() {
        System.out.println( "21h00 - 22h00");
    }
    
}
