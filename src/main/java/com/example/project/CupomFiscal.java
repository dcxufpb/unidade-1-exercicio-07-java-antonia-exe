package com.example.project;

public class CupomFiscal {
	
	private static boolean isEmpty(String str){
		if(str == null) return true;
		int spaceCount = str.length() - str.replace(".", "").length();
		return (spaceCount == str.length());
	}

	private static String ENDLN = System.lineSeparator();

	public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento,
			String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,
			String inscricaoEstadual) {
			
					if(isEmpty(nomeLoja)){
						throw new RuntimeException("O campo nome da loja é obrigatório");
					}
			
					if(isEmpty(logradouro)){
						throw new RuntimeException("O campo logradouro do endereço é obrigatório");
					}
			
					String numero1 = numero + "";
					if(numero == 0){
						numero1 = "s/n";
					}
			
					if(isEmpty(municipio)){
						throw new RuntimeException("O campo município do endereço é obrigatório");
					}
					
					if(isEmpty(estado)){
						throw new RuntimeException("O campo estado do endereço é obrigatório");
					}
			
					if(isEmpty(cnpj)){
						throw new RuntimeException("O campo CNPJ da loja é obrigatório");
					}
			
					if(isEmpty(inscricaoEstadual)){
						throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
					}
			
					String linha2 = logradouro + ", " + numero1;
					if (! isEmpty(complemento)){
						linha2 += " " + complemento;
					}
					
					String linha3 = "";
					if (! isEmpty(bairro)){
					  linha3 += bairro + " - ";
					}
					linha3 += municipio + " - " + estado;
				  
					String linha4 = "";
					if (! isEmpty(cep)){
					  linha4 = "CEP:" + cep;
					}
					if (! isEmpty(telefone)){
					  if (! isEmpty(linha4)){
						linha4 += " ";
					  }
					  linha4 += "Tel " + telefone;
					}
					if (! isEmpty(linha4)){
					  linha4 += ENDLN;
					}
				  
					String linha5 = "";
					if (! isEmpty(observacao)){
					  linha5 += observacao;
					}
				  
					String output = nomeLoja + ENDLN;
					output += linha2 + ENDLN;
					output += linha3 + ENDLN;
					output += linha4;
					output += linha5 + ENDLN;
					output += "CNPJ: " + cnpj + ENDLN;
					output += "IE: " + inscricaoEstadual + ENDLN;
				  
					return output;
				  }
	}

