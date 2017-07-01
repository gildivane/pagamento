
package pagamento;

/**
 *
 * @author Maykon
 */
public class Funcionario {
    private Pessoa p;
    private Boolean matinal;

    public Funcionario(Pessoa p, Boolean matinal) {
        this.p = p;
        this.matinal = matinal;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public Boolean getMatinal() {
        return matinal;
    }

    public void setMatinal(Boolean matinal) {
        this.matinal = matinal;
    }
    
    public void imprimir(){
        if (p.isHomem()){
           Homem m =  (Homem) this.getP();
           m.imprimirNome();
        }else{
            Mulher m =  (Mulher) this.getP();
           m.imprimirNome();
        }
        
    }
    
}
