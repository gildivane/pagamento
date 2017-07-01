
package pagamento;


public abstract class CargaHoraria {
        abstract void primeiroTurno();
	abstract void segundoTurno();
        
        public void Tudo(){
            primeiroTurno();
            segundoTurno();
        }
}
