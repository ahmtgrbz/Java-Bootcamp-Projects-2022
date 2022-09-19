package SwitchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Ýdare Eder : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü : Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
