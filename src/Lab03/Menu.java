package Lab03;

import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		char a;
		Agenda agenda = new Agenda();
		
		
		do
		{
			System.out.println("(C)adastrar Contatos");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air");
			
			System.out.println();
			
			System.out.print("Opcao> ");
			a = sc.next().charAt(0);
			
			if (a == 'C')
			{
				int p;
				String nome;
				String sobrenome;
				String telefone;
				System.out.print("Posicao: ");	
				p = sc.nextInt();
				sc.nextLine();
				if (p<1 || p>100 )
				{
					System.out.println("Posicao Invalida!");
					continue;
				}
				System.out.print("Nome:  ");
				nome = sc.nextLine();
				System.out.print("Sobrenome: ");
				sobrenome = sc.nextLine();
				System.out.print("Telefone: ");
				telefone = sc.nextLine();
				
				if(agenda.cadastraContato((p), nome, sobrenome, telefone))
				{	
					System.out.println("CADASTRO REALIZADO!");
					System.out.println();
				}
				else
				{
					System.out.println("CADASTRO NAOREALIZADO!");
					System.out.println();
				}
			}
			else if (a == 'L')
			{
				System.out.println(agenda.listaContatos());
			}
			else if (a == 'E')
			{
				int p;
				System.out.print("Contato> ");
				p = sc.nextInt();
				System.out.printf(agenda.exibiContato(p));
			}
			else if (a == 'S')
			{
				break;
			}
			else
			{
				System.out.println("OPCAO INVALIDA!");
				System.out.println();
			}
			
		}while(true);
		sc.close();
	}
}