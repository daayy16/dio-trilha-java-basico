import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o modelo do iPhone?");
        String model = scanner.nextLine();

        IPhone iphone = new IPhone(model);

        while (true) {
            System.out.println("**Menu " + iphone.getModelo() + "**");
            System.out.println("Escolha um app:");
            System.out.println("1 - Music Player");
            System.out.println("2 - Phone");
            System.out.println("3 - Navegador");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    AppMusicPlayer musicPlayer = (AppMusicPlayer) iphone.abrirApp("musicPlayer");
                    System.out.println("1 - Tocar\n2 - Pausar\n3 - Selecionar Música");
                    int musicOp = scanner.nextInt();
                    scanner.nextLine();
                    switch (musicOp) {
                        case 1: musicPlayer.tocar(); break;
                        case 2: musicPlayer.pausar(); break;
                        case 3:
                            System.out.print("Nome da música: ");
                            String musica = scanner.nextLine();
                            musicPlayer.selecionarMusica(musica);
                            break;
                    }
                    break;

                case 2:
                    AppPhone phone = (AppPhone) iphone.abrirApp("phone");
                    System.out.println("1 - Ligar\n2 - Atender ligação\n3 - Correio de voz");
                    int phoneOp = scanner.nextInt();
                    scanner.nextLine();
                    switch (phoneOp) {
                        case 1:
                            System.out.print("Número para ligar: ");
                            String numero = scanner.nextLine();
                            phone.ligar(numero);
                            break;
                        case 2: phone.atender(); break;
                        case 3: phone.iniciarCorreioVoz(); break;
                    }
                    break;

                case 3:
                    AppNavegador navegador = (AppNavegador) iphone.abrirApp("navegador");
                    System.out.println("1 - Exibir página\n2 - Nova aba\n3 - Atualizar página");
                    int navOp = scanner.nextInt();
                    scanner.nextLine();
                    switch (navOp) {
                        case 1:
                            System.out.print("Url da página: ");
                            String url = scanner.nextLine();
                            navegador.exibirPagina(url);
                            break;
                        case 2: navegador.adicionarNovaAba(); break;
                        case 3: navegador.atualizarPagina(); break;
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
