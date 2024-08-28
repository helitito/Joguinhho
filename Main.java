import java.util.Random;
import java.util.Scanner;
public class Main {
    int rounds = 0;
    Scanner sc = new Scanner(System.in);
    String r;

    public void jogo(int rounds) {
        Random random = new Random();
        int a = random.nextInt(4);

        if (a == 0) {
            r = "cima";
        }
        if (a == 1) {
            r = "baixo";
        }
        if (a == 2) {
            r = "esquerda";
        }
        if (a == 3) {
            r = "direita";
        }
    }
        public void jogar() {
            System.out.println("Tente não olhar!");
            System.out.println("Escolha uma direção: Cima,Baixo,Esuerda ou Direita");
            String escolha = sc.nextLine();
            escolha = escolha.toLowerCase();

            if (r == escolha) {
                System.out.println("Voce olhou!");
                System.out.print("Voce durou um total de: " + rounds);
                System.out.print("rounds!");
            } else {
                rounds += 1;
                System.out.println("Vai de novo?");
                System.out.println("S/N");
                String b = sc.nextLine();
                b = b.toLowerCase();
                if (b.equals("s")) {
                    jogar();
                } else {
                    System.out.println("Vou entender isso como um não, Obrigado por jogar!");
                }
            }
        }

    }

