package DesafioDio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Banco novoBanco= new Banco();
		System.out.println("What is the cliente´s name : ");
		novoBanco.setNome(teclado.next());
		
		System.out.println("Name :" + novoBanco.getNome());
		
		
		Conta novaConta = new ContaCorrente();
		
		novaConta.depositar(300.00);
		
		System.out.println("Saldo U$:"+novaConta.getSaldo());
		System.out.println("Informe how much is the withdraw ");
		novaConta.sacar(teclado.nextDouble());
		
		System.out.println("You still have U$:" + novaConta.saldo);
		
		Conta ContaCliente= new ContaPoupanca();
		
	
		
		System.out.println("Inform how much is the deposit?");
		ContaCliente.depositar(teclado.nextDouble());
		System.out.println("Balance U$:"+ContaCliente.getSaldo());
		System.out.println("Informe how much money would you like? ");
		
		
		ContaCliente.imprimirExtrato();
		novaConta.imprimirExtrato();
		
		System.out.println("Inform the transfer value : ");
		novaConta.tranferir(teclado.nextDouble(), ContaCliente);
		
		ContaCliente.imprimirExtrato();
		novaConta.imprimirExtrato();
		
		teclado.close();
	}

}
