package executavel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Filme;
import Model.Pagamento;
import Model.Usuario;

public class Exec {
	public static void main(String[] args) {
		ArrayList<Filme> listaFilme = new ArrayList();
		ArrayList<Usuario> listaUsuario = new ArrayList();
		
		Filme filme1 = new Filme("Minha m�e e uma  pe�a", 2013, "Suzana Garcia", "Paulo Gustavo", "comedia");
		Filme filme2 = new Filme("Amor com data marcada", 2020, "John Whiitesell", "Emma Roberts", "Comedia Romance");
		Filme filme3 = new Filme("Alguem como eu", 2018, "Leonel Vieira", "Paola Oliveira", "Comedia");
		Filme filme4 = new Filme("O filho do noivo", 2019, "Jhon Asher", "Tom Everett", "Comedia");
		listaFilme.add(filme1);
		listaFilme.add(filme2);
		listaFilme.add(filme3);
		listaFilme.add(filme4);
		
		//usuario
		Usuario user1 = new Usuario("Sirlene", true, filme1);
		Usuario user2 = new Usuario("Dianaci", false, filme2);
		listaUsuario.add(user1);
		listaUsuario.add(user2);
		
		for(Filme filme: listaFilme) {
			System.out.println(filme.toString());
		}
		System.out.println("Op��es: ");
		System.out.println("1: titulo");
		System.out.println("2: Ano");
		System.out.println("3: Diretor");
		System.out.println("4: Ator");
		System.out.println("5: G�nero");
		
		// permite o usuario digitar
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a op��o que voc� deseja pesquisar: ");
		// nextLine(): permite que o usuario digite string
		String op = sc.nextLine();
	    
		switch (op) {
		case "1":
			System.out.println("Digite o nome do titulo do filme: ");
			String titulo = sc.nextLine();
			
			for(Filme listFilme: listaFilme) {
				if(titulo.equals(listFilme.getTitulo())) {
					System.out.println(listFilme);
				}
			}
			break;
			
		case "2":
			System.out.println("Digite o ano de lan�amento do filme: ");
			int ano = sc.nextInt();
			
			for(Filme listFilme: listaFilme) {
				if(ano == listFilme.getAno()) {
					System.out.println(listFilme);
				}
			}
			break;
		case "3":
		    System.out.println("Digite o nome do diretor do filme: ");
		    String diretor = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(diretor.equals(listFilme.getDiretor())) {
					System.out.println(listFilme);
				}
			}
			break;
			
		case "4":
		    System.out.println("Digite o nome do ator do filme: ");
		    String ator = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(ator.equals(listFilme.getAtor())) {
					System.out.println(listFilme);
				} 
			}
			break;
			
		case "5":
		    System.out.println("Digite o tipo de g�nero do filme: ");
		    String genero = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(genero.equals(listFilme.getG�nero())) {
					System.out.println(listFilme);
				}
			}
			break;

		default:
			System.out.println("Voc� digitou uma op��o inexistente.");
		}
		

		// pagamento
		System.out.println("Digite o nome do usuario: ");
		String nomeU = sc.nextLine();
		
		Pagamento pagamento = new Pagamento();
		
		for(Usuario usuario : listaUsuario) {
			if(nomeU.equals(usuario.getNome())) {
				if(usuario.isAtivo()) {
					System.out.println("O usu�rio est� com a mensalidade em dias.");
				} else {
					System.out.println("O usu�rio n�o est� com o pagamento em dias. Adicione uma forma de pagamento para continuar a assistir.");
					System.out.println("1: Cartao de credito");
					System.out.println("2: Cartao de debito");
					System.out.println("3: Pix");
					System.out.println("4: TED");
					System.out.println("5: Boleto");
					
					System.out.println("Digite a forma de pagamento que voc� deseja efetuar: ");
					String opcao = sc.nextLine();
					
					switch (opcao) {
					case "1":
						System.out.println("Digite o numero do seu cart�o de credito: ");
						int cartaoC = sc.nextInt();
						pagamento.setCartaoc(cartaoC);
						usuario.setAtivo(true);
						System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "2":
						System.out.println("Digite o n�mero do seu cart�o de d�bito: ");
						int cartaoD = sc.nextInt();
					    pagamento.setCartaoc(cartaoD);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "3":
						System.out.println("Digite o n�mero do seu cart�o de d�bito: ");
						int pix = sc.nextInt();
					    pagamento.setPix(pix);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "4":
						System.out.println("Digite o n�mero do TED: ");
					    int TED = sc.nextInt();
					    pagamento.setPix(TED);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "5":
					    System.out.println("Digite o c�digo do boleto: ");
					    int boleto = sc.nextInt();
					    pagamento.setBoleto(boleto);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;


					default:
						break;
					}
				}
			}
		}
	}
}
