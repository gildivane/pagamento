
package pagamento;


public class AdapterHomem extends Homem{
    
    
    
    public AdapterHomem(String nome) {
        super(nome);
    }
    
    public AdapterHomem(Homem h) {
        super(h);
    }

    public AdapterHomem(Mulher m) {
        super(m.getNome());
    }

    @Override
    public void imprimirNome() {
        super.imprimirFunc();//To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
    
   
    
  
    
    
    
}
