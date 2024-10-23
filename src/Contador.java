import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Informe o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Informe o segundo parametro");
        int parametroDois = scanner.nextInt();

        try {
            // chamando o metodo contendo a logica de contagem

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // imrpimir a mensagem: O segundo parametro deve ser maior que o primeiro
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm e MAIOR que parametroDOIS e lancar a excecao
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}