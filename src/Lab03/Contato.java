package Lab03;

/**
 * Classe Contato, serve para guardar cadastrar os 
 * contatos do usuario
 * @author Arthur Macena
 *
 */
public class Contato 
{
	/**
	 * Nome do contato
	 */
	private String nome;
	
	/**
	 * Sobrenome do contato
	 */
	private String sobrenome;
	
	/**
	 * Telefone do contato
	 */
	private String telefone;
	
	/**
	 * Constroi um contato a partir do seu nome, sobrenome e telefone
	 * e verifica a validade das variaveis
	 * @param nome e o nome do usuario
	 * @param sobrenome e o sobrenome do usuario
	 * @param telefone e o telefone do usario 
	 */
	public Contato( String nome, String sobrenome, String telefone)
	{
		if (nome == null)
		{
			throw new NullPointerException();
		}
		if ("".equals(nome.trim()))
		{
			throw new IllegalArgumentException();
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Verifica a igualdade de um contato, se
	 * seu nome e sobrenome forem iguais.
	 * @return true ou false, true - se for igual
	 * false - se for diferente
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null)
		{
			if(obj.getClass() == this.getClass())
			{
				Contato verificaIgual = (Contato)obj;
				if(this.nomeCompleto().equals(verificaIgual.nomeCompleto()))
				{
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * @return uma string com os dados do usuario
	 */
	public String toString()
	{
		return this.nome + " " + this.sobrenome + " - " + this.telefone + "\n"; 
	}
	/**
	 * 
	 * @return uma string apenas com o nome e sobrenome do usuario
	 */
	public String nomeCompleto()
	{
		return this.nome + " " + this.sobrenome;
	}
}
