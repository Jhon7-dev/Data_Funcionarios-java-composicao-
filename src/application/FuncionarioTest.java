package application;



import entities.Date;
import entities.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Date aniversario = new Date(7,24,1989);
		Date contratacao = new Date(3,6,2004);
		
		Funcionario func = new Funcionario("João ", "Victor",aniversario,contratacao);
		System.out.println(func);
		
	}
}
