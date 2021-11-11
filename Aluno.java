package TFPOO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Aluno extends Curso implements Interface {

	protected String nome_aluno;
	protected int matricula;
	protected int ano_ingresso;
	protected int data;
	protected String situacao;

	Aluno(String endereco, String bairro, String cidade,String estado, String nome_uni, String nome_curso, String sigla, String area, String nome_aluno, int matricula, int ano_ingresso, int data,String situacao) {
		super(endereco,bairro,cidade,estado,nome_uni,nome_curso,sigla,area);
		this.nome_aluno = nome_aluno;
		this.matricula = matricula;
		this.data = data;
		this.ano_ingresso = ano_ingresso;
		this.situacao = situacao;
	}
	
	void setNome_aluno(String nome_aluno) {
		
		this.nome_aluno = nome_aluno;
	}
	
	String getNome_aluno() {
		
		return this.nome_aluno;
	}
	
	void setMatricula(int matricula) {
		
		this.matricula = matricula;
	}
	
	int getMatricula() {	
		
		return this.matricula;
	}
	
	void setAno_ingresso(int ano_ingresso) {
		
		this.ano_ingresso = ano_ingresso;
	}
	
	int getAno_ingresso() {	
		
		return this.ano_ingresso;
	}
	
	void setData(int data) {
		
		this.data = data;
	}
	
	int getData() {	
		
		return this.data;
	}
	
	void setSituacao(String situacao) {
		
		this.situacao = situacao;
	}
	
	String getSituacao() {
		
		return this.situacao;
	}
	
	public void GravaArquivo(){
		
		String m = String.valueOf(this.matricula);
		String a = String.valueOf(this.ano_ingresso);
		String d = String.valueOf(this.data);
		
		
		 try {
			    FileWriter fw = new FileWriter("arquivo.txt",true);
			    BufferedWriter conexao = new BufferedWriter(fw);
				
				
				conexao.write(this.nome_aluno);
				conexao.newLine();
				conexao.write(m);
				conexao.newLine();
				conexao.write(a);
				conexao.newLine();
				conexao.write(d);
				conexao.newLine();
				conexao.write(this.situacao);
				conexao.newLine();

				conexao.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 
		 super.GravaArquivo();
	}
	
	public static void AlteraArquivo(ArrayList<String> entrada) throws IOException {
		
		Interface.AlteraArquivo(entrada);
	}
	public static void GravaArray(ArrayList<String> entrada) {
		
		Interface.GravaArray(entrada);
	
	
	}

	
		
	
	

	

}
