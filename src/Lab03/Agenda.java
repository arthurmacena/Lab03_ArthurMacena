package Lab03;
/**
	 * Classe agenda, serve para armazenar os contatos.
	 * 
	 * @author Arthur Macena
	 *
	 */
public class Agenda 
{
	/**
	 * Array da classe Contatos, para que Agenda tenha varios Contatos armazenados.
	 */
	private Contato[] contatos;
	
	/**
	 * Construtor de Agenda, ele inicializa a quantidade de Contatos que a Agenda deve ter.
	 */
	public Agenda()
	{
		contatos = new Contato[100];
	}
	/**
	 * Esse metodo cadastra o contato, que for pedido pelo usuario
	 * 
	 * @param posicao e a posicao do contato na Agenda
	 * @param nome e o nome do contato
	 * @param sobrenome e o sobrenome do contato
	 * @param telefone e o  telefone do contato
	 * 
	 * @return true ou falso, Depende se os valores forem dentro do array
	 */
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone)
	{
		if (posicao > 100 || posicao < 1)
		{
			return false;
		}
		else
		{
			Contato contato = new Contato(nome, sobrenome,telefone);
			contatos[posicao-1] = contato;
			return true;
		}
	}	
	/**
	 * Esse metodo exibe o contato, de acordo com a posicao passada.
	 * 
	 * @param posicao e a posicao onde foi cadastrada o contato.
	 * 
	 * @return retorna uma string, dizendo o nome, sobrenome e o telefone do contato.
	 */
	public String exibiContato(int posicao)
	{
		return contatos[posicao-1].toString() + "\n";
	}
	
	/**
	 * Esse metodo lista todos os contatos cadastrados.
	 * @return retorna uma string, dizendo a posicao, o nome e o sobrenome de
	 * contato cadastrado.
	 */
	public String listaContatos()
	{ 
		String saida = "";
		for (int i = 0; i<100; i++)
		{
			if (contatos[i] != null)
				{
					saida += (i+1) + " - " + contatos[i].nomeCompleto() + "\n";
				}
			
		}
		return saida;
	}
	/**
	 * Esse metodo compara quando uma Agenda e comparada a outra Agenda
	 * e ve se os nomes e as posicoes dos Contatos da Agenda sao iguais.
	 * 
	 * @return true ou falso, se for igual em relacao as posicoes e nomes
	 * da true, caso contrario falso.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null)
		{
			if (obj.getClass() == this.getClass())
			{
				Agenda verificaIgual = (Agenda)obj;
				if (this.listaContatos().equals(verificaIgual.listaContatos()))
				{
					return true;
				}
			}
		}
		return false;
	}
}
