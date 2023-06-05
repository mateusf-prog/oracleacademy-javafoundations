package Jfo3;
import java.util.Scanner;

public class Jfo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar entradas do usuário
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite uma idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do sc

        System.out.print("Digite uma cidade: ");
        String cidade = sc.nextLine();

        // Preencher a história com as entradas do usuário
        String historia = "Uma vez, em uma cidade chamada " + cidade + ", viveu um(a) jovem chamado(a) " + nome + ". ";
        historia += "Com apenas " + idade + " anos de idade, " + nome + " embarcou em uma incrível aventura que mudaria sua vida para sempre.";

        // Exibir a história resultante
        System.out.println("História:");
        System.out.println(historia);

        sc.close();
    }
}
