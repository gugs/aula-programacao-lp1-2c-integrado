package banco2;

public interface ContaIF {
	
	public float consultarSaldo();
	
	public void realizarDeposito(float quantia);
	
	public void realizarSaque(float quantia);
	
	public void realizarTransferencia(float quantia, ContaIF contaDestino);
	
	public void desativarConta();
	
	public void ativarConta();
	
	public boolean getStatus();

}
