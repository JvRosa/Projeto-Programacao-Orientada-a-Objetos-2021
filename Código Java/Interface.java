package TFPOO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public interface Interface {


	void GravaArquivo();

	public static void AlteraArquivo(ArrayList<String> entrada) throws IOException {

		int i;


		try {
			FileWriter fw = new FileWriter("arquivo.txt");
			BufferedWriter conexao = new BufferedWriter(fw);
			for(i=0;i<entrada.size();i++) {

				conexao.write(entrada.get(i));
				conexao.newLine();
			}

			conexao.close();


		} catch (Exception e) {
			e.printStackTrace();
		}


	}



	public static void GravaArray(ArrayList<String> entrada) {

		entrada.clear();



		try {
			FileReader arq = new FileReader("arquivo.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();


			while (linha != null) {

				entrada.add(linha);

				linha = lerArq.readLine();



			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
	}

}