
package pagamento;


public class MonitoramentoPagamento {
    private boolean monitorando = false;

    public MonitoramentoPagamento() {
    }
    
    private static MonitoramentoPagamento instancia = null;
    
   
    
    public static synchronized MonitoramentoPagamento getInstance(){
        if (instancia == null){
            instancia = new MonitoramentoPagamento();
        }
        return instancia;
    }
    
    public void ligar(){
        monitorando = true;
        System.out.println("Monitoramento Ativo!");
    }
    
    public void desligar(){
        monitorando = false;
        System.out.println("Monitoramento Desligado!");
    }
    
}
