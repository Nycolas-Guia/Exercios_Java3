import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind;
        do {
            System.out.println("Quantos números serão digitados? ");
            ind = Integer.parseInt(sc.next());
            if (ind < 1 || ind > 10) {
                System.out.println("Quantidade inválida, insira um número positivo até 10!");
            }
        } while (ind < 1 || ind > 10);

        int num[] = new int[ind];
        int numNg[] = new int[ind];
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Digite o %d número: ", i + 1);
            num[i] = Integer.parseInt(sc.next());
            if (num[i] < 0) {
                numNg[i] = num[i];
            }
        }

        System.out.println("Números Negativos:");
        for (int i = 0; i < num.length; i++) {
            if (numNg[i] < 0) {
                System.out.println(numNg[i]);
            }
        }
        sc.close();
    }
}
