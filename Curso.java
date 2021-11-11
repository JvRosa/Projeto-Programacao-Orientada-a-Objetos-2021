package TFPOO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Curso extends Universidade{

	protected String nome_curso;
	protected String sigla;
	protected String area;
	Universidade universidade;

	Curso(String endereco, String bairro, String cidade,String estado, String nome_uni, String nome_curso, String sigla, String area) {
		super(endereco,bairro,cidade,estado,nome_uni);
		this.nome_curso = nome_curso;
		this.sigla = sigla;
		this.area = area;
		
	}

	
	
	void setNome_curso(String nome_curso) {
		
		this.nome_curso = nome_curso;
	}
	
	String getNome_curso() {
		
		return this.nome_curso;
	}
	
	void setSigla(String sigla) {
		
		this.sigla = sigla;
	}
	
	String getSigla() {
		
		return this.sigla;
	}
	
	void setArea(String area) {
		
		this.area = area;
	}
	
	String getArea() {	
		
		return this.area;
	}

	public void GravaArquivo() {
		
		
		 try {
			    FileWriter fw = new FileWriter("arquivo.txt",true);
			    BufferedWriter conexao = new BufferedWriter(fw);
				
				
				conexao.write(this.nome_curso);
				conexao.newLine();
				conexao.write(this.sigla);
				conexao.newLine();
				conexao.write(this.area);
				conexao.newLine();
			
				conexao.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 
		 super.GravaArquivo();
		
	
		
	}


}
