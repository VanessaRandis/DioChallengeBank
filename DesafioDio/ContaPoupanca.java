package DesafioDio;



	public class ContaPoupanca extends Conta{

		@Override
		public void imprimirExtrato() {
			System.out.println("===Extrato conta Poupança===");
			super.imprimirInfoComuns();
			
		}

}
