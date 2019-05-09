package Lab03_Tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab03.Agenda;

/**
 * Classe de teste para Agenda.
 * 
 * @author Arthur Macena
 *
 */
class AgendaTeste {
	
	/**
	 * Cria uma variavel Agenda para os testes
	 */
	private Agenda agendaBasica;
	
	/**
	 * Inicializa a variavel Agenda, antes de cada metodo.
	 */
	@BeforeEach
	void criaNovo()
	{
		agendaBasica = new Agenda();
	}
	
	/**
	 * Testa o cadastro de 1 contato na Agenda
	 */
	@Test
	void testeCadastro()
	{
		assertTrue(agendaBasica.cadastraContato(1, "Matheus", "Gaudencio", "123"));	
	}
	
	/**
	 * Testa a sobrescricao de 1 contato.
	 */
	@Test
	void testPosicaoExistente()
	{
		agendaBasica.cadastraContato(1, "Matheus", "Gaudencio", "123");
		assertTrue(agendaBasica.cadastraContato(1, "M", "G", "123556"));
	}
	
	/**
	 * Testa posicoes invalidas no cadastro em Agenda
	 */
	@Test
	void testePosicaoInvalida()
	{
		assertFalse(agendaBasica.cadastraContato(101, "Matheus", "Gaudencio", "123"));
		assertFalse(agendaBasica.cadastraContato(0, "Matheus", "Gaudencio", "123"));
		
	}
	
	/**
	 * Testa o Equals de Agenda em casos verdadeiros
	 */
	@Test
	void testeEqualsTrue()
	{
		Agenda verificaIgual = new Agenda();
		agendaBasica.cadastraContato(1, "Matheus", "Gaudencio", "123");
		agendaBasica.cadastraContato(4, "Arthur", "Macena", "12356");
		verificaIgual.cadastraContato(1, "Matheus", "Gaudencio", "123");
		verificaIgual.cadastraContato(4, "Arthur", "Macena", "12356");
		assertTrue(agendaBasica.equals(verificaIgual));
	}
	
	/**
	 * Testa o Equals de Agenda em casos falsos
	 */
	@Test
	void testeEqualsFalse()
	{
		Agenda verificaIgual = new Agenda();
		agendaBasica.cadastraContato(4, "Matheus", "Gaudencio", "123");
		agendaBasica.cadastraContato(1, "Arthur", "Macena", "12356");
		verificaIgual.cadastraContato(1, "Matheus", "Gaudencio", "123");
		verificaIgual.cadastraContato(4, "Arthur", "Macena", "12356");
		assertFalse(agendaBasica.equals(verificaIgual));

	}
}
