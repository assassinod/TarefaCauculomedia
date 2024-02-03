import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Media(scan);
        scan.close();
    }

    public static void Media(Scanner scan) {
        System.out.print("Digite sua primeira nota: ");
        int nota1 = scan.nextInt();
        System.out.print("Digite sua segunda nota: ");
        int nota2 = scan.nextInt();
        System.out.print("Digite sua terceira nota: ");
        int nota3 = scan.nextInt();
        System.out.print("Digite sua quarta nota: ");
        int nota4 = scan.nextInt();

        int soma1 = (nota1 + nota2 + nota3 + nota4);
        int media1 = soma1 / 4;
        System.out.printf("Suas notas:%d,%d,%d,%d, %nResultado delas Somadas dão:%d %nResultado  da media é igual a:%d",
                nota1, nota2, nota3, nota4, soma1, media1);
    }

}
