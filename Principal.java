package TFPOO;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {


	public static void main(String[] args) throws IOException {

		Aluno x;
		int a=0,b=0,i,u,j,t,g,p,l,d,usuario,matricula,ano,data;
		String c,f,nome,situacao,curso,sigla,area,faculdade,endereco,bairro,cidade,estado,senha,codigo;

		ArrayList <String> entrada = new ArrayList<>();
		
		Aluno.GravaArray(entrada);

		

		String[] optionsinp = new String[] {"Administrador", "Usu�rio", "Cancelar"};
		usuario = JOptionPane.showOptionDialog(null, "Administrador ou Usu�rio?", "Input",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, optionsinp, optionsinp[0]);

			if (usuario == 0) {

				senha = JOptionPane.showInputDialog(null, "Digite a senha:");

				codigo = "123456";
				if (senha.equals(codigo)) {

					while(a!=5) {

						String[] options = new String[]{"Inclus�o", "Exclus�o", "Altera��o", "Consulta", "Lista", "Cancelar"};
						a = JOptionPane.showOptionDialog(null, "Op��es", "Input",
								JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
								null, options, options[0]);

							if (a == 0) {

								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();
								JTextField field5 = new JTextField();
								JTextField field6 = new JTextField();
								JTextField field7 = new JTextField();
								JTextField field8 = new JTextField();
								JTextField field9 = new JTextField();
								JTextField field10 = new JTextField();
								JTextField field11 = new JTextField();
								JTextField field12 = new JTextField();
								JTextField field13 = new JTextField();

								Object[] fields = {
										"Nome:", field1,
										"Matr�cula:", field2,
										"Ano de ingresso:", field3,
										"Data(ddmmyy):", field4,
										"Situa��o:", field5,
										"Curso:", field6,
										"Sigla do curso:", field7,
										"�rea do curso:", field8,
										"Faculdade:", field9,
										"Endere�o:", field10,
										"Bairro:", field11,
										"Cidade:", field12,
										"Estado:", field13
								};

								int confirm = JOptionPane.showConfirmDialog(null, fields, "Input", JOptionPane.OK_CANCEL_OPTION);

								if (confirm == JOptionPane.OK_OPTION) {

									nome = field1.getText();
									String matriculatxt = field2.getText();
									matricula = Integer.parseInt(matriculatxt);
									String anotxt = field3.getText();
									ano = Integer.parseInt(anotxt);
									String datatxt = field4.getText();
									data = Integer.parseInt(datatxt);
									situacao = field5.getText();
									curso = field6.getText();
									sigla = field7.getText();
									area = field8.getText();
									faculdade = field9.getText();
									endereco = field10.getText();
									bairro = field11.getText();
									cidade = field12.getText();
									estado = field13.getText();

									x = new Aluno(endereco, bairro, cidade, estado, faculdade, curso, sigla, area, nome, matricula, ano, data, situacao);

									x.GravaArquivo();
									Aluno.GravaArray(entrada);

									JOptionPane.showMessageDialog(null, "Aluno adicionado");

								}
							}

							if (a == 1) {
								nome = JOptionPane.showInputDialog(null, "Excluir dados do aluno:");
								if (nome == null) {

								} else {

									Aluno.GravaArray(entrada);


									for (i = 0; i < entrada.size(); i++) {
										if (entrada.get(i).equals(nome)) {
											b++;
											for (t = 0; t <= 13; t++) entrada.remove(i);
											break;
										}
									}
									Aluno.AlteraArquivo(entrada);

									if(b == 0 ) {
										JOptionPane.showMessageDialog(null, "Aluno n�o existe");
										throw new Excecao("Aluno n�o existe");
									}
									else {
										b = 0;
										JOptionPane.showMessageDialog(null, "Aluno exclu�do");
									}
								}

							}

							if (a == 2) {
								String[] options2 = new String[]{"Aluno", "Faculdade", "Curso", "Cancelar"};
								d = JOptionPane.showOptionDialog(null, "Alterar dados de:", "Input",
										JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
										null, options2, options2[0]);

								if (d == 0) {
									f = JOptionPane.showInputDialog(null, "Nome do aluno:");

									for (i = 0; i < entrada.size(); i++) {
										if (entrada.get(i).equals(f)) {

											String[] options3 = new String[]{"Nome", "Matr�cula", "Ano de ingresso", "Situa��o", "Cancelar"};
											l = JOptionPane.showOptionDialog(null, "Alterar:", "Input",
													JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
													null, options3, options3[0]);

											if (l == 0) {
												c = JOptionPane.showInputDialog(null, "Novo nome:");
												entrada.set(i, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Nome alterado");
												}
											}

											if (l == 1) {
												c = JOptionPane.showInputDialog(null, "Nova Matr�cula:");
												entrada.set(i + 1, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Matr�cula alterada");
												}
											}

											if (l == 2) {
												c = JOptionPane.showInputDialog(null, "Novo ano:");
												entrada.set(i + 2, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Ano alterado");
												}
											}

											if (l == 3) {
												c = JOptionPane.showInputDialog(null, "Nova data:");
												entrada.set(i + 3, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Data alterada");
												}
											}
											break;
										}


									}

								}

								if (d == 1) {
									f = JOptionPane.showInputDialog(null, "Nome da Faculdade:");


									for (i = 0; i < entrada.size(); i++) {
										if (entrada.get(i).equals(f)) {
											String[] options3 = new String[]{"Nome", "Endere�o", "Cidade", "Estado","Bairro", "Cancelar"};
											p = JOptionPane.showOptionDialog(null, "Alterar:", "Input",
													JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
													null, options3, options3[0]);

											if (p == 0) {
												c = JOptionPane.showInputDialog(null, "Novo nome:");
												entrada.set(i, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Nome alterado");
												}
											}

											if (p == 1) {
												c = JOptionPane.showInputDialog(null, "Novo endere�o:");
												entrada.set(i + 1, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Endere�o alterado");
												}
											}

											if (p == 2) {
												c = JOptionPane.showInputDialog(null, "Nova cidade:");
												entrada.set(i + 3, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Cidade alterada");
												}
											}

											if (p == 3) {
												c = JOptionPane.showInputDialog(null, "Novo estado:");
												entrada.set(i + 4, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Estado alterado");
												}
											}

											if (p == 4) {
												c = JOptionPane.showInputDialog(null, "Novo bairro:");
												entrada.set(i + 2, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Bairro alterado");
												}
											}

											break;
										}

									}

								}

								if (d == 2) {
									f = JOptionPane.showInputDialog(null, "Curso:");
									for (i = 0; i < entrada.size(); i++) {
										if (entrada.get(i).equals(f)) {

											String[] options3 = new String[]{"Nome", "Sigla", "�rea", "Cancelar"};
											u = JOptionPane.showOptionDialog(null, "Alterar:", "Input",
													JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
													null, options3, options3[0]);

											if (u == 0) {
												c = JOptionPane.showInputDialog(null, "Novo nome:");
												entrada.set(i, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Nome alterado");
												}
											}

											if (u == 1) {
												c = JOptionPane.showInputDialog(null, "Nova sigla:");
												entrada.set(i + 1, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "Sigla alterada");
												}
											}

											if (u == 2) {
												c = JOptionPane.showInputDialog(null, "Nova �rea:");
												entrada.set(i + 2, c);
												if (c == null){

												} else {
													JOptionPane.showMessageDialog(null, "�rea alterada");
												}
											}
											break;
										}
									}
								}

								Aluno.AlteraArquivo(entrada);
							} //Final de Alterar
							if (a == 3) {
								c = JOptionPane.showInputDialog(null, "Nome do aluno:");
								for (i = 0; i < entrada.size(); i++) {
									if (entrada.get(i).equals(c)) {
											JOptionPane.showMessageDialog(null,
													"Nome: " + entrada.get(i) +
															"\nMatr�cula: " + entrada.get(i + 1) +
															"\nAno de ingresso: " + entrada.get(i + 2) +
															"\nData: " + entrada.get(i + 3) +
															"\nSitua��o: " + entrada.get(i + 4) +
															"\nCurso: " + entrada.get(i + 5) +
															"\nSigla: " + entrada.get(i + 6) +
															"\n�rea: " + entrada.get(i + 7) +
															"\nFaculdade: " + entrada.get(i + 8) +
															"\nEndere�o: " + entrada.get(i + 9) +
															"\nBairro: " + entrada.get(i + 10) +
															"\nCidade: " + entrada.get(i + 11) +
															"\nEstado: " + entrada.get(i + 12));
									}
								}
							} //Final Consultar
							if (a == 4) {

								for (i = 0; i < entrada.size(); i+=14)
									JOptionPane.showMessageDialog(null,
											"Nome: " + entrada.get(i) +
													"\nMatr�cula: " + entrada.get(i + 1) +
													"\nAno de ingresso: " + entrada.get(i + 2) +
													"\nData: " + entrada.get(i + 3) +
													"\nSitua��o: " + entrada.get(i + 4) +
													"\nCurso: " + entrada.get(i + 5) +
													"\nSigla: " + entrada.get(i + 6) +
													"\n�rea: " + entrada.get(i + 7) +
													"\nFaculdade: " + entrada.get(i + 8) +
													"\nEndere�o: " + entrada.get(i + 9) +
													"\nBairro: " + entrada.get(i + 10) +
													"\nCidade: " + entrada.get(i + 11) +
													"\nEstado: " + entrada.get(i + 12));
							}//Final lista
					}
				} else {
					JOptionPane.showMessageDialog(null, "Senha incorreta");
				}
				if(a == 5) {
					System.exit(0);
				}
			}//Final Administrador


			while(usuario!=4) {

				if (usuario == 1) {

					String[] options = new String[]{"Curso", "Faculdade", "�rea", "Localiza��o", "Cancelar"};
					g = JOptionPane.showOptionDialog(null, "Procurar por:", "Input",
							JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
							null, options, options[0]);

					if (g == 0) {
						curso = JOptionPane.showInputDialog(null, "Insira o Curso:");
						for (i = 0; i < entrada.size(); i++) {
							if (entrada.get(i).equals(curso)) {
								for (t = 0; t < entrada.size(); t++) {
									j = t;
									if (entrada.get(t).equals(curso)) {

										JOptionPane.showMessageDialog(null,
												"Curso: " + entrada.get(i) +
														"\nSigla: " + entrada.get(i + 1) +
														"\n�rea: " + entrada.get(i + 2) +
														"\n\nAluno: " +
														"\n\nNome: " + entrada.get(j - 5) +
														"\nMatr�cula: " + entrada.get(j - 4) +
														"\nAno de ingresso: " + entrada.get(j - 3) +
														"\nData: " + entrada.get(j - 2) +
														"\nSitua��o: " + entrada.get(j - 1));
									}
								}

								break;
							}
						}
					}

					if (g == 1) {
						faculdade = JOptionPane.showInputDialog(null, "Insira a Faculdade:");
						for (i = 0; i < entrada.size(); i++) {
							if (entrada.get(i).equals(faculdade)) {
								for (t = 0; t < entrada.size(); t++) {
									j = t;
									if (entrada.get(t).equals(faculdade)) {

										JOptionPane.showMessageDialog(null,
												"Faculdade: " + entrada.get(i) +
														"\nEndere�o: " + entrada.get(i + 1) +
														"\nBairro: " + entrada.get(i + 2) +
														"\nCidade: " + entrada.get(i + 3) +
														"\nEstado: " + entrada.get(i + 4) +
														"\n\nAluno:" +
														"\n\nNome: " + entrada.get(j - 8) +
														"\nMatr�cula: " + entrada.get(j - 7) +
														"\nAno de ingresso: " + entrada.get(j - 6) +
														"\nData:" + entrada.get(j - 5) +
														"\nSitua��o: " + entrada.get(j - 4) +
														"\nCurso: " + entrada.get(j - 3) +
														"\nSigla do curso: " + entrada.get(j - 2) +
														"\n�rea do curso: " + entrada.get(j - 1));

									}
								}

								break;
							}
						}
					}


					if (g == 2) {
						area = JOptionPane.showInputDialog(null, "Insira a �rea:");
						for (i = 0; i < entrada.size(); i++) {
							if (entrada.get(i).equals(area)) {
								for (t = 0; t < entrada.size(); t++) {
									j = t;
									if (entrada.get(t).equals(area)) {

										JOptionPane.showMessageDialog(null,
												"�rea: " + entrada.get(i) +
														"\n\nAluno: " +
														"\n\nNome: " + entrada.get(j - 7) +
														"\nMatr�cula: " + entrada.get(j - 6) +
														"\nAno de ingresso: " + entrada.get(j - 5) +
														"\nData: " + entrada.get(j - 4) +
														"\nSitua��o: " + entrada.get(j - 3) +
														"\nCurso: " + entrada.get(j - 2) +
														"\nSigla do curso: " + entrada.get(j - 2) +
														"\nFaculdade: " + entrada.get(j + 1));

									}
								}

								break;
							}
						}
					}

					if (g == 3) {

						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();

						Object[] fields = {
								"Estado:", field1,
								"Cidade:", field2
						};

						JOptionPane.showConfirmDialog(null, fields, "Input", JOptionPane.OK_CANCEL_OPTION);

						estado = field1.getText();
						cidade = field2.getText();

						for (i = 0; i < entrada.size(); i++) {
							j = i;
							if (entrada.get(j).equals(estado) && entrada.get(j - 1).equals(cidade)) {

								for (t = 0; t < entrada.size(); t++) {
									j = t;
									if ((entrada.get(j).equals(estado) && entrada.get(j - 1).equals(cidade))) {
										JOptionPane.showMessageDialog(null,
												"Estado: " + entrada.get(j - 1) +
														"\nCidade: " + entrada.get(j) +
														"\n\nAluno:" +
														"\n\nNome: " + entrada.get(j - 12) +
														"\nMatr�cula: " + entrada.get(j - 11) +
														"\nAno de ingresso: " + entrada.get(j - 10) +
														"\nData:" + entrada.get(j - 9) +
														"\nSitua��o: " + entrada.get(j - 8) +
														"\nCurso: " + entrada.get(j - 7) +
														"\nSigla do Curso: " + entrada.get(j - 6) +
														"\n�rea do Curso: " + entrada.get(j - 5));

									}
								}

								break;
							}
						}
					}
					if(g == 4) {
						System.exit(0);
					}
				} //Final Usu�rio
			}
	
	}
}