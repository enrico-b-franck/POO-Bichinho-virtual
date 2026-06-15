import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");

        System.out.println("Digite o nome do seu animal de estimação:");
        String nomePet = entrada.nextLine();

        Bicho pet = new Bicho(nomePet);// Cria um novo animal de estimação com o nome fornecido

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + pet.nome);
            System.out.println("2. Brincar com " + pet.nome);
            System.out.println("3. Verificar o status de " + pet.nome);
            System.out.println("4. Descansar");
            System.out.println("5. Ir ao Banheiro");
            System.out.println("6. Ir para o Banho");
            System.out.println("7. Sair");


            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.brincar();
                    break;
                case 3:
                    pet.verificarStatus();
                    break;
                case 4:
                    pet.descansar();
                    break;

                case 5:
                    pet.iraobanheiro();
                    break;

                case 6:
                    pet.tomarbanho();
                    break;
                case 7:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    return;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            pet.passarTempo(); // Simula o tempo que passa após cada ação
            if (!pet.vivo) {
                System.out.println("Fim de jogo!");
                continuar = false;
            }
        }

        entrada.close();
    }
}