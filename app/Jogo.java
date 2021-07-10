package app;

import java.util.Scanner;

import classes.MotorJogo;
import classes.Personagem;

public class Jogo {
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    MotorJogo motor = new MotorJogoDuelo();

    System.out.println("=================");
    System.out.println("DUELO DE TALENTOS");
    System.out.println("=================");

    System.out.println("\nEscolha seu personagem:");
    motor.obterPersonagens().forEach(personagem -> {
      System.out.println(personagem);
      System.out.println();
    });

    System.out.print("ID do personagem que quer jogar: ");
    int idPersonagem = sc.nextInt();
    sc.nextLine(); // Tira o ENTER q não foi lido ao digitar o número

    Personagem meuJogador = motor.obterPersonagem(idPersonagem);
    System.out.printf("Você escolheu %s.\nDigite ENTER para continuar.", meuJogador.getNome());
    sc.nextLine();

    Personagem adversario = motor.escolherAdversario();
    System.out.printf("\nSeu adversário será %s (%s).\n", adversario.getNome(), adversario.getTipo());

    Thread.sleep(1500);

    System.out.println("As apresentações vão começar.");

    Thread.sleep(2000);

    int resultadoMeuJogador = meuJogador.apresentarHabilidade();
    System.out.printf("\nVocê se apresentou e obteve nota %d.\n", resultadoMeuJogador);

    Thread.sleep(2500);

    System.out.println("\nAgora seu adversário vai se apresentar.");

    Thread.sleep(1500);

    int resultadoAdversario = adversario.apresentarHabilidade();
    System.out.printf("\nSeu adversário se apresentou e obteve nota %d.\n", resultadoAdversario);

    Thread.sleep(2000);

    System.out.println("\nCalculando o resultado...\n");

    Thread.sleep(3000);

    if(resultadoMeuJogador > resultadoAdversario) {
      System.out.println("PARABÉNS!! VOCÊ VENCEU O DESAFIO DE TALENTOS!!!");
    } else if (resultadoMeuJogador < resultadoAdversario) {
      System.out.println("Infelizmente não foi dessa vez que você venceu. Tente novamente.");
    } else {
      System.out.println("EMPATE!!");
    }

    sc.close();
  }
}
