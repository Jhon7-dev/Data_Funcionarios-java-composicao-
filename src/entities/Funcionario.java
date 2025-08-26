package entities;

public class Funcionario {
	private String primeiroNome;
	private String segundoNome;
	private Date aniversarioData;
	private Date dataContratacao;
 
	public Funcionario(String primeiro, String segundo, Date aniversario, Date Contratacao) {
	
		this.primeiroNome = primeiro ;
		this.segundoNome = segundo ;
		this.aniversarioData = aniversario ;
		this.dataContratacao =  Contratacao;
	}
	@Override
	public String toString() {
		return "Funcionario \n"
				+ "Nome: " + primeiroNome +"\n"
				+ "Sobrenome: " + segundoNome + "\n"+
				  "aniversario: " + aniversarioData +"\n"+ 
				  "dataContratacao: " + dataContratacao;
	}
	
	
	
}
