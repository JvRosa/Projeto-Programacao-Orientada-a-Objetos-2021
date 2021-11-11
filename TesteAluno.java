package TFPOO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TesteAluno {
	
	
	ArrayList <String> teste1 = new ArrayList<>();
	
	
	@Test
	public void test1() {
		
		int n;
		String nome;
		
		Aluno a = new Aluno("Avenida 6", "setor Bueno", "Goiânia","Goiás", "UFG", "Engenharia Civil", "EC", "Exatas", "Jon Snow", 20200233, 2020, 30112021 ,"Matriculado");
		a.GravaArquivo();
		Aluno.GravaArray(teste1);
		 
		
		n = teste1.size();

		nome = "Jon Snow";
		assertEquals(teste1.get(n-14),nome);
		nome = "20200233";
		assertEquals(teste1.get(n-13),nome);
		nome = "2020";
		assertEquals(teste1.get(n-12),nome);
		nome = "30112021";
		assertEquals(teste1.get(n-11),nome);
		nome = "Matriculado";
		assertEquals(teste1.get(n-10),nome);
		nome = "Engenharia Civil";
		assertEquals(teste1.get(n-9),nome);
		nome = "EC";
		assertEquals(teste1.get(n-8),nome);
		nome = "Exatas";
		assertEquals(teste1.get(n-7),nome);
		nome = "UFG";
		assertEquals(teste1.get(n-6),nome);
		nome = "Avenida 6";
		assertEquals(teste1.get(n-5),nome);
		nome = "setor Bueno";
		assertEquals(teste1.get(n-4),nome);
		nome = "Goiânia";
		assertEquals(teste1.get(n-3),nome);
		nome = "Goiás";
		
	
		System.out.println("Passou Teste 1 -  primeira faixa");
	
		teste1.clear();
	
	}
	
	@Test
	public void test2() {
		
		int n;
		String nome;
		
		Aluno a = new Aluno("Rua 8", "setor Jardim", "São Paulo","São Paulo", "USP", "Geografia", "GEO", "Ciências Naturais", "Jorge Mateus", 20210304, 2021, 11102021 ,"Trancado");
		a.GravaArquivo();
		Aluno.GravaArray(teste1);
		 
		
		n = teste1.size();
		
		nome = "Jorge Mateus";
		assertEquals(teste1.get(n-14),nome);
		nome = "20210304";
		assertEquals(teste1.get(n-13),nome);
		nome = "2021";
		assertEquals(teste1.get(n-12),nome);
		nome = "11102021";
		assertEquals(teste1.get(n-11),nome);
		nome = "Trancado";
		assertEquals(teste1.get(n-10),nome);
		nome = "Geografia";
		assertEquals(teste1.get(n-9),nome);
		nome = "GEO";
		assertEquals(teste1.get(n-8),nome);
		nome = "Ciências Naturais";
		assertEquals(teste1.get(n-7),nome);
		nome = "USP";
		assertEquals(teste1.get(n-6),nome);
		nome = "Rua 8";
		assertEquals(teste1.get(n-5),nome);
		nome = "setor Jardim";
		assertEquals(teste1.get(n-4),nome);
		nome = "São Paulo";
		assertEquals(teste1.get(n-3),nome);
		nome = "São Paulo";
		
	
		System.out.println("Passou Teste 2 - segunda faixa");
	
		teste1.clear();
	
	}
	
	@Test
	public void test3() {
		
		int n;
		String nome;
		
		Aluno a = new Aluno("Rua t-10", "setor Pinheiros", "Brasília","Distrito Federal", "UNB", "Direito", "DI", "Humanas", "Homer Simpsons", 20080976, 2008, 12082020 ,"Matriculado");
		a.GravaArquivo();
		Aluno.GravaArray(teste1);
		 
		
		n = teste1.size();
		
		nome = "Homer Simpsons";
		assertEquals(teste1.get(n-14),nome);
		nome = "20080976";
		assertEquals(teste1.get(n-13),nome);
		nome = "2008";
		assertEquals(teste1.get(n-12),nome);
		nome = "12082020";
		assertEquals(teste1.get(n-11),nome);
		nome = "Matriculado";
		assertEquals(teste1.get(n-10),nome);
		nome = "Direito";
		assertEquals(teste1.get(n-9),nome);
		nome = "DI";
		assertEquals(teste1.get(n-8),nome);
		nome = "Humanas";
		assertEquals(teste1.get(n-7),nome);
		nome = "UNB";
		assertEquals(teste1.get(n-6),nome);
		nome = "Rua t-10";
		assertEquals(teste1.get(n-5),nome);
		nome = "setor Pinheiros";
		assertEquals(teste1.get(n-4),nome);
		nome = "Brasília";
		assertEquals(teste1.get(n-3),nome);
		nome = "Distrito Federal";
		
	
		System.out.println("Passou Teste 3 - terceira faixa");
	
		teste1.clear();
	
	}
	
	

}
