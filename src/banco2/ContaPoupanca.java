package banco2;

public class ContaPoupanca implements ContaIF {

	String numeroConta;
	private float saldo;
	String dataAbertura;
	private boolean status;
	
	public ContaPoupanca(String numero, String dataAbertura)
	{
		this.numeroConta = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = 0f;
		this.status = true;
	}
	
	@Override
	public float consultarSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void realizarDeposito(float quantia) {
		if(status == true && quantia > 0)
		{
			saldo = saldo + quantia;
		}
	}

	@Override
	public void realizarSaque(float quantia) {
		if(status && quantia > 0 && saldo>=quantia)
		{
			saldo = saldo - quantia;
		}
		
	}

	@Override
	public void realizarTransferencia(float quantia, ContaIF contaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desativarConta() {
		// TODO Auto-generated method stub
		if(status==true)
			status = false;
	}

	@Override
	public void ativarConta() {
		// TODO Auto-generated method stub
		if(status == false)
			status = true;
	}
	
	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}
	
	

}
