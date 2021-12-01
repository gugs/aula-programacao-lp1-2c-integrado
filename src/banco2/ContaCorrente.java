package banco2;

public class ContaCorrente implements ContaIF{

	String numeroConta;
	private float saldo;
	String dataAbertura;
	private boolean status;
	
	public ContaCorrente(String numero, String dataAbertura)
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
	public void realizarDeposito(float quantia) 
	{
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
		if(contaDestino instanceof ContaCorrente)
		{
			if(status == true && saldo>=quantia && contaDestino.getStatus() == true)
			{
				saldo = saldo - quantia;
				contaDestino.realizarDeposito(quantia);
			}
		}else if(contaDestino instanceof ContaPoupanca)
		{
			if(status == true && saldo>=(quantia+(quantia*0.02)) && contaDestino.getStatus() == true)
			{
				saldo = saldo - (quantia+(quantia*0.02f));
				contaDestino.realizarDeposito(quantia);
			}
		}
		
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}
	

	public void desativarConta()
	{
		if(status==true)
			status = false;
	}
	
	public void ativarConta()
	{
		if(status == false)
			status = true;
	}

	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	

}
