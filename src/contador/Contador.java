package contador;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int parametroUm = sc.nextInt();
		int parametroDois = sc.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
		} else {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.print(i + " ");

			}
		}
	}
}
