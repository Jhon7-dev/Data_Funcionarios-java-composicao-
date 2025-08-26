package entities;

public class Date {
	private int mes;
	private int dia;
	private int ano;
	
	public Date (int m,int d, int a) {
		ano = a;
		mes = checkMes(m);
		dia = checkDia(d);
		
	}
	private int checkMes(int m) {
		if(m > 0 && m <= 12) {
			return m;
		}else {
			System.out.printf("Mês Inválido (%d) set to 1",m);
			return 1;
		}
	}
	private int checkDia(int d) {
		int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(d > 0 && d <= diasPorMes[mes])
			return d;
		if(mes == 2 && d ==29 && ( ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0 ))) {
			return d;
		}
		System.out.printf("Dia inválido (%d) set to 1. " , d);
		return 1;
		
	}
	public String toString() {
		return String.format("%02d/%02d/%d",mes,dia,ano);
	}
}
