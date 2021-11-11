package TFPOO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Localizacao{

	protected String endereco;
	protected String bairro;
	protected String cidade;
	protected String estado;

	public Localizacao(String endereco, String bairro, String cidade,String estado) {
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	String getEndereco() {
		
		return this.endereco;
		
	}
	
	void setBairro(String bairro) {
		this.bairro = bairro;
	}
	String getBairro() {
		
		return this.bairro;
		
	}
	
	void setCidade(String cidade) {
		this.cidade = cidade;
	}
	String getCidade() {
		
		return this.cidade;
		
	}
	
	void setEstado(String estado) {
		this.estado = estado;
	}
	String getEstado() {
		
		return this.estado;
		
	}
	
	
	public void GravaArquivo() {
		
		
		 try {
			    FileWriter fw = new FileWriter("arquivo.txt",true);
			    BufferedWriter conexao = new BufferedWriter(fw);
				
				
				conexao.write(this.endereco);
				conexao.newLine();
				conexao.write(this.bairro);
				conexao.newLine();
				conexao.write(this.cidade);
				conexao.newLine();
				conexao.write(this.estado);
				conexao.newLine();
				conexao.write("\n");
			
				conexao.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
	
		
	}
	
	
}