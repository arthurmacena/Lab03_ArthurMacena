package Lab03_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab03.Contato;

/**
 * Classe de teste para Contato.
 * 
 * @author Arthur Macena
 *
 */
class ContatoTeste {
	
	/**
	 * Cria uma variavel do tipo contato
	 */
	private Contato contatoBasico;
	
	/**
	 * Inicializa um contato, toda vez antes de um teste
	 */
	@BeforeEach
	void criaNovo()
	{
		contatoBasico = new Contato("Matheus", "Gaudencio", "123");
	}
	/**
	 *Teste para a realizacao do cadastro. 
	 */
	@Test
	void testeContato()
	{
		String msg = "Esperando obter nome completo";
		assertEquals("Matheus Gaudencio", contatoBasico.nomeCompleto(), msg);
	}
	/**
	 * Testa o equals da classe contato
	 */
	@Test
	void testeEquals() 
	{
		Contato outro = new Contato("Matheus", "Gaudencio", "1234");
		assertTrue(outro.equals(contatoBasico));
	}
	/**
	 * Testa a excessao lancada sobre o nome ser null.
	 */
	@Test
	void testeNomeNull()
	{
		try
		{
			contatoBasico = new Contato(null, "Gaudencio", "123");
			fail("Esperava erro ao passar nome nulo");
		}catch(NullPointerException npe)
		{
			
		}

	}
	/**
	 * Testa a excessao lancada sobre o nome ser String vazia
	 */
	@Test
	void testeNomeVazio()
	{
		try
		{
			contatoBasico = new Contato ("       ", "Gaudencio", "122345");
			fail("Esperava erro ao passar nome vazio");
		}catch(IllegalArgumentException iae)
		{
		}
	}
}
