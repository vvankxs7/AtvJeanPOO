import java.util.Scanner;
public class DemoCliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente c1;
		Cliente c2;
		
		String nome;
		float cred;
		
		System.out.println("Entrada de dados C1:");
		System.out.println("Nome do cliente 1: ");
		nome = sc.nextLine();
		System.out.println("Creditos do cliente 1:");
		cred = sc.nextFloat();
		c1 = new Cliente(nome,cred);
		sc.nextLine();
		
		System.out.println("Entrada de dados C2:");
		System.out.println("Nome do cliente 2: ");
		c2 = new Cliente(nome);
		nome = sc.nextLine();
		System.out.println("Creditos do cliente 2:");
		cred = sc.nextFloat();
		c2 = new Cliente(cred);
		sc.nextLine();
		
		System.out.println("IMPRESSAO DE DADOS: ");
		System.out.println("Cliente 1: "+c1);
		System.out.println("Cliente 2: "+c2);
		
		System.out.println("DADOS CLIENTE 1: ");
		System.out.println("Nome do cliente 1: ");
		nome = sc.nextLine();
		System.out.println("Creditos do cliente 1: ");
		cred = sc.nextFloat();
		c1.setNome(nome);
		c1.setCred(cred);
		
		System.out.println("Dados do c1: "+c1);
		System.out.println("\nIndentificador de c2: "+c2.getCred());
		System.out.println("Proximo numero do indentificador: "+(Cliente.idAux +1));
		
		
		 
		 
		
	}

}
