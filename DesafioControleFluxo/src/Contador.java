import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            contar(0, 100);
            contar(40, 20);

        }catch (ParametrosInvalidosException exception) {
            System.err.println("Erro: " + exception);
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            } else if (parametroUm == parametroDois) {
                throw new ParametrosInvalidosException("Os números devem ser diferentes para apresentar a interação.");
            }
        int contagem = parametroDois - parametroUm;
        for(int indice = 1; indice <= contagem; indice++){
            System.out.println("Imprimindo o número " + indice);
        }
        System.out.println("----------FIM----------");
    }
}