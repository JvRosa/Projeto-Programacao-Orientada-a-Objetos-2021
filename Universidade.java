package TFPOO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Universidade extends Localizacao{
	
	protected String nome_uni;
	
	Universidade(String endereco, String bairro, String cidade,String estado, String nome_uni) {
		super(endereco,bairro,cidade,estado);
		this.nome_uni = nome_uni;
		
	}
	
	
	void setNome_uni(String nome_uni) {
		
		this.nome_uni = nome_uni;
		
	}
	
	String getNome_uni() {
		
		return this.nome_uni;
	}
	
	
	public void GravaArquivo() {
		
		
		 try {
			    FileWriter fw = new FileWriter("arquivo.txt",true);
			    BufferedWriter conexao = new BufferedWriter(fw);
				
				
				conexao.write(this.nome_uni);
				conexao.newLine();
			
				conexao.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 
		 super.GravaArquivo();
		
	
		
	}
	
	
}
