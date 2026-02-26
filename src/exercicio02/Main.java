package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo = paciente.frequenciaAlvo();

        System.out.print("Nome --> ");
        paciente.nome = sc.nextLine();
        System.out.print("Idade --> ");
        paciente.idade = sc.nextInt();

        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Frequência máxima: " + paciente.frequenciaMaxima());
        System.out.println("Frequência alvo [" + alvo[0] + ", " + alvo[1] + "]");

    }
}
