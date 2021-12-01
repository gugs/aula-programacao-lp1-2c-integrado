package banco2;

public class Programa {

	
	public static void main(String[] args)
	{
		ContaCorrente cc1 = new ContaCorrente("CCA321", "01/12/2021");
		ContaCorrente cc2 = new ContaCorrente("CCA123", "01/12/2021");
		
		ContaPoupanca cp1 = new ContaPoupanca("CP222", "01/12/2021");
		
		System.out.println(cc1);
		System.out.println(cc2);
		
		
		cc1.realizarDeposito(300f);
		
		System.out.println(cc1);
		
		cc1.realizarTransferencia(100f, cc2);
		
		System.out.println(cc1);
		System.out.println(cc2);
		
		cc1.realizarTransferencia(100f, cp1);
		
		System.out.println(cc1);
		System.out.println(cp1);
	}
}
