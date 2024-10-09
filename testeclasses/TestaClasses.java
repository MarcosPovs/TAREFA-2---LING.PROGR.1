
import java.util.Scanner;

public class TestaClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animais animais = new Animais("Leão", "Carnivoro", "M");


        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Testar Animais");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Testando Animais ---");
                    animais.acordar();
                    animais.fome();
                    animais.filhotes();
                    break;
                case 2:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
