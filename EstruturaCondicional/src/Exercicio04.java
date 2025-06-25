import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao = 0;
        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        sc.close();
    }
}
