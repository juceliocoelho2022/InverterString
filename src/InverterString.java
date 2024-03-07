import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();

        String stringInvertida = inverterString(stringOriginal);

        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }

    public static String inverterString(String string) {

        char[] caracteres = string.toCharArray();


        int inicio = 0;
        int fim = caracteres.length - 1;


        while (inicio < fim) {

            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;


            inicio++;
            fim--;
        }


        String stringInvertida = new String(caracteres);
        return stringInvertida;
    }
}

