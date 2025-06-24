        /** Objetivo: O usuário precisa acertar um número aleatório entre 1 a 100.
         * 
         * 1 - Criar um número aleatório (1 a 100)
         * 2 - Pedir para usuário o palpite.
         * 3 - Salvar as tentativas que foram erradas (contagem) - While até acertar.
         * 4 - Enquanto o usuário não acertar, exibir se o número alvo é maior ou menor que o palpite.
         * 5 - Exibir uma mensagem de sucesso se ele acertar, com contagem de tentativas.
         */



// Aqui estamos importando a classe scanner.
import java.util.Scanner;

// Aqui estamos importando a classe Random.
import java.util.Random;


public class GeradorDaSorte {
    public static void main(String[] args) {
        // Aqui está sendo ativado o scanner.
        Scanner scanner = new Scanner(System.in);

        // Aqui está sendo ativado o random.
        Random random = new Random();
        
        // Aqui estamos gerando o "número da sorte" em que o número max - 100 e min - 1.
        int numeroSorteado = random.nextInt(100) + 1; 

        // Aqui número de palpites inicia em 0.
        int palpite = 0;

        // Aqui número de tentativas inicia em 0.
        int tentativas = 0;

        // Aqui o loop do programa.
        while (palpite != numeroSorteado) {

            // Aqui o texto pedindo para o usuário seu palpite.
            System.out.print("Digite seu palpite: ");
            
            // Aqui coletando o palpite do usuário.
            palpite = scanner.nextInt();
            
            // Aqui somando o número de tentativas do usuário enquanto ele não acertar.
            tentativas++;
            
            //Aqui a condição do programa
            if(palpite < numeroSorteado){
                System.out.println("O número é maior, Tente novamente! " + "Tentativas: " + tentativas);
            }else if(palpite > numeroSorteado){
                System.out.println("O número é menor, Tente novamente! " + "Tentativas: " + tentativas);
            }else{
                System.out.println("Parabéns você acertou o número sorteado! " + " -> " + numeroSorteado);
                System.out.println("Total de tentativas: " + tentativas);
            }
        }

        
        scanner.close();
    }
}
