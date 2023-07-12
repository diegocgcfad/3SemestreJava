import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o percentual: ");
		
		float salario_base = 1320.00f;	
	
		float percentual = valor.nextFloat();
		
		float salario_atualizado = ((salario_base / 100) * percentual) + salario_base;
		
		System.out.print("\nSalário base: " + salario_base);
		System.out.print("\nSalário atual: " + salario_atualizado);
	}
}
