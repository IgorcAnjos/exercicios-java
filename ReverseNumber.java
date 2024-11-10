import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		print("Escreva um numero entre 100 e 999");
		int num = readInt(scan);
		if (num < 100 || num > 999) {
			print("numero inválido!");
			return;
		}

		String middle = "";
		middle += num % 10;
		num /= 10;
		middle += num % 10;
		num /= 10;
		middle += num % 10;
		print("O seu reverso é: " + middle);

	}

	public static int readInt(Scanner scan) {
		while (!scan.hasNextInt()) {
			System.out.println("Digite um número válido.");
			scan.next();
		}
		return scan.nextInt();
	}

	public static void print(String txt) {
		System.out.println(txt);
	}
}
